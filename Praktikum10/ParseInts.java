import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        // String line;

        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
            } catch (Exception e){
                System.out.println("Ada Error lain, error nya : " + e.getMessage());
            }
        }
        System.out.println("The sum of the integers on this line is " + sum);
        scanLine.close();
        scan.close();
    }
}
