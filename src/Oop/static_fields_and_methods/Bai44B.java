package Oop.static_fields_and_methods;

import java.text.NumberFormat;

public class Bai44B {
    public static void main(String[] args) {

//        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
//        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
//        double x = 0.1;
//        System.out.println(currencyFormatter.format(x));
        Student student = StudentFactory.getStudentInstance();
        Student student1 = StudentFactory.getStudentInstance();
        Student student2 = StudentFactory.getPercentMethod();
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
    }
}
