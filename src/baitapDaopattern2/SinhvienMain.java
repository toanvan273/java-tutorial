package baitapDaopattern2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class SinhvienMain {

    public static void main(String[] args) throws IOException {
        SinhVienImpl svEmp = new SinhVienImpl();
        SinhVien e0 = new SinhVien("0123","Toan",9);
        SinhVien e1 = new SinhVien("D129","Minh bao",8);
        SinhVien e2 = new SinhVien("P134","Aleat",9.5f);
        svEmp.addSinhvien(e0);
        svEmp.addSinhvien(e1);
        svEmp.addSinhvien(e2);
        for (SinhVien sv: svEmp.getAllSinhvien()){
            System.out.println("ID: "+sv.getID()+" Ten: "+sv.getName()+" Diem: "+sv.getScore());
//            System.out.println();
        }
    }
}



//            try{
////                FileOutputStream f = new FileOutputStream("D:\\sinhvien.dat");
//                FileOutputStream f = new FileOutputStream("sv.txt",StandardCharsets.UTF_8);
//                ObjectOutputStream ot = new ObjectOutputStream(f);
//                ot.writeObject(s);
//                ot.close();
//                f.close();
//            }catch (IOException e){
//                System.out.println("Co loi roi ma");
//            }