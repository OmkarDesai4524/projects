import java.sql.*;
import java.util.Locale;
import java.util.Scanner;

public class batchProcessing {

    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "Admin@123";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try(Connection connection = DriverManager.getConnection(url, user, password)){
            System.out.println("connection established successfully");
            connection.setAutoCommit(false);
            String query = "insert into employees (name, job_title, salary) values(? ,? ,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.print("Enter employee name: ");
                String name = scanner.nextLine();
                System.out.print("Enter employee job title: ");
                String job_title = scanner.nextLine();
                System.out.print("Enter employee salary: ");
                double salary = scanner.nextDouble();
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, job_title);
                preparedStatement.setDouble(3, salary);
                scanner.nextLine();
                preparedStatement.addBatch();
                System.out.print("Add more values Y/N : ");
                String decision = scanner.nextLine();
                if(decision.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] batchResult = preparedStatement.executeBatch();
            connection.commit();
            System.out.println("successfully committed");

        }catch (SQLException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}
