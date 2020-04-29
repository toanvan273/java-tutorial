package ChaCon;

public class Java53 {
    public static void main(String[] args) {
        Employee employee = new Employee("Truong van toan","02146w54df",1990,"0139653","Staff",10);

        Student student = new Student("Nguyen Minh Quan","098QA123",2002,"123QR1202","NEU",12.33f);

        Person person = new Person("Tao Thao","01236467842",1990);

       Person[] people = new Person[3];
       people[0] = person;
       people[1] = student;
       people[2] = employee;
        for (Person p: people) {
            System.out.println("Thong tin person: ");
            p.showInfo();
            System.out.println();
        }
    }
}
