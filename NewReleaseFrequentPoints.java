public class NewReleaseFrequentPoints implements FrequentRenterPointsStrategy{
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        if(daysRented > 1){
            return 2;
        }
        return 1;
    }
}
