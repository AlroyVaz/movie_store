public class Rental {
    private Movie _movie;
    private int   _daysRented;

    RentalStrategy rentalStrategy;
    FrequentRenterPointsStrategy frequentRenterPointsStrategy;

    public Rental(Movie movie, int daysRented, RentalStrategy rentalStrategy, FrequentRenterPointsStrategy frequentRenterPointsStrategy) {
        _movie      = movie;
        _daysRented = daysRented;
        this.rentalStrategy = rentalStrategy;
        this.frequentRenterPointsStrategy = frequentRenterPointsStrategy;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double calculateRent(){ // method extracted and moved
        return rentalStrategy.calculateRent(_daysRented);
    }


    public int getFrequentRenterPoints(){   // method extracted and moved
        return frequentRenterPointsStrategy.calculateFrequentRenterPoints(_daysRented);
    }
}
