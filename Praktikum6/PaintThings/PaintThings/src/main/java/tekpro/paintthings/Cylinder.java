package tekpro.paintthings;

public class Cylinder extends Shape{
    private double height;
    private double radius;

    public Cylinder(double height, double radius){
        super("Cylinder");
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius * height;
    }

    public String toString(){
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
