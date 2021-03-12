public class Movie {
    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;

    private String movieTitle;      // variable name changed
    private int movieType;          // variable name changed

    public Movie(String title, int type) {
        movieTitle = title;
        movieType = type;
    }

    public int getPriceCode() {
        return movieType;
    }

    public void setPriceCode(int arg) {
        movieType = arg;
    }

    public String getTitle() {
        return movieTitle;
    }
}
