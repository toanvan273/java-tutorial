package ncDongBoLuongsycnThread;

import java.util.Random;

public class  Thread1 extends Thread{
    ShareDataV2 shareDataV2;

    public Thread1(ShareDataV2 shareDataV2) {
        this.shareDataV2 = shareDataV2;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            synchronized (shareDataV2){
                System.out.println("T1 > i > "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1 > i > "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int rad = random.nextInt(100);
                shareDataV2.rad = rad;
                System.out.println("T1 > "+rad);
                shareDataV2.notifyAll();
//                if(i==19){
//                    System.out.println("stop t1");
//                    stop();
//                }
                try {
                    shareDataV2.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
