package baitapDaopattern2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class SinhvienMain {
    public void obWrite(SinhVien s) throws FileNotFoundException {
//        FilterOutputStream f = new FilterOutputStream();
    }
    public static void main(String[] args) throws IOException {
        SinhVienImpl svEmp = new SinhVienImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so SV:");
        int soSV = scanner.nextInt();

        for (int i = 0; i < soSV; i++) {
            SinhVien s = new SinhVien();
            s.input();
            svEmp.addSinhvien(s);
            try{
//                FileOutputStream f = new FileOutputStream("D:\\sinhvien.dat");
                FileOutputStream f = new FileOutputStream("sv.txt");
                ObjectOutputStream ot = new ObjectOutputStream(f);
                ot.writeObject(s);
                ot.close();
                f.close();
            }catch (IOException e){
                System.out.println("Co loi roi ma");
            }
        }

//        for (SinhVien sv: svEmp.getAllSinhvien()){
//            System.out.println("ID: "+sv.getID()+" Ten: "+sv.getName()+" Diem: "+sv.getScore());
//        }

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
