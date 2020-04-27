package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionP2 {
    /**
     * Sử dụng regular expressions để:
     * - Tìm kiếm gần đúng
     * - Thay thế một cụm ký tự với 1 cụm ký tự khác
     */
    public static void main(String[] args) {
        String[] fullName = {"Trieu Van Than", "Nguyen Thi Hoa", "To Trong Phuc","Ngo Van Tai",
        "Tran Thuy Ha", "Le Duc Tai Anh","Do Viet Dung","Nguyen Duc Tai"};
        String input = "     Hello bebe   sds     abc        xyz     babe     ";
//        String regex = ".*o.*";
//        String regex = "^To.*";
//        String regex = ".*Tai$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher;
//        for (int i = 0; i < fullName.length; i++) {
//            matcher = pattern.matcher(fullName[i]);
//            if(matcher.find()){
//                System.out.println(fullName[i]);
//
//            }
//        }


        String regex2 = "[\\s]+";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println(matcher.replaceAll(" "));
        }
    }
}
