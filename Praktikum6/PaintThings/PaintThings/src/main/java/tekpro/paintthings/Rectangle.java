package  tekpro.paintthings;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public String toString() {
        return super.toString() + " of width " + width + " and length " + length;
    }

}
