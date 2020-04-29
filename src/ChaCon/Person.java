package ChaCon;

public class Person {
    public String fullName;
    public String ID;
    public int yearBord;

    public Person(){

    }
    public void eat(String what){
        System.out.println("He like eat :"+what);
    }

    public void showInfo(){
        String info = "Full Name: "+fullName+"\nID: "+getID();
        System.out.println(info);
    }

    public Person(String fullName, String ID, int yearBord) {
        this.fullName = fullName;
        this.ID = ID;
        this.yearBord = yearBord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getYearBord() {
        return yearBord;
    }

    public void setYearBord(int yearBord) {
        this.yearBord = yearBord;
    }
}
