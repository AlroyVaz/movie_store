package Item;

public class Popcorn implements Item{

    enum Flavour{
        REGULAR,
        SALTED,
        CARAMEL;
    }

    String name;
    Flavour flavour;

    public Popcorn(String name, Flavour flavour){
        this.name = name;
        this.flavour = flavour;
    }

    @Override
    public String getTitle() {
        return this.name;
    }

    @Override
    public String getCategory() {
        return this.flavour.toString();
    }
}
