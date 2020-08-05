package ncBtThreadMoRong_3luong;

public class Thread2 extends Thread{
    ShadeData shadeData;

    public Thread2(ShadeData shadeData) {
        this.shadeData = shadeData;
    }

    @Override
    public void run() {
        while (shadeData.checkAvaiable()){
            synchronized (shadeData){
                shadeData.notifyAll();
                try {
                    while (shadeData.getIndex()!=2&&shadeData.checkAvaiable()){
                        shadeData.wait();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // logic
                int rad = shadeData.getRad();
                if(rad%3==0){
                    rad *=rad;
                    System.out.println("T2 -> "+rad);
                }
                shadeData.setIndex(1);
            }

        }
        System.out.println("2 stop");
    }
}
