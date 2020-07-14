package baitapDaopattern2;

import java.util.ArrayList;

public class ThemSuaXoaObj {
    public static void main(String[] args) {
        ArrayList<SinhVien> listHS = new ArrayList<>();
        SinhVien a = new SinhVien("098","Nguyen Van A",9.8f);
        listHS.add(a);
        SinhVien b = new SinhVien("0123","Nguyen Van B",6.2f);
        listHS.add(b);
        SinhVien c = new SinhVien("ko90","Hoang Van C",3.2f);
        listHS.add(c);
        System.out.println("Thong tin hoc sinh da them la: ");
        for (int i = 0; i < listHS.size(); i++) {
            System.out.println(listHS.get(i).getName()+" "+listHS.get(i).getScore());
        }
        SinhVien AdSV = new SinhVien("98qk","Nguyen Tu D",9);
        listHS.add(AdSV);
        System.out.println(listHS.size());
        for(SinhVien sv: listHS){
            System.out.println(sv.getName());
        }
        SinhVien e = new SinhVien("E001","Sinh Vien Ten E",9);
        listHS.add(0,e);

        System.out.println(listHS.size());
        for(SinhVien sv: listHS){
            System.out.println(sv.getName());
        }
        listHS.remove(2);
        System.out.println("Xoa 1"+listHS.size());
        for(SinhVien sv: listHS){
            System.out.println(sv.getName());
        }
        SinhVien setSV = new SinhVien("HA01","Nguyen Hoang Anh",1);
        listHS.set(1,setSV);
        System.out.println("Set 1: "+listHS.size());
        for(SinhVien sv: listHS){
            System.out.println(sv.getName());
        }
        for (SinhVien sv:listHS) {
            if(sv.getID().equals("E001")){
                System.out.println(sv.getName());
            }
        }
    }
}
