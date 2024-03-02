package tekpro.testcylinder;

public class TestCylinder {

    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1: \n"
                + " radius=" + c1.getRadius() + "\n"
                + " height=" + c1.getHeight() + "\n"
                + " base area=" + c1.getArea() + "\n"
                + " volume=" + c1.getVolume() + "\n"
                + " to String" + c1.toString() + "\n");

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder 2: \n"
                + " radius=" + c2.getRadius() + "\n"
                + " height=" + c2.getHeight() + "\n"
                + " base area=" + c2.getArea() + "\n"
                + " volume=" + c2.getVolume() + "\n"
                + " to String" + c2.toString() + "\n");

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0,10.0);
        System.out.println("Cylinder 3: \n"
                + " radius=" + c3.getRadius() + "\n"
                + " height=" + c3.getHeight() + "\n"
                + " base area=" + c3.getArea() + "\n"
                + " volume=" + c3.getVolume() + "\n"
                + " to String" + c3.toString() + "\n");

        shape shape1 = new shape();
        System.out.println(shape1);

        shape shape2 = new shape("red", false);
        System.out.println(shape2+ "\n");

        // Testing Circle class
        Circle circle1 = new Circle();
        System.out.println(circle1+ "\n");

        Circle circle2 = new Circle(2.5, "blue", true);
        System.out.println(circle2);
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Perimeter of circle2: " + circle2.getPerimeter()+ "\n");

        // Testing Rectangle class
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1+ "\n");

        Rectangle rectangle2 = new Rectangle(3.0, 4.0, "yellow", true);
        System.out.println(rectangle2);
        System.out.println("Area of rectangle2: " + rectangle2.getArea());
        System.out.println("Perimeter of rectangle2: " + rectangle2.getPerimeter()+ "\n");

        // Testing Square class
        Square square1 = new Square(5.0);
        System.out.println(square1);
        System.out.println("Area of square1: " + square1.getArea());
        System.out.println("Perimeter of square1: " + square1.getPerimeter()+ "\n");

        // Modifying square1
        square1.setWidth(10.0);
        System.out.println(square1);
        System.out.println("Area of square1 after modification: " + square1.getArea());
        System.out.println("Perimeter of square1 after modification: " + square1.getPerimeter()+ "\n");
    }
}
