package ncDaLuongThread;

public class    Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start"); // main
        ThreadOne threadOne = new ThreadOne();
        threadOne.start(); // main & 1

        ThreadTwo threadTwo = new ThreadTwo();
        Thread t = new Thread(threadTwo);
        t.start(); // main & 1 & 2

        System.out.println("join  1 vào  main");
        threadOne.join();

        System.out.println("join  2 vào main");
        t.join();

        System.out.println("Main stop");


//        try {
//            System.out.println("ngủ đê ...");
//            Thread.sleep(5000);
//            t.stop();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
