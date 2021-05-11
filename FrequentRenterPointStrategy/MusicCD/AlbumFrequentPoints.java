package FrequentRenterPointStrategy.MusicCD;

import FrequentRenterPointStrategy.FrequentRenterPointsStrategy;

public class AlbumFrequentPoints implements FrequentRenterPointsStrategy {
    @Override
    public int calculateFrequentRenterPoints(int daysRented, int frequentRenterPoints) {
        return frequentRenterPoints*3;
    }
}
