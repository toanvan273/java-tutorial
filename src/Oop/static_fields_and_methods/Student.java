package Oop.static_fields_and_methods;

public class Student {
    private String name;
    private String address;
    private int studentID;

    public static int id = 1000;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID() {
        studentID = id;
        id++;
    }
}
