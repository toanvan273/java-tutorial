package java_date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LopSimpleDateFormat {
    public static void main(String[] args) {
//        Date now = new Date();
//        SimpleDateFormat simpleDateFormat =
//                new SimpleDateFormat("W");
//        String myTime = simpleDateFormat.format(now);
//        System.out.println(myTime);
        Date now;
        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("dd/MM/yyyy");
        String input = "27/09/2099";
        try {
            now = simpleDateFormat.parse(input);
            System.out.println(now);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
