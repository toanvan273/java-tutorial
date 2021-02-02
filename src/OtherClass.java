import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OtherClass {
    public static void main(String[] args) {
        int GD = 0b100;
        int NV = 0b001;
        int MA = 0b010;

        int permistion = 0b110;

        System.out.println((permistion&NV)==NV);
        System.out.println((permistion&GD)==GD);
        System.out.println((permistion&MA)==MA);
//        String str = "[Trương Văn Toàn]";
//        str = str.replaceAll("[^a-z A-Z]","");
//        str = str.replaceAll(as
//        System.out.println(str);
//        str = str.replaceFirst("/?^84","0");
//        System.out.println(str);
//        String a = conv("099.9999.9999");
    }
    private static String convertPhone(String str){
        str = str.replaceAll("[^0-9]","");
        str = str.replaceFirst("/?^84","0");
        return str;
    }
}
