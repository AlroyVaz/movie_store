import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    int frequentRenterPoints = 0;
    double totalCharge = 0;     // variable name changed

    public Customer (String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String generateBill() {

        Enumeration rentals  = _rentals.elements();
        StringBuilder result  = new StringBuilder("Rental Record for " + getName() + "\n"); // Data-type replacement

        while (rentals.hasMoreElements()) {


            Rental eachRental       = (Rental) rentals.nextElement();       // variable  change
            double charge = getCharge(eachRental);
            // determine amounts for each line

            // add frequent renter points
            frequentRenterPoints += eachRental.getFrequentRenterPoints();


            // show figures for this rental
            result.append("\t" + eachRental.getMovie().getTitle() +
                    "\t" + String.valueOf(charge) + "\n");
            totalCharge += charge;
        }


        // add footer lines
        result.append("Amount owed is " + String.valueOf(totalCharge) + "\n");
        result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
        return result.toString();
    }

    private double getCharge(Rental rental){
        return rental.calculateRent() + rental.calculateExtendedRent();
    }

    public String generateXML(){
        StringBuilder xml = new StringBuilder();
        xml.append("<name>" + getName() + "</name>\n");

        Enumeration rentals              = _rentals.elements();
        while (rentals.hasMoreElements()){
            xml.append("<movie>\n");
            Rental eachRental = (Rental) rentals.nextElement();
            xml.append("\t<title>" + eachRental.getMovie().getTitle()+ "</title>\n");
            xml.append("\t<charge>" + getCharge(eachRental)+ "</charge>\n");
            xml.append("</movie>\n");
        }

        xml.append("<totalCharge>" + totalCharge + "</totalCharge>\n");
        xml.append("<frequentRenterPoints>" + frequentRenterPoints + "</frequentRenterPoints>\n");

        return xml.toString();
    }
}
