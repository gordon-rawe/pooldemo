package entities;

import java.util.Random;

/**
 * Created by gordon on 16/4/25.
 */
public class Photo {
    public void upload(Callback callback) {
        int number = new Random().nextInt();
        try {
            Thread.sleep(number);
            if (number % 2 == 0) callback.onSuccess();
            else callback.onFail();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface Callback {
        void onSuccess();

        void onFail();
    }
}
