package bad.robot.refactoring.chapter1;

import java.util.*;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        double totalAmount = 0;
        int totalPointers = 0;
        String result = "Rental record for " + getName() + "\n";

        for (Rental rental : rentals) {
            double amount = 0;
            amount = rental.getCharge();
            int frequentRenterPoints = 0;
            frequentRenterPoints = rental.getFrequentRenterPoints();

            result += "\t" + rental.getMovie().getTitle() + "\t" + amount + "\n";

            totalAmount += amount;
            totalPointers +=frequentRenterPoints;
        }

        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + totalPointers + " frequent renter points";

        return result;
    }
}
