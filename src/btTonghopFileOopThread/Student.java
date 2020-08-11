package btTonghopFileOopThread;

import java.io.Serializable;
import java.util.regex.Pattern;

public class Student implements Serializable {
    String rollNo;

    public Student() {}

    public Student(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public static boolean checkValidRollNo(String rollNo){
        String patterm = "[CTN][0-9]{4}[G-M][V]?[0-9]{4}";
        boolean matche = Pattern.matches(patterm,rollNo);
        return matche;
    }
}
