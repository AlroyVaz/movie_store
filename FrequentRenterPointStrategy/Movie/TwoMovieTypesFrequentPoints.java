package FrequentRenterPointStrategy.Movie;

import FrequentRenterPointStrategy.FrequentRenterPointsStrategy;

public class TwoMovieTypesFrequentPoints implements FrequentRenterPointsStrategy {
    @Override
    public int calculateFrequentRenterPoints(int daysRented, int frequentRenterPoints) {
        return frequentRenterPoints*2;
    }
}
