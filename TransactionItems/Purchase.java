package TransactionItems;

import Item.Item;

public class Purchase implements TransactionItem{

    private Item item;
    private double price;

    public Purchase(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    /*public void setPrice(double price){
        this.price = price;
    }*/

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
