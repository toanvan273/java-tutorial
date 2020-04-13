// ---> Method Non-Static

//public class Car {
//    public void fullThrotte(){
//        System.out.println("Car is running...");
//    }
//    public void speed(int maxSpeed){
//        System.out.println("Max speed is: "+ maxSpeed);
//    }
//
//    public static void main(String[] args) {
//        Car thisCar = new Car();
//        thisCar.fullThrotte();
//        thisCar.speed(100);
//    }
//}

public class Car {
    private  String fName = "Truong";
    private String lName = "Toan";
    private String Email = "truongvantoan.neu@gmail.com";
    final int age = 14;
    private int modelYear;
    private String modeName;
    public Car(int year, String name){
        modelYear = year;
        modeName = name;
    }
    static void staticMethod(){
        System.out.println("this is static Method");
    }
    public void fullThrotte(){
        System.out.println("Car is running...");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is: "+ maxSpeed);
    }


    public static void main(String[] args) {
//        Car newCar = new Car(1990, "Mutag");
//        System.out.println(newCar.modelYear + " "+ newCar.modeName);
//        newCar.fullThrotte();
//        newCar.speed(2000);
//        staticMethod();
        Car myObj = new Car(2000,"12Toan");
        int c = myObj.age;
        System.out.println(c);
        System.out.println("Name :"+myObj.fName);
    }
}