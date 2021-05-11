package Item;

public class Movie implements Item {
    public enum MovieCategory{
        NEW_RELEASE,
        CHILDREN_MOVIE,
        REGULAR;
    }

    private String movieTitle;
    private MovieCategory movieCategory;

    public Movie(String movieTitle, MovieCategory movieCategory) {
        this.movieTitle = movieTitle;
        this.movieCategory = movieCategory;
    }

    public String getTitle() {
        return movieTitle;
    }

    @Override
    public String getCategory() {
        return this.movieCategory.toString();
    }
}
