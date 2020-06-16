package baitapquanlyhocsinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<HoSoHocSinh> arrHoSo = new ArrayList<>();
        int n;
        HoSoHocSinh hoSoHocSinh;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so hoc sinh: ");
        n = scanner.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin hoc sinh thu "+(i+1)+": ");
            hoSoHocSinh = new HoSoHocSinh();
            hoSoHocSinh.nhapThongTinHoSo();
            arrHoSo.add(hoSoHocSinh);
        }
        for(int i=0;i<arrHoSo.size();i++){
            System.out.println("\nThong tin hoc sinh thu "+(i+1)+": ");
            arrHoSo.get(i).hienThiThongTinHoSo();
        }
        System.out.println("\n Nhung hoc sinh hoc gioi");
        for(int i=0;i<arrHoSo.size();i++){
            if(arrHoSo.get(i).getDiemTB()>=8){
                arrHoSo.get(i).hienThiThongTinHoSo();
            }
        }
    }
}
