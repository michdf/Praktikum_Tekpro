package Cohesion.HighCohesion;

public class main {
   public static void main(String[] args) {
         RectangleAreaCalculator rectangleAreaCalculator = new RectangleAreaCalculator();
         System.out.println("Area of rectangle: " + rectangleAreaCalculator.calculateArea(5, 10));
    
         SumCalculator sumCalculator = new SumCalculator();
         System.out.println("Sum of 5 and 10: " + sumCalculator.calculateSum(5, 10));
    
         MessagePrinter messagePrinter = new MessagePrinter();
         messagePrinter.printMessage("Hello, World!");
   } 
}
