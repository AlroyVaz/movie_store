package strategies.PurchaseStrategies.MusicPurchase;

import strategies.PurchaseStrategies.PurchaseStrategy;

public class AlbumPurchaseStrategy implements PurchaseStrategy {
    @Override
    public double calculatePrice() {
        return 25;
    }
}
