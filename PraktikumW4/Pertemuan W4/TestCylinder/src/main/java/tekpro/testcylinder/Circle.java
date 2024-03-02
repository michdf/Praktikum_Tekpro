package tekpro.testcylinder;

public class Circle extends shape {
    private double radius;
    private String color;

    // Constructors (overloaded)
    /**
     * Constructs a Circle instance with default value for radius and color
     */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Constructs a Circle instance with the given radius and default color
     */
    public Circle(double r, String color , boolean filled) { // 2nd constructor
        super(color, filled);
        this.radius = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns the radius
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the area of this Circle instance
     * @return 
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    /**
     * Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?]
     */
    public String toString() {
        return " A Circle with radius : " + radius +", which is a subclass of" + super.toString();
    }
}
