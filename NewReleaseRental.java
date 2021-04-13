public class NewReleaseRental implements RentalStrategy {
    @Override
    public double calculateRent(int daysRented) {
        double rent = 3;
        return daysRented * rent;
    }
}
