package Item;

public class MusicCD implements Item{

    public enum Category{
        ALBUM,
        SINGLE_SONG;
    }

    String title;
    Category category;

    public MusicCD(String title, Category category){
        this.title = title;
        this.category = category;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getCategory() {
        return this.category.toString();
    }
}
