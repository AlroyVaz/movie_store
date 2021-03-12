public class Movie {
//    public static final int CHILDRENS   = 2;
//    public static final int REGULAR     = 0;
//    public static final int NEW_RELEASE = 1;

    private String movieTitle;      // variable name changed
    private MovieType movieType;          // variable name changed

    public Movie(String title, MovieType type) {
        movieTitle = title;
        movieType = type;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setPriceCode(MovieType movieType) {
        movieType = movieType;      // variable name change
    }

    public String getTitle() {
        return movieTitle;
    }
}
