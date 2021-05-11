package strategies.PurchaseStrategies.MoviePurchaseStrategies;

import strategies.PurchaseStrategies.PurchaseStrategy;

public class ChildrenMoviePurchase implements PurchaseStrategy {

    @Override
    public double calculatePrice() {
        return 15;
    }
}
