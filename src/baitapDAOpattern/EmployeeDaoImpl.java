package baitapDAOpattern;

import java.util.ArrayList;

public class EmployeeDaoImpl implements EmployeeDao{
    ArrayList<Employee> alEmp;
    public EmployeeDaoImpl(){
        alEmp = new ArrayList<Employee>();
        Employee e1 = new Employee(0,"Xuan");
        Employee e2 = new Employee(1,"Ha");
        Employee e0 = new Employee(2,"Doi ghe");
        alEmp.add(e1);
        alEmp.add(e2);
        alEmp.add(e0);
    }

    @Override
    public ArrayList<Employee> getAllEmployees() {
        return alEmp;
    }

    @Override
    public Employee getEmployee(int id) {
        return alEmp.get(id);
    }

    @Override
    public void updateEmployee(Employee emp) {
        alEmp.get(emp.getId()).setName(emp.getName());
        System.out.println("Nhan vien co ID "+ emp.getId()+" da duoc cap nhat");
    }

    @Override
    public void deleteEmployee(Employee emp) {
        alEmp.remove(emp.getId());
        System.out.println("Nhan vien co ID "+emp.getId()+" da bi xoa");
    }
}
