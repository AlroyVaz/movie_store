package strategies.PurchaseStrategies.MusicPurchase;

import strategies.PurchaseStrategies.PurchaseStrategy;

public class SinglePurchaseStrategy implements PurchaseStrategy {
    @Override
    public double calculatePrice() {
        return 15;
    }
}
