package ncBtThreadMoRong;

import baitap62.ShareData;

import java.util.Random;

public class Thread1 extends Thread {
    ShadeData shareData;

    public Thread1(ShadeData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (shareData.checkAvaiable()){
            int rad = random.nextInt(100)+1;
            shareData.setRad(rad);
            shareData.plus(rad);
            System.out.println("T1 >> "+rad);
            //
        }
    }
}
