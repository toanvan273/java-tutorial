package baitapquanlythuvien;

import java.util.Scanner;

public class QLThuVien {


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Co bao nhieu tai lieu: ");
        int soTaiLieu = scanner.nextInt();
        TaiLieu[] taiLieus = new TaiLieu[soTaiLieu];
        for (int i = 0; i < soTaiLieu; i++) {
            System.out.println("Nhap loai tai lieu gom: sach  -  bao - tapchi");
            String type=scanner.nextLine();
            switch (type){
                case "sach":
                    taiLieus[i]=new Sach();
                    break;
                case "bao":
                    taiLieus[i]=new Bao();
                    break;
                case "tapchi":
                    taiLieus[i]=new Tapchi();
                    break;
                default:
                    i--;
                    continue;
            }
            taiLieus[i].input();
        }

        for (int i = 0; i < soTaiLieu; i++) {
            if(taiLieus[i].getTenNhaXuatBan().equals("Fahasa")){
                taiLieus[i].output();
            }
        }
        for (int i = 0; i < soTaiLieu; i++) {
            System.out.println(taiLieus[i].getTenNhaXuatBan());
            System.out.println("-------------"+taiLieus[i].getTenNhaXuatBan().equals("Fahasa"));
            System.out.println("++++++++++++++"+taiLieus[i].getTenNhaXuatBan()=="Fahasa");
        }
    }
}
