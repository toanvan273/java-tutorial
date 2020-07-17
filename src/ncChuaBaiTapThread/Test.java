package ncChuaBaiTapThread;

public class    Test {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        t2.join();
        t1.join();

        System.out.println("In ra ket qua T1");
        System.out.println(t1.list1);

        System.out.println("In ra T2");
        System.out.println(t2.list2);
    }
}
