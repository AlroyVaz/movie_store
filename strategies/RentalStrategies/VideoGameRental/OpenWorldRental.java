package strategies.RentalStrategies.VideoGameRental;

import strategies.RentalStrategies.RentalStrategy;

public class OpenWorldRental implements RentalStrategy {
    @Override
    public double calculateRent(int daysRented) {
        return daysRented*7;
    }
}
