package trutuong;
// Lop truu tuong Shape
abstract  class Shape{
    abstract void draw();
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("ve hinh chu nhat");
    }
}
class Circle1 extends Shape {
    @Override
    void draw() {
        System.out.println("Ve hinhd TRON");
    }
}
class TestAbstraction1 {

    public static void main(String[] args) {
        Shape c = new Circle1();
        Shape n = new Rectangle();
        n.draw();
    }
}
