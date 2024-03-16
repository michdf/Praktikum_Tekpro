package tekpro.paintthings;

abstract public class Shape {
    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double getArea();

    public String toString(){
        return shapeName;
    }
} 

