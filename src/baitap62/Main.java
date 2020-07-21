package baitap62;

public class Main {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        Thread1 t1 = new Thread1(shareData);
        Thread2 t2 = new Thread2(shareData);
        t2.start();
        t1.start();

    }
}
