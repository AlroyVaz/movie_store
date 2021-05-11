package strategies.PurchaseStrategies.PopcornPurchase;

import strategies.PurchaseStrategies.PurchaseStrategy;

public class SmallPurchaseStrategy implements PurchaseStrategy {
    @Override
    public double calculatePrice() {
        return 4;
    }
}
