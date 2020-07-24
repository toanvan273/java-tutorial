package baitap52_7_gson;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    String fullname;
    String birthday;
    String email;
    String address;
    String gender;

    public Student() {
    }

    public Student(String fullname, String birthday, String email, String address, String gender) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        fullname = input.nextLine();

        System.out.println("Nhap ngay sinh : ");
        birthday = input.nextLine();

        System.out.println("Nhap email : ");
        email = input.nextLine();

        System.out.println("Nhap gioi tinh : ");
        gender = input.nextLine();
    }
    public void display(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
