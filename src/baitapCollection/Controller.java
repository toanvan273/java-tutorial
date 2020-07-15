package baitapCollection;

import java.util.ArrayList;

public class  Controller<E extends People> {
    ArrayList<E> list = new ArrayList<>();
//    ArrayList<E2> list2 = new ArrayList<>();
//    ArrayList<E3> list3 = new ArrayList<>();
    public Controller(){};
    public void add(E e){
        list.add(e);
    }
    public E get(int i){
        return list.get(i);
    }
}
