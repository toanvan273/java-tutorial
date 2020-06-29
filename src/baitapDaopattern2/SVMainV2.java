package baitapDaopattern2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SVMainV2 {
    public static void main(String[] args) throws IOException {
        SinhVien a = new SinhVien();
        a.input();
        try{
            FileOutputStream f = new FileOutputStream("svv2.dat");
            ObjectOutputStream ot = new ObjectOutputStream(f);
            ot.writeObject(a);
            ot.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
