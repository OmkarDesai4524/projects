import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "Om@123kar";
        String query = "insert into employees(id, name, job_title, salary) values(?,?,?,?);";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try(Connection connection = DriverManager.getConnection(url, user, password)){
            System.out.println("connection established successfully");
//            Statement stmt = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.next();
            String job_title = scanner.next();
            double salary = scanner.nextDouble();

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,job_title);
            preparedStatement.setDouble(4, salary);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Total rows affected: " + rowsAffected);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String job_title = resultSet.getString("job_title");
//                double salary = resultSet.getDouble("salary");
//                System.out.println("ID: " + id);
//                System.out.println("Name: " + name);
//                System.out.println("Job Title: " + job_title);
//                System.out.println("Salary: " + salary);
//            }
//            resultSet.close();

            preparedStatement.close();
            connection.close();

        }catch (SQLException e){
            System.err.println("ERROR: " + e.getMessage());
        }

    }
}