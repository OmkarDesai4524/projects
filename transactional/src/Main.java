import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "Admin@123";
        String withdrawQuery = "update accounts set balance = balance - ? where account_number = ?";
        String depositQuery = "update accounts set balance = balance + ? where account_number = ?";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try(Connection connection = DriverManager.getConnection(url, user, password)){
            System.out.println("connection established successfully");
            connection.setAutoCommit(false);
            try{
                PreparedStatement withdrawStatement = connection.prepareStatement(withdrawQuery);
                PreparedStatement depositStatement = connection.prepareStatement(depositQuery);
                withdrawStatement.setDouble(1,500);
                withdrawStatement.setString(2,"account123");
                depositStatement.setDouble(1,500);
                depositStatement.setString(2,"account4567");
                int rowsAffectedWithdraw = withdrawStatement.executeUpdate();
                int rowsAffectedDeposit = depositStatement.executeUpdate();
                if(rowsAffectedWithdraw > 0 && rowsAffectedDeposit > 0) {
                    connection.commit();
                    System.out.println("Transaction committed");
                }else{
                    connection.rollback();
                    System.out.println("Transaction rolled back");
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }


        }catch (SQLException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}