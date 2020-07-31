package ncBtThreadMoRong;

public class Thread2 extends Thread{
    ShadeData shadeData;

    public Thread2(ShadeData shadeData) {
        this.shadeData = shadeData;
    }

    @Override
    public void run() {
        while (shadeData.checkAvaiable()){
            int rad = shadeData.getRad();
            if(rad%3==0){
                rad *=rad;
                System.out.println("T2 >> "+rad);
            }
        }
    }
}
