package baitap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
//        List<Student> studentSort = new ArrayList<>();
        int choose = 0;
        Scanner input = new Scanner(System.in);
        do{
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Nhap so sinh vien can them : ");
                    int n = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.input();
                        studentList.add(std);
                    }
                    break;
                case 2:
                    System.out.println("Nhap ID sinh vien can sua : ");
                    int id = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < studentList.size(); i++) {
                        if(studentList.get(i).getId()==id){
                            studentList.get(i).edit();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap ID sinh vien can xoa : ");
                    int deleteId = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < studentList.size(); i++) {
                        if(studentList.get(i).getId()==deleteId){
                            studentList.remove(i);
                            break;
                        }
                    }
                    break;
                case 4:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if(o1.getGpa()<o2.getGpa())return -1;
                            return 1;
                        }
                    });
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).display();
                    }
                    break;
                case 5:
//                    Collections.sort(studentList, new Comparator<Student>() {
//                        @Override
//                        public int compare(Student o1, Student o2) {
//                            return o1.getName().compareTo(o2.getName());
//                        }
//                    });
                    Collections.sort(studentList,(o1,o2) -> o1.getName().compareTo(o2.getName()));
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).display();
                    }
                    break;
                case 6:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).display();
                    }
                    break;
                case 7:
                    FileOutputStream fos=null;
                    ObjectOutputStream oos=null;
                    try{
                        fos = new FileOutputStream("students.dat");
                        oos = new ObjectOutputStream(fos);

                        oos.writeObject(studentList);
                    }catch (Exception e){

                    }finally {
                        try{
                            if(fos != null){
                                fos.close();
                            }
                            if(oos != null){
                                oos.close();
                            }
                        }catch (Exception ex){

                        }
                    }
                    break;
                case 8:
                    FileInputStream fis=null;
                    ObjectInputStream ois=null;
                    try {
                        fis = new FileInputStream("students.dat");
                        ois = new ObjectInputStream(fis);
                        studentList = (List<Student>) ois.readObject();
                    }catch (Exception e){

                    }finally {
                        try{
                            if(fis != null){
                                fis.close();
                            }
                            if(ois != null){
                                ois.close();
                            }
                        }catch (Exception ex){

                        }
                    }
                    break;
                case 9:
                    System.out.println("exitlink...");
                    break;
                default:
                    System.out.println("Input failed...");
                    break;
            }
        }while (choose!=9);
    }
    static void  showMenu() {
        System.out.println("1. Add student");
        System.out.println("2. Edit student by ID");
        System.out.println("3. Delete student by ID");
        System.out.println("4. Sort student by GPA");
        System.out.println("5. Sort student by name");
        System.out.println("6. Show students");
        System.out.println("7. Save");
        System.out.println("8. Read");
        System.out.println("9. Exit");
        System.out.println("Choose :");
    }
}
