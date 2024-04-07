package listing8_5;

import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;

class Formatter {
    private Map<TypeLiteral<?>, Function<?, String>> rules = new HashMap<>();

    /**
     * Add a formatting rule to this formatter.
     * 
     * @param type             the type to which this rule applies
     * @param formatterForType the function that formats objects of this type
     */
    public <T> void forType(TypeLiteral<T> type, Function<T, String> formatterForType) {
        rules.put(type, formatterForType);
    }

    /**
     * Formats all fields of an object using the rules of this formatter.
     * 
     * @param obj an object
     * @return a string with all field names and formatted values
     */
    public String formatFields(Object obj)
            throws IllegalArgumentException, IllegalAccessException {
        var result = new StringBuilder();
        for (Field f : obj.getClass().getDeclaredFields()) {
            result.append(f.getName());
            result.append("=");
            f.setAccessible(true);
            Function<?, String> formatterForType = rules.get(TypeLiteral.of(f.getGenericType()));
            if (formatterForType != null) {
                // formatterForType has parameter type ?. Nothing can be passed to its apply
                // method. Cast makes the parameter type to Object so we can invoke it.
                @SuppressWarnings("unchecked")
                Function<Object, String> objectFormatter = (Function<Object, String>) formatterForType;
                result.append(objectFormatter.apply(f.get(obj)));
            } else
                result.append(f.get(obj).toString());
            result.append("\n");
        }
        return result.toString();
    }
}
