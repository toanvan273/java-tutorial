package ncBtThreadMoRong;

public class Main {

    public static void main(String[] args) {
        ShadeData shadeData = new ShadeData();
        Thread1 t1 = new Thread1(shadeData);
        Thread2 t2 = new Thread2(shadeData);
        Thread3 t3 = new Thread3(shadeData);
        t1.start();
        t2.start();
        t3.start();
    }
}
