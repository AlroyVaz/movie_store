package strategies.RentalStrategies.VideoGameRental;

import strategies.RentalStrategies.RentalStrategy;

public class FPSRental implements RentalStrategy {
    @Override
    public double calculateRent(int daysRented) {
        return 5*daysRented;
    }
}
