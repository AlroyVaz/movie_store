import FrequentRenterPointStrategy.FrequentRenterPointsStrategy;
import TransactionItems.TransactionItem;
import strategies.PurchaseStrategies.PurchaseStrategy;

import java.util.*;

public class Transaction {
    Customer customer;
    Map<TransactionItem, Double> transactionItems;

    double totalCharge = 0;
    int frequentRenterPoints;

    public Transaction(Customer customer){
        this.customer = customer;
        this.frequentRenterPoints = 0;

        this.transactionItems = new HashMap<>();
    }

    // For Rental
    public void addItem(TransactionItem item){
        double charge = item.getPrice();
        totalCharge += charge;
        transactionItems.put(item, charge);
    }

    public void addFrequentRenterPoints(FrequentRenterPointsStrategy frequentRenterPointsStrategy, int daysRented){
        this.frequentRenterPoints = frequentRenterPointsStrategy.calculateFrequentRenterPoints(daysRented, this.frequentRenterPoints);
    }

    // For Purchase
    public void addItem(TransactionItem item, PurchaseStrategy purchaseStrategy){
        double charge = purchaseStrategy.calculatePrice();
        totalCharge += charge;
        transactionItems.put(item, charge);
    }

    public String generateBill() {
        StringBuilder result = new StringBuilder("Transaction Record for " + customer.getName() + "\n");

        for (TransactionItem item: transactionItems.keySet()){
            // show figures for this rental
            result.append("\t" + item.getItem().getTitle() +
                    "\t" + String.valueOf(transactionItems.get(item)) + "\n");
        }

        // add footer lines
        result.append("Amount owed is " + String.valueOf(totalCharge) + "\n");
        result.append("You earned " + String.valueOf(this.frequentRenterPoints) + " frequent renter points");
        return result.toString();
    }
}
