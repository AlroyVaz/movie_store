import java.util.*;

public class Transaction {
    Customer customer;
    List<Rental> rentalList;
    double totalCharge = 0;
    int frequentRenterPoints;

    public Transaction(Customer customer){
        this.customer = customer;
        this.frequentRenterPoints = 0;
        rentalList = new ArrayList<>();
    }

    public void addRental(Rental rental){
        rentalList.add(rental);
    }

    public void getFrequentRenterPoints(){
        Set<String> set = new HashSet<>();
        for(Rental rental: rentalList){
            RentalStrategy rentalStrategy = rental.rentalStrategy;
            int daysRented = rental.getDaysRented();
            if(rentalStrategy instanceof NewReleaseRental){
                set.add("NewReleaseRental");
                frequentRenterPoints = new NewReleaseFrequentPoints().calculateFrequentRenterPoints(daysRented, frequentRenterPoints);
            }else if(rentalStrategy instanceof RegularRental){
                set.add("RegularRental");
                frequentRenterPoints = new RegularFrequentPoints().calculateFrequentRenterPoints(daysRented, frequentRenterPoints);
            }else{
                set.add("ChildrenRental");
                frequentRenterPoints = new ChildrenFrequentPoints().calculateFrequentRenterPoints(daysRented, frequentRenterPoints);
            }
        }

        if(set.size() > 1){
            frequentRenterPoints = new TwoMovieTypesFrequentPoints().calculateFrequentRenterPoints(0, frequentRenterPoints);
            if(customer.getAge() > 17 && customer.getAge() < 23){
                frequentRenterPoints = new AgeFrequentPoints().calculateFrequentRenterPoints(0, frequentRenterPoints);
            }
        }
    }

    public String generateBill() {
        StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n"); // Data-type replacement

        for (Rental eachRental: rentalList){
            double charge = eachRental.calculateRent();

            // show figures for this rental
            result.append("\t" + eachRental.getMovie().getTitle() +
                    "\t" + String.valueOf(charge) + "\n");
            totalCharge += charge;
        }

        // add footer lines
        result.append("Amount owed is " + String.valueOf(totalCharge) + "\n");
        getFrequentRenterPoints();
        result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
        return result.toString();
    }

    public String generateXML(){
        StringBuilder xml = new StringBuilder();
        xml.append("<name>" + customer.getName() + "</name>\n");

        for (Rental eachRental: rentalList){
            xml.append("<movie>\n");
            xml.append("\t<title>" + eachRental.getMovie().getTitle()+ "</title>\n");
            xml.append("\t<charge>" + eachRental.calculateRent()+ "</charge>\n");
            xml.append("</movie>\n");
        }

        xml.append("<totalCharge>" + totalCharge + "</totalCharge>\n");
        xml.append("<frequentRenterPoints>" + frequentRenterPoints + "</frequentRenterPoints>\n");

        return xml.toString();
    }
}
