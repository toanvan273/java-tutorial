package Oop;
/* Đối tượng và biến đối tượng */
public class Java42 {
    public static void main(String[] args) {
        new A(); // là 1 đối tượng
        A a1 =   new A(); // a1, a2 là biến đối tượng
        A a2 = a1;
        System.out.println(a1.toString()); // chỉ in ra đc địa chỉ của a1
        System.out.println(a2);
    }
}
