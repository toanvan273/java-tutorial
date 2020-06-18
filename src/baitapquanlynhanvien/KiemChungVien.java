package baitapquanlynhanvien;

import java.util.Scanner;

public class KiemChungVien extends NhanVien{
    private int soLoi;
//    public KiemChungVien(){
//        super();
//    }
//    public KiemChungVien(int soLoi){
//        super();
//        this.soLoi=soLoi;
//    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so Loi thang nay:");
        soLoi=scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong=this.luongCoBan+this.soLoi*50000;
        return this.luong;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("So Loi thang nay: "+soLoi);
        System.out.println("Luong thang nay: "+luong);
    }
}
