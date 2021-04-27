public class Driver {
    public static void main(String[] args){
        Customer customer = new Customer("Teju");
        customer.setAge(19);
        Movie m1 = new Movie("Back to the Future");
        Movie m2 = new Movie("Raya and the Last Dragon");
        Movie m3 = new Movie("Cars");

        Transaction transaction = new Transaction(customer);
        transaction.addRental(new Rental(m1, 2, new RegularRental(), new RegularFrequentPoints()));
        transaction.addRental(new Rental(m2, 3, new NewReleaseRental(), new NewReleaseFrequentPoints()));
        transaction.addRental(new Rental(m3, 5, new ChildernsRental(), new ChildrenFrequentPoints()));


        // old code
//        customer.addRental(new Rental(m1, 2, new RegularRental(), new RegularFrequentPoints()));
//        customer.addRental(new Rental(m2, 3, new NewReleaseRental(), new NewReleaseFrequentPoints()));
//        customer.addRental(new Rental(m3, 5, new ChildernsRental(), new ChildrenFrequentPoints()));

        System.out.println(transaction.generateBill());

        System.out.println("\n\n-------XML format--------");
        System.out.println(transaction.generateXML());
    }
}
