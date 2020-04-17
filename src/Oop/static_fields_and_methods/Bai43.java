package Oop.static_fields_and_methods;
/*
* - Trường static
* - Hằng số static
* - Phương thức static
* - Các phương thức factory
* - Phương thức main
* b43: các trường và hằng số static
* b44: các phương thức static, giới thiệu phương thức factory
* b45: Tại sao main là phương thức static
* */
public class Bai43 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentID();

        Student student2 = new Student();
        student2.setStudentID();

        Student student3 = new Student();
        student3.setStudentID();

        Student student4 = new Student();

        student4.setStudentID();
        System.out.println(student1.getStudentID());
        System.out.println(student2.getStudentID());
        System.out.println(student3.getStudentID());
        System.out.println(student4.getStudentID());
    }
}
