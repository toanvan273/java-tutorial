package trutuong;
interface A{
    void a();
    abstract  void b();
    public void c();
    public abstract  void d();
}
abstract class B implements A{
    public void c(){
        System.out.println("I am C");
    }
}
class M extends B {
    @Override
    public void a() {
        System.out.println("I am A");
    }

    @Override
    public void b() {
        System.out.println("I am B");
    }

    @Override
    public void d() {
        System.out.println("I am D");
    }
}
public class Test5 {
    public static void main(String[] args) {
        A x = new M();
        x.a();
        x.c();
    }
}
