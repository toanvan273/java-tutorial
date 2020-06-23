package baitapDaopattern2;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhvienMain {
    public static void main(String[] args) {
        SinhVienImpl svEmp = new SinhVienImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so SV:");
        int soSV = scanner.nextInt();

        for (int i = 0; i < soSV; i++) {
            SinhVien s = new SinhVien();
            s.input();
            svEmp.addSinhvien(s);
        }

        for (SinhVien sv: svEmp.getAllSinhvien()){
            System.out.println("ID: "+sv.getID()+" Ten: "+sv.getName()+" Diem: "+sv.getScore());
        }

        System.out.println("Ban co muon xoa SV nao ko? 1: Yes , 2: No");
        int chose = scanner.nextInt();
        if(chose==1){
            System.out.println("Nhap ID sv muon xoa");
            String IDxoa = scanner.nextLine();
            SinhVien s = svEmp.getSinhvien(IDxoa).get();
            System.out.println("s: "+s);
//            svEmp.deleteSinhvien(svEmp.getSinhvien(IDxoa).get());
        }else if(chose==2){
            System.out.println("Nghỉ nghỉ");

        }else {
            System.out.println("Chon sai roi, ong noi oi");
        }
        for (SinhVien sv: svEmp.getAllSinhvien()){
            System.out.println("ID: "+sv.getID()+" Ten: "+sv.getName()+" Diem: "+sv.getScore());
        }
    }
}
