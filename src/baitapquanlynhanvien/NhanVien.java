package baitapquanlynhanvien;

import java.util.Scanner;

// mã nhân viên, họ tên, tuổi, số điện thoại, email, lương cơ bản
public class NhanVien {
    private String hoTen;
    protected int luongCoBan,luong;
    public NhanVien(){
        super();
    }
    public NhanVien(String hoTen,int luongCoBan,int luong){
        super();
        this.hoTen=hoTen;
        this.luongCoBan=luongCoBan;
        this.luong=luong;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ho ten: ");
        hoTen=scanner.nextLine();

        System.out.println("Nhap luong co ban:");
        luongCoBan=scanner.nextInt();
    }
    public int tinhLuong(){
        return 0;
    }
    public void hienThongTin(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Luong co ban: "+luongCoBan);
    }
}
