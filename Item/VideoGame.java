package Item;

public class VideoGame implements Item{

    public enum VideoGameCategory{
        RPG,
        FPS,
        OPEN_WORLD;
    }

    String name;
    VideoGameCategory videoGameCategory;

    public VideoGame(String name, VideoGameCategory videoGameCategory) {
        this.name = name;
        this.videoGameCategory = videoGameCategory;
    }

    @Override
    public String getTitle() {
        return this.name;
    }

    @Override
    public String getCategory() {
        return videoGameCategory.toString();
    }
}
