public class ChildrenFrequentPoints implements FrequentRenterPointsStrategy{
    @Override
    public int calculateFrequentRenterPoints(int daysRented, int frequentRenterPoints) {
        return frequentRenterPoints+1;
    }
}
