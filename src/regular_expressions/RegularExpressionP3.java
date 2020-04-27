package regular_expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Kiểm tra định dạng email VD: trantoan@xmail.com
 */
public class RegularExpressionP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    String t1 = "truongvantoan.neu";
//    String t2 = "uahhaha@gmail.com";
//    String t4 = "123truongtoan@xmail.com";
        String input = scanner.nextLine();
        String regex = "^[a-zA-Z0-9]+[a-z0-9]*@\\w+mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("OK");
        }else {
            System.out.println("Vui long nhap lai");
        }
    }

}
