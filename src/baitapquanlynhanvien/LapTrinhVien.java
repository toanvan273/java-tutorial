package baitapquanlynhanvien;

import java.util.Scanner;

public class LapTrinhVien extends NhanVien{
    private int gioLamThem;
//    public LapTrinhVien(){
//        super();
//    }
//    public LapTrinhVien(int gioLamThem){
//        super();
//        this.gioLamThem=gioLamThem;
//    }

    public float getGioLamThem() {
        return gioLamThem;
    }

    public void setGioLamThem(int gioLamThem) {
        this.gioLamThem = gioLamThem;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap so gio lam them: ");
        Scanner scanner = new Scanner(System.in);
        gioLamThem=scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong=this.luongCoBan+this.gioLamThem*200000;
        return this.luong;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("So gio lam them: "+gioLamThem);
        System.out.println("Tong luong thang nay: "+luong);
    }
}
