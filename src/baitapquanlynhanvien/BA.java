package baitapquanlynhanvien;

import java.util.Scanner;

public class BA extends NhanVien {
    private int soBug;
    public BA(){
        super();
    }
    public BA(int soBug){
        super();
        this.soBug=soBug;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so Bug thang nay:");
        soBug=scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong=this.luongCoBan+this.soBug*100000;
        return this.luong;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("So Bug tim duoc thang nay: "+soBug);
        System.out.println("Luong thang nay: "+luong);
    }
}
