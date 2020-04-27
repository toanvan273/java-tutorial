package java_date_time;

import java.util.Date;

public class LopJavaDate {
    public static void main(String[] args) {
        long nowOther = System.currentTimeMillis();
        Date now = new Date();
        Date tomorrow = new Date(nowOther+(24*60*60*1000*1000L));
        Date afterday = new Date(nowOther-(24*60*60*1000*1000L));
//        System.out.println(now);
        long nowInMs = now.getTime();

//        System.out.println(nowInMs);

        System.out.println(tomorrow);
        System.out.println(now.getTime());
        System.out.println(afterday);
    }
}
