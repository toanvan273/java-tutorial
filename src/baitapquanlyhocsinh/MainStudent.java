package baitapquanlyhocsinh;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hoc sinh:");
        int soHS = scanner.nextInt();
        Student[] students = new Student[soHS];
        for (int i = 0; i < soHS; i++) {
             students[i] = new Student();
            students[i].input();
        }
        for (int i = 0; i < soHS; i++) {
            students[i].output();
        }
    }
}
