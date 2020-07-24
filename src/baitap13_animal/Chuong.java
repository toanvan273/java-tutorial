package baitap13_animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Chuong implements Serializable {

    private static final long serialVersionUID = 1L;

    int maChuong;
    ArrayList<Animal> animalList = new ArrayList<>();

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    public Chuong(int maChuong) {
        this.maChuong = maChuong;
    }

    public void addAnimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap loai Animal bạn muốn thêm");
        System.out.println("1=Dog, 2=Cat, 3=Tiger");
        int choose;
        choose = scanner.nextInt();
        Animal animal = null;
        switch (choose){
            case 1:
                Dog dog = new Dog();
                dog.input();
                animal = dog;
                break;
            case 2:
                Cat cat = new Cat();
                cat.input();
                animal = cat;
                break;
            case 3:
                Tiger tiger = new Tiger();
                tiger.input();
                animal = tiger;
                break;
            default:
                System.out.println("Error roi ba oi !!1");
                break;
        }
        System.out.println("animal"+animal);
       animalList.add(animal);
   }
   public void removeAnimal(String name){
       Iterator<Animal> iterator = animalList.iterator();
       while (iterator.hasNext()){
           Animal animal = iterator.next();
           if(animal.Ten.equals(name)){
               iterator.remove();
           }
       }
   }

    @Override
    public String toString() {
        return "Chuong{" +
                "maChuong=" + maChuong +
                ", animalList=" + animalList +
                '}';
    }
    public void displayChuong(){
        System.out.println(toString());
    }
}
