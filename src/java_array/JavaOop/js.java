package java_array.JavaOop;

//import javax.print.DocFlavor;

public class js  {
    public static void main(String[] args) {
    Person person1, person2;
    person1 = new Person();
    person2 = new Person();
        System.out.println(person1+ " "+person2);
    }
    static class Person{
        private String name;
        private String ID;
        private float salary;
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }
    }
}
