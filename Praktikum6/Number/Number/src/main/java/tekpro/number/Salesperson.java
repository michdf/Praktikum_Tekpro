package tekpro.number;

/**
 *
 * @author ASUS TUF
 */
public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    // ------------------------------------------------
    // Constructor : Sets up the sales person object with
    // the given data.
    // ------------------------------------------------
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // -------------------------------------------
    // Returns sales person as a string.
    // -------------------------------------------
    public String toString() {
        return lastName + " " + firstName + ": \t" + totalSales;
    }

    // -------------------------------------------
    // Returns true if the sales people have
    // the same name.
    // -------------------------------------------
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    // --------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    // //--------------------------------------------
    @Override
    public int compareTo(Salesperson other) {
        Salesperson otherSalesperson = (Salesperson) other;

        if (totalSales < otherSalesperson.totalSales) {
            return -1;
        } else if (totalSales > otherSalesperson.totalSales) {
            return 1;
        } else {
            if (firstName.compareTo(otherSalesperson.getFirstName()) < 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    // -------------------------------------
    // First name accessor.
    // -------------------------------------
    public String getFirstName() {
        return firstName;
    }

    // -------------------------------------
    // Last name accessor.
    // -------------------------------------
    public String getLastName() {
        return lastName;
    }

    // -------------------------------------
    // Total sales accessor.
    // -------------------------------------
    public int getSales() {
        return totalSales;
    }
}
