import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    // CustomerOrder customerOrder

    public Customer (String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {

        double      totalAmount          = 0;
        int         frequentRenterPoints = 0;
        Enumeration rentals              = _rentals.elements();
        StringBuilder result        = new StringBuilder("Rental Record for " + getName() + "\n"); // Data-type replacement

        while (rentals.hasMoreElements()) {

            double totalCharge = 0;
            Rental eachRental       = (Rental) rentals.nextElement();       // variable  change

            // determine amounts for each line
            totalCharge += eachRental.calculateRent();
            totalCharge += eachRental.calculateExtendedRent();


            // add frequent renter points
            frequentRenterPoints += eachRental.getFrequentRenterPoints();


            // show figures for this rental
            result.append("\t" + eachRental.getMovie().getTitle() +
                    "\t" + String.valueOf(totalCharge) + "\n");
            totalAmount += totalCharge;
        }

        // add footer lines
        result.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
        result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
        return result.toString();
    }
}
