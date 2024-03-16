package tekpro.number;

/**
 * @author Micho Dhani Firmansyah - 1A - 231524013
 */
public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff = {
            new Salesperson("Jane", "Jones", 3000),
            new Salesperson("Daffy", "Duck", 4935),
            new Salesperson("James", "Jones", 3000),
            new Salesperson("Dick", "Walter", 2800),
            new Salesperson("Don", "Trump", 1570),
            new Salesperson("Jane", "Black", 3000),
            new Salesperson("Harry", "Taylor", 7300),
            new Salesperson("Andy", "Adams", 5000),
            new Salesperson("Jim", "Doe", 2850),
            new Salesperson("Walt", "Smith", 3000)
        };

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");

        for (Salesperson s : salesStaff){
            System.out.println(s);
        }
        
    }

}
