package Oop.static_fields_and_methods;
/*
- Thao tác chỉ với các thành phần static (gồm trường và phương thức)
 - Không cần có đối tượng để thao tác
 - Tất cả những gì cần thiết đã được cung cấp cho phương thức qua tham số
* */
public class Bai44 {
    private String something = "Something";
    private static String otherThing = "Other thing";

    public static void main(String[] args) {
//        System.out.println(something);
//        otherShow(22);
//        show(22);
    }
    public void show(int n){
        System.out.println(n);
    }
    public static void otherShow(int n){
        System.out.println(n);
    }
}
