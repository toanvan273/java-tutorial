package baitap52_7_gson;

public class ClassRoom {
    Information information;
    Student[] studentList;

    public ClassRoom() {
    }
    public void display(){
        information.display();
        for (Student student: studentList) {
            student.display();
        }
    }
}
