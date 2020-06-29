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


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so SV:");
//        int soSV = scanner.nextInt();
//
//        for (int i = 0; i < soSV; i++) {
//            SinhVien s = new SinhVien();
//            s.input();
//            svEmp.addSinhvien(s);
//        }
//
        for (SinhVien sv: svEmp.getAllSinhvien()){
            System.out.println("ID: "+sv.getID()+" Ten: "+sv.getName()+" Diem: "+sv.getScore());
        }

//        FileWriter myWriter = new FileWriter("file.txt", StandardCharsets.UTF_8);
//        myWriter.write("Files in Java might be tricky, but it is fun enough!");
//        int chose = scanner.nextInt();
//        if(chose==1){
//            System.out.println("Nhap ID sv muon xoa");
//            String IDxoa = scanner.nextLine();
//            SinhVien s = svEmp.getSinhvien(IDxoa).get();
//            System.out.println("s: "+s.toString());
//        }else if(chose==2){
//            System.out.println("Nghỉ nghỉ");
//
//        }else {
//            System.out.println("Chon sai roi, ong noi oi");
//        }
//        for (SinhVien sv: svEmp.getAllSinhvien()){
//            System.out.println("ID: "+sv.getID()+" Ten: "+sv.getName()+" Diem: "+sv.getScore());
//        }
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