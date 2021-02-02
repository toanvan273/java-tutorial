package control_flow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java21 {
    public static void main(String[] args) {
            String img = "<img height=\"375\" id=\"rId4\" src=\"46d0be33-6cfd-427d-a3b0-2d62ed55e301image1.png\" width=\"375\" />";
            String imgRegex = "src\\s*=\\s*\"(.+?)\"";
            Pattern pattern = Pattern.compile(imgRegex);
            Matcher matcher = pattern.matcher(img);
//        System.out.println(matcher.find());
//            System.out.println(matcher.group(1));
        while(matcher.find()) {
            System.out.println("found: " + matcher.group());
        }
    }
}
