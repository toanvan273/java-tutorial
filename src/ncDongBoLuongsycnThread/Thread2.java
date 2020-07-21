package ncDongBoLuongsycnThread;

public class Thread2 extends Thread{
    ShareDataV2 shareDataV2;

    public Thread2(ShareDataV2 shareDataV2) {
        this.shareDataV2 = shareDataV2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (shareDataV2){

                System.out.println("T2 > i > "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T2 > i > "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                shareDataV2.notifyAll();
                try {
                    shareDataV2.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result = shareDataV2.rad*shareDataV2.rad;
                System.out.println("T2 > "+result);

//                if(i==19){
//                    System.out.println("stop t2");
//                    stop();
//                }

            }

        }
    }
}
