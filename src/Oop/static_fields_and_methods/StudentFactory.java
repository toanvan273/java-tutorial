package Oop.static_fields_and_methods;

public class StudentFactory {
    public static Student student = new Student();
    public static Student getStudentInstance(){
        return student;
    }
    public static Student getPercentMethod(){
        return new Student();
    }
}
