package baitap13_animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Zoo implements Serializable {

    private static final long serialVersionUID = 1L;

    ArrayList<Chuong> danhSachChuong = new ArrayList<>();
    public void themChuong(Chuong chuong){
        danhSachChuong.add(chuong);
    }
    public void xoaChuong(int maChuong){
        Iterator<Chuong> iterator = danhSachChuong.iterator();
        while (iterator.hasNext()){
            Chuong chuong = iterator.next();
            if(chuong.maChuong==maChuong){
                iterator.remove();
            }
        }
    }
    public Chuong getChuong(int maChuong){
        Chuong myChuong = null;
        Iterator<Chuong> ite = danhSachChuong.iterator();
        while (ite.hasNext()){
            Chuong chuong = ite.next();
            if(chuong.maChuong==maChuong){
                myChuong = chuong;
            }
        }
        return myChuong;
    }
}
