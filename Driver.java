public class Driver {
    public static void main(String[] args){
        Customer customer = new Customer("Teju");
        Movie m1 = new Movie("Back to the Future", new Regular());
        Movie m2 = new Movie("Raya and the Last Dragon", new NewRelease());
        Movie m3 = new Movie("Cars", new Childrens());

        customer.addRental(new Rental(m1, 2));
        customer.addRental(new Rental(m2, 3));
        customer.addRental(new Rental(m3, 5));

        System.out.println(customer.generateBill());

        System.out.println("\n\n-------XML format--------");
        System.out.println(customer.generateXML());
    }
}
