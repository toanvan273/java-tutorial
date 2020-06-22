package baitapinterface;
interface printable{
     void print();
}
interface showable{
    void show();
}
public class A6 implements printable,showable {
    @Override
    public void print() {
        System.out.println("hello");
    }
    public void show(){
        System.out.println("Bio");
    }
    public static void main(String[] args) {
        A6 obj = new  A6();
        obj.print();
        obj.show();
    }
}
