package java_input_output_console;

import java.util.Scanner;

public class JavaInput17 {
    public static void main(String[] args) {
        /*
        - Khởi tạo nhập ký tự từ bàn phím với class Scanner
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao mot so nguyen: ");
//        int a = scanner.nextInt(); // doc vao 1 so nguyen
//        System.out.println("Nhap vao mot so float: ");
//        float floatValue = scanner.nextFloat(); // doc vao 1 so thuc
//        System.out.println("Nhap vao mot so thực: ");
//        double doubleValue = scanner.nextDouble();
//
//        System.out.println(a +" - "  + floatValue+ " - "+doubleValue);
        /* ************************************* */
        System.out.println("Nhap vao mot ky tu: ");
        char c = scanner.next().charAt(0); // doc vao 1 ky tu
        System.out.println("Ban vua nhap: "+c);

        System.out.println("Nhap vao mot tu: ");
        String word = scanner.next(); // doc vao mot tu
        System.out.println("Ban vua nhap: "+word);
        scanner.nextLine();

        System.out.println("Nhap vao mot dong: ");
        String line = scanner.nextLine(); // doc ca dong
        System.out.println("Ban vua nhap: "+line);

        System.out.println("Nhap vao mot gia trị true/false: ");
        boolean booleanValue = scanner.nextBoolean(); // doc cao gia tri kieu boolean
        System.out.println("Ban vua nhap: "+booleanValue);
    }
}
