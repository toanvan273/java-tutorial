package baitapquanlyhocsinh;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private  String gioiTinh;
    private String queQuan;

    public Nguoi(){
        super();
    }
    public Nguoi(String hoTen,String gioiTinh, String queQuan){
        super();
        this.hoTen=hoTen;
        this.gioiTinh=gioiTinh;
        this.queQuan=queQuan;
    }
    public String getQueQuan(){
        return queQuan;
    }
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan=scanner.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Gioi tinh: "+gioiTinh);
        System.out.println("Que quan: "+queQuan);
    }
}
