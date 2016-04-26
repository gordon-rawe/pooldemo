import entities.Photo;

/**
 * Created by gordon on 16/4/25.
 */
public class Entrance {
    public static void main(String[] args) {
        Publisher.getInstance().handleUploads(Photo.getPhotos());
    }
}
