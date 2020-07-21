package ncDongBoLuongsycnThread;

import java.util.Random;

public class CustomThread extends Thread{
    SharedData sharedData;

    public CustomThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int red = random.nextInt(5);
            sharedData.add(red);
        }
    }
}
