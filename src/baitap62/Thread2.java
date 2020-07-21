package baitap62;

public class Thread2 extends Thread{
    ShareData shareData;

    public Thread2(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        for (int i = 0; i < shareData.addressList.length; i++) {
            synchronized (shareData){
                shareData.notifyAll();

                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Address: "+shareData.addressList[i]);
            }

        }
        synchronized (shareData){
            shareData.notifyAll();
        }
        System.out.println("T2 stop");
    }
}
