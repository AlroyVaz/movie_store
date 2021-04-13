public class RegularRental implements RentalStrategy {
    @Override
    public double calculateRent(int daysRented) {
        double rent = 2;
        if (daysRented > 2) {
            rent += (daysRented - 2) * 1.5;
        }

        return rent;
    }
}
