public class Childrens extends MovieType{

    @Override
    public double calculateBaseRent() {
        return 1.5;
    }

    @Override
    public double calculateExtendedRent(int daysRented) {
        return (daysRented - 1.5) * 3;
    }
}
