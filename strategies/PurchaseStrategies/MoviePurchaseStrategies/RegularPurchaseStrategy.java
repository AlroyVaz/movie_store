package strategies.PurchaseStrategies.MoviePurchaseStrategies;

import strategies.PurchaseStrategies.PurchaseStrategy;

public class RegularPurchaseStrategy implements PurchaseStrategy {
    @Override
    public double calculatePrice() {
        return 10;
    }
}
