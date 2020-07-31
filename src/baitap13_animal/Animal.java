package baitap13_animal;


import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Animal implements Serializable {
     private    String id;
     String Ten;
    int Tuoi;
    String MoTa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public Animal() {}
    public Animal(String ten, int tuoi, String moTa) {
        Ten = ten;
        Tuoi = tuoi;
        MoTa = moTa;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID");
        while (true){
            id = scanner.nextLine();
            String parternStr = "";
            if(id.startsWith("DOG")){
                parternStr = "DOG[1-9]{1}[0-9]{2}";
            }else if(id.startsWith("CAT")){
                parternStr = "CAT[1-9]{1}[0-9]{2}";
            }else if(id.startsWith("TIG")){
                parternStr = "TIG[1-9]{1}[0-9]{2}";
            }else {
                System.out.println("Nhap lai ID ong noi oi !!!");
                continue;
            }
            Pattern patte = Pattern.compile(parternStr);
            Matcher matcher = patte.matcher(id);
            if(matcher.find()){
                break;
            }else {
                System.out.println("Nhap lai ID nha !");
            }
        }
        System.out.println("Nhap ten Animail :");
        Ten = scanner.nextLine();
        System.out.println("Nhap mo ta");
        MoTa = scanner.nextLine();
        System.out.println("Nhap tuoi Animal :");
        Tuoi = scanner.nextInt();

    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", Ten='" + Ten + '\'' +
                ", Tuoi=" + Tuoi +
                ", MoTa='" + MoTa + '\'' +
                '}' ;
    }

    public void xemThongTin(){
        System.out.println(toString());
    }
    public abstract void sound();
}
