package JavaOop;

import model.Student;

/*
* Làm sao để:
* - Gán giá trị trong phương thức mà tham số trùng với thuộc tính
* - Gọi phương thức khởi tạo khác
* */
public class Java40 {
    public static void main(String[] args) {
        Student student = new Student("BM0062P01",1990,1.534f, "CNTT");
        System.out.println("StudentID : "+ student.getStudentID());
        System.out.println("Mark : "+ student.getStudentMark());
    }
}
