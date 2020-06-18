package baitapquanlythuvien;

import java.util.Scanner;

class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;
    public TaiLieu(){
        super();
    }
    public TaiLieu(String maTaiLieu,String tenNhaXuatBan,int soBanPhatHanh){
        super();
        this.maTaiLieu=maTaiLieu;
        this.tenNhaXuatBan=tenNhaXuatBan;
        this.soBanPhatHanh=soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu:");
        maTaiLieu=scanner.nextLine();
        System.out.println("Nhap ten nha xuat ban:");
        tenNhaXuatBan=scanner.nextLine();
        System.out.println("Nhap so ban phat hanh:");
        soBanPhatHanh=scanner.nextInt();
    }
    public void output(){
        System.out.printf("");
        System.out.println("Ma tai lieu: "+maTaiLieu);
        System.out.println("Nha xuat ban: "+tenNhaXuatBan);
        System.out.println("So ban phat hanh: "+soBanPhatHanh);
    }
}

class Sach extends TaiLieu{
    private String tenTacgia;
    private int soTrang;

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten tac gia:");
        tenTacgia=scanner.nextLine();
        System.out.println("Nhap so trang:");
        soTrang=scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Ten tac gia: "+tenTacgia);
        System.out.println("So trang: "+soTrang);
    }
}
class Tapchi extends TaiLieu{
    private int soPhathanh, thangPhathanh;

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so phat hanh: ");
        soPhathanh=scanner.nextInt();
        System.out.println("Nhap thang phat hanh: ");
        thangPhathanh=scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("So phat hanh: "+soPhathanh);
        System.out.println("Thang phat hanh: "+thangPhathanh);
    }
}
class Bao extends TaiLieu{
    private String ngayPhathanh;

    @Override
    public void input() {
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ngay phat hanh: ");
        ngayPhathanh=scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Ngay phat hanh: "+ngayPhathanh);
    }
}
