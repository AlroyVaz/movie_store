package strategies.RentalStrategies.MovieRentalStrategies;

import strategies.RentalStrategies.RentalStrategy;

public class NewReleaseMovieRental implements RentalStrategy {
    @Override
    public double calculateRent(int daysRented) {
        double rent = 3;
        return daysRented * rent;
    }
}
