package java_date_time;

import java.time.LocalDate;

public class LopLocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);

        LocalDate myDate = LocalDate.of(1991,3,27);
        System.out.println(myDate);

        myDate = myDate.plusDays(-1000);
//        System.out.println(myDate);
        System.out.println(myDate);
    }
}
