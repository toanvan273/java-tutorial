package ncDaLuongThread;

public class    Main {
    public static void main(String[] args) {
        // Thread main -> luong chinh
        System.out.println("Start");
        // c1: Cách khai báo luồng
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1 > "+i);
                }
            }
        });
        t.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 2 > "+i);
                }
            }
        });
        t2.start();
        // c2: tao luồng
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Quẩy lên luồng 2");
            }
        }).start();
        // c3: tạo luồng
        new Thread(()->{
            System.out.println("Luồng 3 quẩy lên");
        }).start();

        System.out.println("Ends");
    }
}
