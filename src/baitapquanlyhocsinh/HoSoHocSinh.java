package baitapquanlyhocsinh;

import java.util.Scanner;

public class HoSoHocSinh {
    private String lop;
    private int diemTB;
    private Nguoi nguoi;
    public HoSoHocSinh(){
        super();
    }
    public HoSoHocSinh(String lop, Nguoi nguoi, int diemTB){
        super();
        this.nguoi=nguoi;
        this.lop=lop;
        this.diemTB=diemTB;

    }

    public int getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }
    public void nhapThongTinHoSo(){
        nguoi= new Nguoi();
        nguoi.nhapThongTin();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lop: ");
        lop = scanner.nextLine();
        System.out.println("Nhap diem TB: ");
        diemTB=scanner.nextInt();
    }
    public void hienThiThongTinHoSo(){
        nguoi.hienThiThongTin();
        System.out.println("Lop: "+lop);
        System.out.println("Diem TB: "+diemTB);
    }
}
