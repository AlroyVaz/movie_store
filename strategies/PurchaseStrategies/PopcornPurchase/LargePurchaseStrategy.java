package strategies.PurchaseStrategies.PopcornPurchase;

import strategies.PurchaseStrategies.PurchaseStrategy;

public class LargePurchaseStrategy implements PurchaseStrategy {
    @Override
    public double calculatePrice() {
        return 7;
    }
}
