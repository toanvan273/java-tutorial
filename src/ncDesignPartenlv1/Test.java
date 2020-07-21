package ncDesignPartenlv1;

public class Test {
    public static void main(String[] args) {
        CarMgr carMgr =  CarMgr.getInstance();
        carMgr.add(new Car("A"));
        carMgr.add(new LuxuryCar("B lux"));
        CarMgr.getInstance().add(new LuxuryCar("Car vip"));
        carMgr.showAll();
    }
}
