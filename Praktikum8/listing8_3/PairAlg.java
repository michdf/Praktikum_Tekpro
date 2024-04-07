package listing8_3;

import listing8_1.Pair;

public class PairAlg {
    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}
