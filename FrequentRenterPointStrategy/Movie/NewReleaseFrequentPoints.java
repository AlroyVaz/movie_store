package FrequentRenterPointStrategy.Movie;

import FrequentRenterPointStrategy.FrequentRenterPointsStrategy;

public class NewReleaseFrequentPoints implements FrequentRenterPointsStrategy {
    @Override
    public int calculateFrequentRenterPoints(int daysRented, int frequentRenterPoints) {
        if(daysRented > 1){
            return frequentRenterPoints+2;
        }
        return frequentRenterPoints+1;
    }
}
