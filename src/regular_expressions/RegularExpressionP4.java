package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionP4 {
    public static void main(String[] args) {
        String input = "b12dnkt102";
        String regex = "^[bBcC]{1}\\d{2}[dDcCnNqQtTsSkK]{4}\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("OK");
        }else {
            System.out.println("SAI");
        }
    }
}
