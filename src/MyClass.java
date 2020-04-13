//public class MyClass {
//    final int x =10;
//    public static final int myNumber = 90;
//
//    public static void main(String[] args) {
//      MyClass mobj = new MyClass();
//      mobj.x = 400;
//        System.out.println(mobj.x);
//    }
//}
// --> tao Obj trong class
//public  class  MyClass {
//    int x = 5;
//    public static void main(String[] args) {
//        MyClass obj1 = new MyClass();
//        MyClass obj2 = new MyClass();
//        obj2.x = 10;
//        System.out.println(obj1.x);
//        System.out.println(obj2.x);
//    }
//}
// ---> Method
//public  class  MyClass {
//  static void  myStaticMethod(){
//      System.out.println("Static Method");
//  }
//  public void myPuplicMethod(){
//      System.out.println("Puplic Method");
//  }
//    public static void main(String[] args) {
//        myStaticMethod();
//        MyClass obj = new MyClass();
//        obj.myPuplicMethod();
//    }
//}
//-------> Constructor
//public  class  MyClass {
//        int x,y;
//      public MyClass(int number){
//          x = number;
//      }
//    public static void main(String[] args) {
//        MyClass obj = new MyClass(50);
//        System.out.println(obj.x);
////        System.out.println(obj.y);
//    }
//}
// ------->
import java.util.Scanner;
public  class  MyClass {
    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println(obj.getName());
        obj.setName("Test name");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Endter username");
        String userName = myObj.nextLine();
        System.out.println("U name is : "+ userName);
    }
}