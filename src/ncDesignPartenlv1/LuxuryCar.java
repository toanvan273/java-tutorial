package ncDesignPartenlv1;

public class LuxuryCar extends Car{
    public LuxuryCar(String name) {
        super(name);
    }

    @Override
    public void showDescription() {
        System.out.println("Luxury Car Name : "+name);
    }
    public void showAll(){
        System.out.println("Show All Info");
    }
}
