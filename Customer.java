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
        String      result               = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {

            double thisAmount = 0;
            Rental eachRental       = (Rental) rentals.nextElement();       // variable  change

            // determine amounts for each line
            thisAmount += eachRental.getMovie().getMovieType().calculateBaseRent();
            thisAmount += eachRental.getMovie().getMovieType().calculateExtendedRent(eachRental.getDaysRented());
//            switch (eachRental.getMovie().getMovieType()) {
//                case eachRental.getMovie():
//                    thisAmount += 2;
//                    if (eachRental.getDaysRented() > 2) {
//                        thisAmount += (eachRental.getDaysRented() - 2) * 1.5;
//                    }
//                    break;
//                case Movie.NEW_RELEASE:
//                    thisAmount += eachRental.getDaysRented() * 3;
//                    break;
//                case Movie.CHILDRENS:
//                    thisAmount += 1.5;
//                    if (eachRental.getDaysRented() > 3) {
//                        thisAmount += (eachRental.getDaysRented() - 3) * 1.5;
//                    }
//                    break;
//            }

            // add frequent renter points
            frequentRenterPoints++;

            // add bonus for a two day new release rental
//            if ((eachRental.getMovie().getMovieType() == Movie.NEW_RELEASE) &&
//                    (eachRental.getDaysRented() > 1)) {
//                frequentRenterPoints++;
//            }

            // show figures for this rental
            result += "\t" + eachRental.getMovie().getTitle() +
                    "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
        return result;
    }
}
