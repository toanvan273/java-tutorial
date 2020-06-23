package baitapDAOpattern;

public class DaoPatternMain {
    public static void main(String[] args) {
        EmployeeDao empDao = new EmployeeDaoImpl();
        // Hien thi tat ca
        for (Employee e: empDao.getAllEmployees()){
            System.out.println("Nhan vien: [ID : "+e.getId()+", Ten: "+e.getName()+"]");
        }

        // Cap nhat
        Employee e = empDao.getAllEmployees().get(2);
        System.out.println(e.getId()+" check: "+e.getName());
        e.setName("Nguyen Van Xuan");
        empDao.updateEmployee(e);
//        // Hien thi
        e = empDao.getEmployee(2);
        System.out.println("Nhan vien: [ID : "+e.getId()+", Ten: "+e.getName()+"]");

        System.out.println("===================================");
        // xoa
        Employee ex = empDao.getAllEmployees().get(0);
        empDao.deleteEmployee(ex);
        for (Employee em: empDao.getAllEmployees()){
            System.out.println("Nhan vien: [ID : "+em.getId()+", Ten: "+em.getName()+"]");
        }
    }
}
