public class NewRelease extends MovieType{
    @Override
    public double calculateBaseRent() {
        return 0;
    }

    @Override
    public double calculateExtendedRent(int daysRented) {
        return daysRented * 3;
    }
}
