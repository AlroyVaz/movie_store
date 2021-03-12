public class Regular extends MovieType{
    @Override
    public double calculateBaseRent() {
        return 2;
    }

    @Override
    public double calculateExtendedRent(int daysRented) {
        return (daysRented - 2) * 1.5;
    }
}
