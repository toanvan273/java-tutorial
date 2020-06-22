package baitapquanlyhocsinh;

import java.util.Scanner;

public class Student implements Person {
    protected String ten;
    protected int namSinh;
    protected float diemTB;

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten=scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh=scanner.nextInt();
        System.out.println("Nhap diem TB");
        diemTB=scanner.nextFloat();
    }

    @Override
    public void output() {
        System.out.println("Ten la: "+ten);
        System.out.println("Nam sinh: "+namSinh);
        System.out.println("Diem TB: "+diemTB);
    }
}
