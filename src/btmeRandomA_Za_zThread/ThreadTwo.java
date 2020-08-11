package btmeRandomA_Za_zThread;

public class ThreadTwo extends Thread{
    SharedData sharedData;

    public ThreadTwo(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (sharedData.checkStop()){
            synchronized (sharedData){

                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T2 --> "+ sharedData.character.toString().toUpperCase());
                sharedData.setCountTime(sharedData.countTime+1);
            }
        }
        System.out.println("2 stop");
        synchronized (sharedData){
            sharedData.notifyAll();
        }
    }
}
