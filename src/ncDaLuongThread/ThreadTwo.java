package ncDaLuongThread;

public class ThreadTwo implements Runnable{
    ThreadOne t1;
    public ThreadTwo(){}

    public ThreadTwo(ThreadOne t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        System.out.println("t2 is running");
        try {
            System.out.println("join t1 into t2"+t1);
            t1.join();
            System.out.println("t1 is finish");
            for (int i = 0; i < 10; i++) {
                System.out.println("Thead Two > "+i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
