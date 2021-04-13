public class ChildernsRental implements RentalStrategy {
    @Override
    public double calculateRent(int daysRented) {
        double rent = 1.5;
        if (daysRented > 3) {
            rent += (daysRented - 2) * 1.5;
        }

        return rent;
    }
}
