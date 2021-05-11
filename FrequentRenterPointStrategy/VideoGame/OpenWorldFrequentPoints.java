package FrequentRenterPointStrategy.VideoGame;

import FrequentRenterPointStrategy.FrequentRenterPointsStrategy;

public class OpenWorldFrequentPoints implements FrequentRenterPointsStrategy {
    @Override
    public int calculateFrequentRenterPoints(int daysRented, int frequentRenterPoints) {
        return frequentRenterPoints+10;
    }
}
