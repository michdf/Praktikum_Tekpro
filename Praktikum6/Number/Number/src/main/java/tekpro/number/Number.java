package tekpro.number;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many integers will be sorted? ");
        int count = in.nextInt();
        Integer[] numbers = new Integer[count];

        System.out.println("Enter the integers...");
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        Sorting.insertionSort(numbers);

        System.out.println("The sorted integers:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
