package tekpro.testcylinder;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
    
    public double getSide(){
        return getWidth();
    }
    
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }
    
    @Override
    public void setLength(double side){
        setSide(side);
    }    

    @Override
    public String toString() {
        return "A Square with side = " + getWidth() + ", which is a subclass of " + super.toString();
    }
    
    @Override
    public double getArea(){
        return super.getArea();
    }
    
    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }
    
}
