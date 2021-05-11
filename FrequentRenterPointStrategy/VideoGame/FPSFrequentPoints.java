package FrequentRenterPointStrategy.VideoGame;

import FrequentRenterPointStrategy.FrequentRenterPointsStrategy;

public class FPSFrequentPoints implements FrequentRenterPointsStrategy {
    @Override
    public int calculateFrequentRenterPoints(int daysRented, int frequentRenterPoints) {
        return frequentRenterPoints+2+daysRented;
    }
}
