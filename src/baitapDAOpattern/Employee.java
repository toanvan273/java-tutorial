package baitapDAOpattern;
//Data Access Object Pattern hay DAO Pattern được sử dụng để tách thao tác xử lý dữ liệu riêng biệt với
// tầng nghiệp vụ trong khi xây dựng chương trình
public class Employee {
    private int id;
    private String name;
    Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
