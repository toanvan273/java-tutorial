package ncBtThreadMoRong_3luong;

import java.util.Random;

public class Thread1 extends Thread {
    ShadeData shareData;

    public Thread1(ShadeData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Random random = new Random();
        while (shareData.checkAvaiable()){
            synchronized (shareData){
                int rad = random.nextInt(100)+1;
                shareData.setRad(rad);
                shareData.plus(rad);
                System.out.println("T1 -> "+rad);
                // Thiet lap luong tiep theo duoc phep chay
                if(rad%3==0){
                    shareData.setIndex(2);
                }else{
                    shareData.setIndex(3);
                }

                // sycn thread
                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(" 1 stop");
    }
}
