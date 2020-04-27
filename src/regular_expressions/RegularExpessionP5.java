package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpessionP5 {
    public static void main(String[] args) {
        String phoneNumber = "(023) 2626 5555";
        String input = "0887961254";

//        String regex = "^0[89]\\d{8}$";
//        String regex = "^\\(\\d{3}\\).\\d{4}.\\d{4}$";
        String regex = "(^\\(\\d{3}\\))\\s+(\\d{4})\\s{1,}(\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);


        if (matcher.find()){
            System.out.println("ok! Right");
        }else {
            System.out.println("Sai! Sai roi em oi");
        }
    }
}
