package Item;

public class Book implements Item{

    enum Genre{
        FICTION,
        FANTASY,
        NON_FICTION;
    }

    String title;
    Genre genre;

    public Book(String title, Genre genre){
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getCategory() {
        return this.genre.toString();
    }
}
