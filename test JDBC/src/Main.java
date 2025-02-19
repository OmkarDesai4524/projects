import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "Om@123kar";
        String query = "update employees set job_title='Full Stack Developer', salary=50000.0 where id = 2;";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try(Connection connection = DriverManager.getConnection(url, user, password)){
            System.out.println("connection established successfully");
            Statement stmt = connection.createStatement();
            int rowsAffected = stmt.executeUpdate(query);

            System.out.println("rows affected: "+rowsAffected);


            stmt.close();
            connection.close();

        }catch (SQLException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}