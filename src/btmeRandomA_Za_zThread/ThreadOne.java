package btmeRandomA_Za_zThread;

import java.util.Random;

public class ThreadOne extends Thread{
    SharedData sharedData;

    public ThreadOne(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Random rad = new Random();
        while (sharedData.checkStop()){
            synchronized (sharedData){
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                char c = (char) ('a'+rad.nextInt(26));
                System.out.println("Time:"+sharedData.countTime  + " Char: "+c);
                sharedData.setCharacter(c);


                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        System.out.println("1 finish");
    }
}
