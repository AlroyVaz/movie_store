public abstract  class MovieType {
    public abstract double calculateBaseRent();
    public abstract double calculateExtendedRent(int daysRented);
    public abstract int getFrequentRenterPoints(); // extract method
}
