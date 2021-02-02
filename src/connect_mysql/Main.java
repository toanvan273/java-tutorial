package connect_mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        List<Student> students = new ArrayList<>();
        try {
            // mo ket noi toi database
            String url = "jdbc:mysql://localhost:3306/demo_chien1?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
             connection = DriverManager.getConnection(url,"root","");
             statement = connection.createStatement();

             // tao truy van - query - lay du lieu + them sua xoa
            String sql = "select * from student";
            ResultSet resultSet = statement.executeQuery(sql);


            while (resultSet.next()){
                Student student = new Student(
                        resultSet.getString("rollno"),
                        resultSet.getString("fullname"),
                        resultSet.getString("email"),
                        resultSet.getString("address"),
                        resultSet.getString("gender"));

                students.add(student);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
