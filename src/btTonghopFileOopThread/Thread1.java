package btTonghopFileOopThread;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Thread1 extends Thread{
    SharedData sharedData;

    public Thread1(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FileReader reader = null;
        BufferedReader bReader = null;
        try {
             reader = new FileReader("./src/btTonghopFileOopThread/student.txt");
             bReader = new BufferedReader(reader);
            String line = null;
            while (sharedData.isAlive()){
            // sycn du lieu tu day
                synchronized (sharedData){
                    line = bReader.readLine();
                    if(line==null){
                        sharedData.setAlive(false);
                        break;
                    }
                    boolean isValid = Student.checkValidRollNo(line);
                    if(isValid){
                        Student std = new Student(line);
                        sharedData.getValidRollNumber().add(std);
                        sharedData.setCurrentThread(sharedData.THREAD_2);
                    } else {
                        sharedData.getUnvalidRollNumber().add(line);
                        sharedData.setCurrentThread(sharedData.THREAD_3);
                    }

                    sharedData.notifyAll();
                    try {
                        sharedData.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bReader!=null){
                try {
                    bReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("1 f ");
        synchronized (sharedData){
            sharedData.notifyAll();
        }
    }
}
