package FrequentRenterPointStrategy.VideoGame;

import FrequentRenterPointStrategy.FrequentRenterPointsStrategy;

public class RPGFrequentPoints implements FrequentRenterPointsStrategy {
    @Override
    public int calculateFrequentRenterPoints(int daysRented, int frequentRenterPoints) {
        return daysRented + frequentRenterPoints + 3;
    }
}
