package ncChuaBaiTapThread;

import java.util.ArrayList;
import java.util.Random;

public class Thread2 extends Thread{
    ArrayList<Character> list2;

    @Override
    public void run() {
        Random rd = new Random();
        list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            try {
                char c = (char)('a'+rd.nextInt(26));
                System.out.println("char ; "+c);
                list2.add(c);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.out.println("list2 : "+list2);
    }
}
