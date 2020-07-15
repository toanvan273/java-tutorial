package baitapCollection;

public class  StudentX extends People {
    public String rollNo;

    public StudentX(String rollNo, String fullName) {
        this.rollNo = rollNo;
        this.fullName = fullName;
    }
    public  void output(){
        System.out.println("rollNo:"+rollNo);
        System.out.println("fullName:"+fullName);
    }
}
