package FrequentRenterPointStrategy.Movie;

import FrequentRenterPointStrategy.FrequentRenterPointsStrategy;

public class RegularFrequentPoints implements FrequentRenterPointsStrategy {
    @Override
    public int calculateFrequentRenterPoints(int daysRented, int frequentRenterPoints) {
        return frequentRenterPoints+1;
    }
}
