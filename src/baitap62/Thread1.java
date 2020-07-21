package baitap62;

public class Thread1 extends Thread {
    ShareData shareData;

    public Thread1(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        for (int i = 0; i < shareData.userList.length; i++) {
            synchronized (shareData){
                System.out.println("User Name: "+shareData.userList[i]);

                shareData.notifyAll();

//                if(i<shareData.userList.length-1){
                    try {
                        shareData.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("T1 stop");
    }
}
