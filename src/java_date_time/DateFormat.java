package java_date_time;

import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.printf("%tA %<td/%<tm/%<tY",now);
    }
}
