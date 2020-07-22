package baitap62_2;

import com.sun.source.tree.LiteralTree;

import java.io.*;
import java.util.*;

public class QuanLyBay {
    static  Scanner input = new Scanner(System.in);
    static List<VeMayBay> list = new ArrayList<>();
    public static void main(String[] args) {


        int choose;
        do{
            showMenu();
            choose = input.nextInt();
            switch (choose){
                case 0:
                    for (VeMayBay veMayBay:list) {
                        veMayBay.display();
                    }
                    break;
                case 1:
                    input(list);
                    break;
                case 2:
                    save(list,"quanlybay.dat");
                    break;
                case 3:
                    read("quanlybay.dat");
                    break;
                case 4:
                    sort(list);
                    break;
                case 5:
                    saveByAirLine(list);
                    break;
                case 6:
                    System.out.println("In list Vietnam Airline");
                    read("vnAirline.dat");
                    break;
                case 7:
                    System.out.println("In list VietJet Air");
                    read("vjAirline.dat");
                    break;
                case 8:
                    System.out.println("In list Jetstar");
                    read("jestarAirline.dat");
                    break;
                case 9:
                    remove(list);
                    break;
                case 10:
                    System.out.println("Thoat !!!");
                    break;
                default:
                    continue;
            }
        }while (choose!=10);
    }
    static void remove(List<VeMayBay> list){
        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
        System.out.println("Xoa ve co id la");

        String uID = scanner.nextLine();
        System.out.println("list :"+list);
        System.out.println("uID ===>"+uID);
        Iterator<VeMayBay> iterable = list.iterator();
        while (iterable.hasNext()){
            VeMayBay veMayBay = iterable.next();
            if(uID.equals(veMayBay.getId())){
                iterable.remove();
            }
        }

        System.out.println("List :"+list);
    }
    static void input(List<VeMayBay> list){
        System.out.println("Nhap so ve tren chuyen bay");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            VeMayBay veMayBay= new VeMayBay();
            veMayBay.input();
            list.add(veMayBay);
        }
    }
    static void save(List<VeMayBay> list, String fileName){
        FileOutputStream fos = null;
        ObjectOutputStream ois = null;
        try{
            fos = new FileOutputStream(fileName);
            ois = new ObjectOutputStream(fos);
            ois.writeObject(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(fos!=null) fos.close();
                if(ois!=null) ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    static void read(String nameFile){
        FileInputStream fo = null;
        ObjectInputStream os =null;
        try{
            fo = new FileInputStream(nameFile);
            os = new ObjectInputStream(fo);
            list = (List<VeMayBay>) os.readObject();
            System.out.println("======>"+list);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fo.close();
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(list.size()>0){
            for (int i = 0; i < list.size(); i++) {
                list.get(i).display();
            }
        }
    }
    static void sort(List<VeMayBay> list){
        Collections.sort(list,(o1,o2)->o1.getPrice()<o2.getPrice()?-1:1);
        System.out.println("sort:" +list);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
    }
    static void saveByAirLine(List<VeMayBay> list){
        List<VeMayBay> vnAirlineList = getAirline(list,"VN");
        save(vnAirlineList,"vnAirline.dat");

        List<VeMayBay> vjAirlineList = getAirline(list,"VJ");
        save(vjAirlineList,"vjAirline.dat");

        List<VeMayBay> jestarAirline = getAirline(list,"JET");
        save(jestarAirline, "jestarAirline.dat");
    }
    static List<VeMayBay> getAirline(List<VeMayBay> list,String prex){
        List<VeMayBay> airlineList = new ArrayList<>();
        for (VeMayBay veMayBay: list) {
            if(veMayBay.getId().startsWith(prex)) airlineList.add(veMayBay);
        }
        System.out.println("airlineList :"+airlineList);
        return  airlineList;
    }
    static void showMenu(){
        System.out.println("-------------------------------------------------");
        System.out.println("0. Hien thi List");
        System.out.println("1. Nhap thong tin N chuyen bay");
        System.out.println("2. Luu thong tin");
        System.out.println("3. Doc thong tin tu file & hien thi");
        System.out.println("4. Sap xep theo gia");
        System.out.println("5. In thong tin moi hang bay ra 1 file");
        System.out.println("6. In list Vietnam Airline");
        System.out.println("7. In list VietJet Air");
        System.out.println("8. In list Jetstar");
        System.out.println("9. Xoa ve co ID la");
        System.out.println("10. Thoat!");
        System.out.println("Choose");
    }
}
