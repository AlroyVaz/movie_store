package TransactionItems;

import Item.Item;
import strategies.RentalStrategies.RentalStrategy;

public class Rental implements TransactionItem{
    private Item item;
    private int daysRented;
    private double rent;

    public Rental(Item item, int daysRented, RentalStrategy rentalStrategy) {
        this.item = item;
        this.daysRented = daysRented;
        this.rent = calculateRent(rentalStrategy);
    }

    public int getDaysRented() {
        return this.daysRented;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double calculateRent(RentalStrategy rentalStrategy){
        return rentalStrategy.calculateRent(this.daysRented);
    }

    @Override
    public double getPrice() {
        return this.rent;
    }

    /*@Override
    public void setPrice(double price) {
        this.rent = calculateRent(this.movieRentalStrategy);
    }*/
}
