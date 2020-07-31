package ncBtThreadMoRong;

public class Thread3 extends Thread{
    ShadeData shadeData;

    public Thread3(ShadeData shadeData) {
        this.shadeData = shadeData;
    }

    @Override
    public void run() {
        int rad = shadeData.getRad();
        if(rad%2==0){
            if(rad%4==0){
                System.out.println("So nay chia het cho 4");
            }else {
                System.out.println("So nay khong chia het cho 4");
            }
        }
    }
}
