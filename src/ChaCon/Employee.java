package ChaCon;

public class Employee extends Person {
    public String eID;
    public String role;
    public int salary;

    public Employee(String eID, String role, int salary) {
        this.eID = eID;
        this.role = role;
        this.salary = salary;
    }

    public Employee(String fullName, String ID, int yearBord, String eID, String role, int salary) {
        super(fullName, ID, yearBord);
        this.eID = eID;
        this.role = role;
        this.salary = salary;
    }

    public String geteID() {
        return eID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Employee ID: " + eID);
        System.out.println("Employee Role: " + role);
        System.out.println("Salary: " + salary);
    }
}
