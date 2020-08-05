package ncBtThreadMoRong_3luong;

public class Thread3 extends Thread{
    ShadeData shadeData;

    public Thread3(ShadeData shadeData) {
        this.shadeData = shadeData;
    }

    @Override
    public void run() {
        while (shadeData.checkAvaiable()){
            synchronized (shadeData){
                shadeData.notifyAll();
                try {
                    while (shadeData.getIndex()!=3&&shadeData.checkAvaiable()){
                        shadeData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //logic
                int rad = shadeData.getRad();
                if(rad%2==0){
                    if(rad%4==0){
                        System.out.println("T3 -> So nay chia het cho 4");
                    }else {
                        System.out.println("T3 -> So nay khong chia het cho 4");
                    }
                }else {
                    System.out.println("T3 -> Số lẻ ");
                }
                shadeData.setIndex(1);
            }

        }
        synchronized (shadeData){
            shadeData.notifyAll();
        }
        System.out.println("3 stop");
    }
}
