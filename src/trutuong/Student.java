package trutuong;


//import model.Student;

import java.util.Objects;

public class Student implements Cloneable{
    int rollno;
    String name;

     Student(int rollno, String name){
//        this.rollno = rollno;
        this.name = name;
    }
    void S(String str){
         this.name = str;
    }
    public  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(101,"An");
        Student s2 = (Student) s1.clone();
        Student s3 = new Student(101,"An");
        System.out.println(s1.name + " "+ s1.rollno);
        //System.out.println(s2.name + " "+s2.rollno);
        System.out.println(s1.equals(s2) );

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno, name);
    }
}
