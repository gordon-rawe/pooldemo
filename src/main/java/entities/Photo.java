package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by gordon on 16/4/25.
 */
public class Photo {
    private String name;
    private int sleepTime;

    public Photo(String name) {
        this.name = name;
        sleepTime = new Random().nextInt(1000);
        System.out.println(String.valueOf(sleepTime));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void upload(Callback callback) {

        try {
            Thread.sleep(sleepTime);
            if (sleepTime % 2 == 0) callback.onSuccess(this);
            else callback.onFail(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<Photo> getPhotos() {
        List<Photo> photos = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            photos.add(new Photo("Photo " + i));
        }
        return photos;
    }

    public interface Callback {
        void onSuccess(Photo photo);

        void onFail(Photo photo);
    }
}

