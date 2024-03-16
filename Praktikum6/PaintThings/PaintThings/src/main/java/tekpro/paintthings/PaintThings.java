/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tekpro.paintthings;
import java.text.DecimalFormat;

/**
 *
 * @author ASUS TUF
 */
public class PaintThings {

    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;

        double deckArea, ballArea, tankArea;

        double deckAmt,ballAmt,tankAmt;

        //  Instantiate the three shapes to paint
        deck = new Rectangle(20, 35);
        bigBall = new Sphere(15);
        tank = new Cylinder(30, 10);

        //  Compute the amount of paint needed for each shape
        deckArea = deck.getArea();
        System.out.println("Deck area: " + deckArea);
        ballArea = bigBall.getArea();
        System.out.println("Big Ball area: " + ballArea);
        tankArea = tank.getArea();
        System.out.println("Tank area: " + tankArea);
        
        
        //  Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        deckAmt = paint.amount(deck); 
        System.out.println("Deck :" + fmt.format(deckAmt));
        ballAmt = paint.amount(bigBall);
        System.out.println("Big Ball :" + fmt.format(ballAmt));
        tankAmt = paint.amount(tank);
        System.out.println("Tank :" + fmt.format(tankAmt));

    }
}
