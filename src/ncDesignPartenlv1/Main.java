package ncDesignPartenlv1;

public class Main {
    public static void main(String[] args) {
        Car car,luxuryCar;
        car = new Car("A");
        luxuryCar = new LuxuryCar("B");
        car.showDescription();
        luxuryCar.showDescription();

        if(car instanceof  LuxuryCar){
            System.out.println("Log Car");
            ((LuxuryCar) car).showAll();
        }
        if(luxuryCar instanceof  LuxuryCar){
            System.out.println("Log LuxuryCar");
            ((LuxuryCar) luxuryCar).showAll();
        }
    }
}
