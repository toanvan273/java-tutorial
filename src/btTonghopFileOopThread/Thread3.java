package btTonghopFileOopThread;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Thread3 extends Thread{
    SharedData sharedData;

    public Thread3(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        FileOutputStream fos = null;
//        ObjectOutputStream oss;
        try {
            fos = new FileOutputStream("./src/btTonghopFileOopThread/unvalid.txt");
            while (sharedData.isAlive()){
                synchronized (sharedData){
                    sharedData.notifyAll();
                    try {
                        while (sharedData.getCurrentThread()!=sharedData.THREAD_3&&sharedData.isAlive()){
                            sharedData.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int length = sharedData.getUnvalidRollNumber().size();
                    String rollNo = sharedData.getUnvalidRollNumber().get(length-1);
                    System.out.println("Unvalid roll number: "+rollNo);

                    // ghi unvalid roll number vao file
                    rollNo += "\n";
                    byte[] b = rollNo.getBytes();
                    fos.write(b);
                    // chuyen Thread
                    sharedData.setCurrentThread(sharedData.THREAD_1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // ket thuc thread 3
        System.out.println("3 f ");
    }
}
