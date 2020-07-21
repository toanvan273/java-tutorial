package ncDesignPartenlv1;

import java.util.ArrayList;
import java.util.List;

public class CarMgr {
    List<Car> carList = new ArrayList<>();
    private  static CarMgr instance = null;

    // singleton pattern
    public static CarMgr getInstance(){
        if(instance==null){
            instance = new CarMgr();
        }
        return instance;
    }
    private CarMgr() {
    }

    public CarMgr(List<Car> carList) {
        this.carList = carList;
    }
    public void add(Car car){
        carList.add(car);
    }
    public void showAll(){
        for (Car car: carList) {
            car.showDescription();
        }
    }
}
