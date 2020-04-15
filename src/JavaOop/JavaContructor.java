package JavaOop;

import model.Student;

import java.util.Scanner;

/* Phương thức khởi tạo*/
/*
* * Dùng để khởi tạo giá trị cho đối tượng class tương ứng
* Cùng tên với class
* Một lớp có thể có > 1 contructor
* Một phương thức khởi tạo có thể óc 0 , 1 hoặc nhiều tham số
* Contructor ko trả về return
*
* */
public class JavaContructor {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("ID :" + student.getStudentID());
        System.out.println("Years :"+ student.getStudentYear());
    }
}
