package tekpro.number;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many strings will be sorted? ");
        int count = in.nextInt();
        String[] strings = new String[count];

        System.out.println("Enter the strings...");
        for (int i = 0; i < count; i++) {
            strings[i] = in.next();
        }

        Sorting.insertionSort(strings);
        
        System.out.println("The sorted strings:");
        for (int i = 0; i < count; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }
}