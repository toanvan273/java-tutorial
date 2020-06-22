package baitapDAOpattern;

public class DaoPatternMain {
    public static void main(String[] args) {
        EmployeeDao empDao = new EmployeeDaoImpl();
        // Hien thi tat ca
        for (Employee e: empDao.getAllEmployees()){
            System.out.println("Nhan vien: [ID : "+e.getId()+", Ten: "+e.getName()+"]");
        }
        // Cap nhat
        Employee e = empDao.getAllEmployees().get(0);
        e.setName("Nguyen Van Xuan");
        empDao.updateEmployee(e);
        // Hien thi
        e = empDao.getEmployee(0);
        System.out.println("Nhan vien: [ID : "+e.getId()+", Ten: "+e.getName()+"]");
    }
}
