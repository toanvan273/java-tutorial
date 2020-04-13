//abstract  class  Person {
//    public String fname = "John";
//    public int age = 24;
//    public abstract void study();
//}
//class Student extends Person {
//    public  int graduationYear = 2018;
//    @Override
//    public void study() {
//        System.out.println("Studying all day long");
//    }
//}

//public  class  Person {
//    String fname = "John";
//    String lname = "Doe";
//    int age = 24;
//    public static void main(String[] args) {
//    Person obj = new Person();
//        System.out.println("Name : "+ obj.fname + " " + obj.lname);
//        System.out.println("Age: "+obj.age);
//    }
//}
// ====> Setter + Getter
public class  Person {
    private String name;
    // Getter
    public  String getName(){
        return "Ten cua ban la: " + name;
    }
    // Setter
    public  void setName(String newName){
        this.name = newName;
    }
}