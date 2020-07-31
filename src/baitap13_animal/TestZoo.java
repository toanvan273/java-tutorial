package baitap13_animal;

import baitap62_2.VeMayBay;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestZoo {
    static Scanner scanner = new Scanner(System.in);
    static Zoo zoo = new Zoo();

    public static void main(String[] args) {
        int choose;
        do {
            menu();
            choose=scanner.nextInt();
            switch (choose){
                case 0:
                    showChuong(zoo);
                    break;
                case 1:
                    addNewChuong(zoo);
                    break;
                case 2:
                    removeChuong(zoo);
                    break;
                case 3:
                    addNewAnimal(zoo);
                    break;
                case 4:
                    removeAnimal(zoo);
                    break;
                case 5:
                    xemAllAnimal(zoo);
                    break;
                case 6:
                    save(zoo, "zoofile.dat");
                    break;
                case 7:
                    read("zoofile.dat");
                    break;
            }
        }while (choose!=10);
    }
    static void xemAllAnimal(Zoo zoo){
        for (Chuong chuong: zoo.danhSachChuong) {
            Iterator<Animal> iterato = chuong.animalList.iterator();
            while (iterato.hasNext()){
                Animal animal = iterato.next();
                animal.xemThongTin();
            }
        }
    }
    static void removeAnimal(Zoo zoo){
        scanner.nextLine();
        System.out.println("Nhap ID Animal muon xoa");
        String idA = scanner.nextLine();
        int cout = 0;
        for (Chuong chuong: zoo.danhSachChuong) {
            Iterator<Animal> iterato = chuong.animalList.iterator();
            while (iterato.hasNext()){
                Animal animal = iterato.next();
                if(animal.getId().equals(idA)){
                    iterato.remove();
                    cout++;
                }
            }
        }
        if (cout>0){
            System.out.println("ID :"+idA+" da dc xoa");
            save(zoo, "zoofile.dat");
        }else{
            System.out.println("ID : "+idA+ " Không tồn tại");
        }

    }
    static void addNewAnimal(Zoo zoo){
        System.out.println("Nhap ma chuong");
        while (true){
            int maC = scanner.nextInt();
            Chuong c = zoo.getChuong(maC);
            if(c!=null){
                c.addAnimal();
                break;
            }else {
                System.out.println("Nhap lai ID chuong nhe !");
            }
        }
        save(zoo, "zoofile.dat");
    }
    static void showChuong(Zoo z){
        System.out.println( "Show zoo :" +z.danhSachChuong);
        for (Chuong chuong: z.danhSachChuong) {
            chuong.displayChuong();
        }
    }
    static void read(String nameFile){
        FileInputStream fo = null;
        ObjectInputStream os =null;
        try{
            fo = new FileInputStream(nameFile);
            os = new ObjectInputStream(fo);
            zoo = (Zoo) os.readObject();
            System.out.println("======>"+zoo);
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
        System.out.println("zoo : "+zoo.danhSachChuong);
    }
    static void save(Zoo zoo, String fileName){
        FileOutputStream fos = null;
        ObjectOutputStream ois = null;
        try{
            fos = new FileOutputStream(fileName);
            ois = new ObjectOutputStream(fos);
            ois.writeObject(zoo);
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
    static void removeChuong(Zoo zoo){
        System.out.println("Nhap ma chuong ban muon xoa :");
        int maChuong = scanner.nextInt();
        zoo.xoaChuong(maChuong);
    }
    static void addNewChuong(Zoo zoo){
        System.out.println("Nhap ma chuong: ");
        int maChuong = scanner.nextInt();
        System.out.println("MA chuong :"+maChuong);
        zoo.themChuong(new Chuong(maChuong));
    }
    static void menu(){
        System.out.println("0. Show Chuong");
        System.out.println("1. Them chuong");
        System.out.println("2. Xoa chuong");
        System.out.println("3. Them con vat");
        System.out.println("4. Xoa con vat");
        System.out.println("5. Xem tat ca cac con vat");
        System.out.println("6. Luu file");
        System.out.println("7. Doc file");
        System.out.println("10. Thoat");
        System.out.println("choose");
    }
}
