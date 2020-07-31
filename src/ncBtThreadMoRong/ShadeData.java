package ncBtThreadMoRong;

public class ShadeData {
    int rad;
    int total;

    public ShadeData() {
        total = 0;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public synchronized void plus(int value){
        total += value;
    }
    public synchronized boolean checkAvaiable(){
        return total<200;
    }
}
