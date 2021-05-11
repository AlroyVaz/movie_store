package Item;

public class Candie implements Item{
    public enum Flavour{
        CHOCOLATE,
        CARAMEL,
        COFFEE;
    }

    private String candyName;
    private Flavour flavour;

    public Candie(String candyName, Flavour flavour) {
        this.candyName = candyName;
        this.flavour = flavour;
    }

    public String getTitle() {
        return this.candyName;
    }

    @Override
    public String getCategory() {
        return this.flavour.toString();
    }
}
