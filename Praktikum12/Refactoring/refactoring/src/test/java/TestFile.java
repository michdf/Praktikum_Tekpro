import com.example.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFile {
    @Test
    public void testCustomerStatement() {
        Customer customer = new Customer("John Doe");
        Movie movie1 = new Movie("Movie 1", Movie.REGULAR);
        Movie movie2 = new Movie("Movie 2", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 2);
        customer.addRental(rental1);
        customer.addRental(rental2);

        String expectedStatement = "Rental Record for John Doe\n" +
                                   "\tMovie 1\t3.5\n" +
                                   "\tMovie 2\t6.0\n" +
                                   "Amount owed is 9.5\n" +
                                   "You earned 3 frequent renter points";

        assertEquals(expectedStatement, customer.statement());
    }

    @Test
    public void testMovieGetCharge() {
        Movie movie1 = new Movie("Regular Movie", Movie.REGULAR);
        Movie movie2 = new Movie("New Release", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("Children's Movie", Movie.CHILDRENS);

        assertEquals(3.5, movie1.getCharge(3), 0.01);
        assertEquals(9.0, movie2.getCharge(3), 0.01);
        assertEquals(3.0, movie3.getCharge(4), 0.01);
    }

    @Test
    public void testRentalGetFrequentRenterPoints() {
        Movie movie1 = new Movie("Regular Movie", Movie.REGULAR);
        Movie movie2 = new Movie("New Release", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(movie1, 2);
        Rental rental2 = new Rental(movie2, 3);

        assertEquals(1, rental1.getFrequentRenterPoints());
        assertEquals(2, rental2.getFrequentRenterPoints());
    }
}
