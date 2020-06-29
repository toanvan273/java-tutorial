package baitapDaopattern2;

import java.util.Scanner;

public class SinhVien {
    private String ID;
    private String name;
    private float score;
    public SinhVien(String ID,String name,float score){
        this.ID = ID;
        this.name = name;
        this.score = score;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID:");
        ID = scanner.nextLine();
        System.out.println("Nhap name: ");
        name = scanner.nextLine();
        System.out.println("Nhap Score: ");
        score =  scanner.nextFloat();
    }
}
