package MySQLUtil;


import java.sql.*;
import java.util.Scanner;

public class ConectionUtils {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws ClassNotFoundException, SQLException       {
        Class.forName("org.h2.Driver");
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");



        System.out.println("------------------------");

        // INSERT CSDL
//        String sqlInsert = "INSERT INTO Test (id,name) VALUES (?,?)";
//        PreparedStatement state = connection.prepareStatement(sqlInsert);
//        state.setInt(1,6);
//        state.setString(2,"hiX");
//        int rowsInsert = state.executeUpdate();
//        System.out.println("rowsInsert :"+rowsInsert);
//        if(rowsInsert >0){
//            System.out.println("successfully!");
//        }
        // SELECT
        String sqlSelect = "SELECT * FROM Test";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlSelect);
        int count = 0;
//        System.out.println("SELECT ----");
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String output = "User #%d: %s - %s ";
            System.out.println(String.format(output,++count,id,name));
        }

        // Doc CSDL
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
            System.out.println(
                    "Column " + i + " [name: " + resultSetMetaData.getColumnName(i) + " - type: " + resultSetMetaData.getColumnTypeName(i) + "]"
            );
        }
        while (resultSet.next()) System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) );

        // UPDATE
        String sqlUpdate = "UPDATE Test SET name=? WHERE id=?";
        PreparedStatement stateUpdate = connection.prepareStatement(sqlUpdate);

        connection.close();
    }

    static void showMenu(){
        System.out.println("0. Connect to databasse");
        System.out.println("1. Them phan tu vao database");
        System.out.println("2. ");
        System.out.println("3. Luu thong tin moi lop hoc vao 1 file ten_lop.obj");
        System.out.println("4. Thoat");
        System.out.println("Choose");
    }
}

//    int choose;
//        do {
//                showMenu();
//                choose = scanner.nextInt();
//                switch (choose){
//                case 0:
//                insert();
//                break;
//                case 1:
//                break;
//                case 2:
//                break;
//                case 3:
//                break;
//                case 4:
//                break;
//                case 5:
//                break;
//default:
//        break;
//        }
//        }while (choose!=10);