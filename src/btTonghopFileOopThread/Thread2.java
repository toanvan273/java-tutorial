package btTonghopFileOopThread;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Thread2 extends Thread{
    SharedData sharedData;

    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (sharedData.isAlive()){
            synchronized (sharedData){
                sharedData.notifyAll();
                try {
                    while (sharedData.getCurrentThread()!= sharedData.THREAD_2&&sharedData.isAlive()){
                        sharedData.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int length = sharedData.getValidRollNumber().size();
                if(length>0){
                    Student std = sharedData.getValidRollNumber().get(length-1);
                    System.out.println("Welcome student has roll no is: "+ std.getRollNo());
                    System.out.println("Valid collection has length: "+length);
                    // ghi vao file .dat
                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;
                    try {
                         fos = new FileOutputStream( "./src/btTonghopFileOopThread/"+std.getRollNo()+".dat");
                         oos = new ObjectOutputStream(fos);
                         oos.writeObject(std);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        if(fos!=null){
                            try {
                                fos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if(oos!=null){
                            try {
                                oos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }else {
                    System.out.println("Err");
                }
                sharedData.setCurrentThread(sharedData.THREAD_1);
            }
        }
        System.out.println("2 f ");

    }
}
