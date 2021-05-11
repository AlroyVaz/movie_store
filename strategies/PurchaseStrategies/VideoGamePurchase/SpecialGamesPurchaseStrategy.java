package strategies.PurchaseStrategies.VideoGamePurchase;

import strategies.PurchaseStrategies.PurchaseStrategy;

public class SpecialGamesPurchaseStrategy implements PurchaseStrategy {
    @Override
    public double calculatePrice() {
        return 60;
    }
}
