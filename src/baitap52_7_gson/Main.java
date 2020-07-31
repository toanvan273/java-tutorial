package baitap52_7_gson;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassRoom[] classRooms=null;
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            choose = input.nextInt();
            switch (choose){
                case 1:
                    classRooms = input();
                    break;
                case 2:
                    display(classRooms);
                    break;
                case 3:
                    save(classRooms);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("input fail");
                    break;
            }
        }while (choose!=4);
    }
     static void save(ClassRoom[] classRooms){
        for (int i = 0; i < classRooms.length; i++) {
            ClassRoom room = classRooms[i];
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
            fos = new FileOutputStream(room.information.name+".dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(room);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(fos!=null){
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(oos!=null){
                    try {
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static ClassRoom[] input() {
        ClassRoom[] classRooms;
        StringBuilder builder = new StringBuilder();
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("students.json");
             int code;
             while ((code = fis.read())!=-1){
                builder.append((char) code);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String soudce = builder.toString();
//        JsonArray array = new JsonArray(soudce);
//        for (int i = 0; i < array.size(); i++) {
//            JsonObject obj = array.
//        }

        Gson gson = new Gson();
        classRooms = gson.fromJson(builder.toString(), ClassRoom[].class);
        return classRooms;
    }

    static void display(ClassRoom[] classRooms){
        if(classRooms==null)return;
        for (int i = 0; i < classRooms.length; i++) {
            classRooms[i].display();
        }
    }
    static void showMenu(){
        System.out.println("1. Nhap thong tin tu file student.json");
        System.out.println("2. Hien thi thong tin sinh vien");
        System.out.println("3. Luu thong tin moi lop hoc vao 1 file ten_lop.obj");
        System.out.println("4. Thoat");
        System.out.println("Choose");
    }
}
