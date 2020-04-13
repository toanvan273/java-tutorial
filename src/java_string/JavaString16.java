package java_string;

public class JavaString16 {
//    private static StringBuilder StringBuilder;

    public static void main(String[] args) {
        StringBuilder  stringBuilder = new StringBuilder();
        stringBuilder.append("Truong ");
        stringBuilder.append("Toan ");
        stringBuilder.insert(7, "Van ");
        String name = stringBuilder.toString();
        System.out.println(name);
//        String nameRevese = stringBuilder.reverse().toString();
//        System.out.println(nameRevese);
        stringBuilder.replace(0,4,"TRUO");
        name = stringBuilder.toString();
        System.out.println(name);
    }
}
