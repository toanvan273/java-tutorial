package ncChuaBaiTapThread;

import java.util.ArrayList;

public class Thread1 extends Thread {
    ArrayList<Integer> list1;

    @Override
    public void run() {
        int max = 100;
        int min = 0;
        int range = max - min + 1;
        list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            try {
                int rand = (int)(Math.random() * range) + min;
                System.out.println("rand : "+rand);
                list1.add(rand);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.out.println("list1 : "+list1);
    }
}
