import entities.Photo;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by gordon on 16/4/25.
 */
public class Publisher {
    private static Publisher ourInstance = new Publisher();
    private ExecutorService pool;

    public static Publisher getInstance() {
        return ourInstance;
    }

    private Publisher() {
    }

    public void handleUploads(List<Photo> photos) {
        pool = Executors.newFixedThreadPool(photos.size());
        for(Photo photo:photos){
            photo.upload(new Photo.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onFail() {

                }
            });
        }
    }
}
