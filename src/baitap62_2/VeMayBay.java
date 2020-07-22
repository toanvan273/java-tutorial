package baitap62_2;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VeMayBay implements Serializable {

    String id;
    String name;
    String date;
    String bag;
    int price;

    public VeMayBay() {}

    public VeMayBay(String id, String name, String date, String bag, int price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.bag = bag;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public  void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma ve :");

        while (true){
            id = scanner.nextLine();
            String pattermStr = "";
            if(id.startsWith("VJ")){
                pattermStr = "VJ[1-9]{1}[0-9]{2}";
            }else if(id.startsWith("VN")){
                pattermStr = "VN[1-9]{1}[0-9]{2}";
            }else if(id.startsWith("JET")){
                pattermStr = "JET[1-9]{1}[0-9]{2}";
            }else {
                System.err.println("Nhap lai nha :");
                continue;
            }
            System.out.println("ID :"+id);
            System.out.println("pattermStr :"+pattermStr);

            Pattern pattern = Pattern.compile(pattermStr);
            System.out.println("P :"+pattern);
            Matcher matcher = pattern.matcher(id);
            if(matcher.find()){
                System.out.println("Dung roi!"+matcher.find());
                break;
            }else {
                System.err.println("Nhap lai :");
            }
        }
        System.out.println("Nhap ten chuyen bay :");
        name = scanner.nextLine();

        System.out.println("ngay bay :");
        date = scanner.nextLine();

        System.out.println("Nhap gia :");
        price = Integer.parseInt(scanner.nextLine());


    }
    @Override
    public String toString() {
        return "VeMayBay{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", bag='" + bag + '\'' +
                ", price=" + price +
                '}';
    }
    public  void display(){
        System.out.println(toString());
    }
}
