package com.example;

public class Main {
    public static void main(String[] args) {
        // Statement for customer John Doe
        Customer customer = new Customer("John Doe");
        customer.addRental(new Rental(new Movie("The Revenant", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("The Lion King", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("The Dark Knight", Movie.NEW_RELEASE), 1));
        System.out.println(customer.statement());

        // Get charge for movies
        Movie movie1 = new Movie("Regular Movie", Movie.REGULAR);
        Movie movie2 = new Movie("New Release", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("Children's Movie", Movie.CHILDRENS);
        System.out.println("Regular Movie charge for 3 days: " + movie1.getCharge(3));
        System.out.println("New Release charge for 3 days: " + movie2.getCharge(3));
        System.out.println("Children's Movie charge for 4 days: " + movie3.getCharge(4));

        // Get frequent renter points for rentals
        Rental rental1 = new Rental(movie1, 2);
        Rental rental2 = new Rental(movie2, 3);
        System.out.println("Frequent renter points for Regular Movie: " + rental1.getFrequentRenterPoints());
        System.out.println("Frequent renter points for New Release: " + rental2.getFrequentRenterPoints());

    }
}