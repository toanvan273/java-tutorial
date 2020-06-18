package baitapquanlynhanvien;

import java.util.Scanner;

public class MainStaff {
    public static void main(String[] args) {
        int luongTrungBinh=0,tongLuong=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nhan vien trong cong ty:");
        int soNhanVien = scanner.nextInt();
        NhanVien[] nhanViens = new NhanVien[soNhanVien];

        System.out.println("Nhap thong tin nhan vien: ");
        for(int i=0;i<soNhanVien;i++){
            System.out.println("Nhap thong tin nhan vien thu "+(i+1)+": ");
            System.out.println("Chon loai nhan vien: 1-Nhan vien Lap tring, 2-Nhan vien kiem chung, 3-BA");
            int choose = scanner.nextInt();
            if(choose==1){
                nhanViens[i]= new LapTrinhVien();
            }else if(choose==2){
                nhanViens[i]= new KiemChungVien();
            }else if(choose==3){
                nhanViens[i]=new BA();
            }
            nhanViens[i].nhapThongTin();
            nhanViens[i].tinhLuong();
        }

        System.out.println("Thông tin nhân viên trong công ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            nhanViens[i].hienThongTin();
        }
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong=tongLuong+nhanViens[i].luong;
        }
        luongTrungBinh=tongLuong/soNhanVien;
        System.out.println("Tong luong cty: "+tongLuong);
        System.out.println("========================Luong TB:"+luongTrungBinh);
        for (int i = 0; i < soNhanVien; i++) {
            if(nhanViens[i].tinhLuong()<luongTrungBinh){
                System.out.println("Luong nhan vien:"+nhanViens[i].tinhLuong());
            }
        }
    }
}
