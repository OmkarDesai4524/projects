import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "Om@123kar";
        String image_path = "C:\\Users\\admin\\Pictures\\Camera Roll\\Capture2.jpg";
        String query = "insert into image_table(image_data) values(?)";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try(Connection connection = DriverManager.getConnection(url, user, password)){
            System.out.println("connection established successfully");
            FileInputStream fileInputStream = new FileInputStream(image_path);
            byte[] imageData = new byte[fileInputStream.available()];
            fileInputStream.read(imageData);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setBytes(1, imageData);
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows);



        }catch (SQLException e){
            System.err.println("ERROR: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}