package ncDaLuongThread;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("t1 is running");
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadOne > "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
