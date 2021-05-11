package strategies.RentalStrategies.VideoGameRental;

import strategies.RentalStrategies.RentalStrategy;

public class RPGRental implements RentalStrategy {
    @Override
    public double calculateRent(int daysRented) {
        return daysRented * 4;
    }
}
