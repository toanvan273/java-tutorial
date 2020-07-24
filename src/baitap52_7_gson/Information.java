package baitap52_7_gson;

public class Information {
    String name;
    String address;

    public Information() {
    }

    public Information(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
}
