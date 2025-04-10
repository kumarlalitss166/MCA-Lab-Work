package test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

//Custom Exception for Database Connection Issues
class DatabaseConnectionException extends Exception{
    public DatabaseConnectionException(String message, Throwable cause){
        super(message, cause);
    }
}
public class test3{
    private static final Logger logger = Logger.getLogger(test3.class.getName());
   
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "lalit";
    private static final String PASSWORD = "32165487";

    public static void main(String[] args) throws DatabaseConnectionException{
        String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students")
        ) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //1st Entry
            pstmt.setString(1, "Alice");
            pstmt.setInt(2, 21);
            pstmt.executeUpdate();
            System.out.println("Record inserted: Alice, 21");
            
            //2nd Entry
            pstmt.setString(1, "Bob");
            pstmt.setInt(2, 19);
            pstmt.executeUpdate();
            System.out.println("Record inserted: Bob, 19");
            
            while (rs.next()) {
                System.out.println( "Student (Name, Age) : " + "(" + rs.getString("name") + ","+ rs.getInt("age") + ")");
            }
        }
        catch (ClassNotFoundException e){
            logger.log(Level.SEVERE, "JDBC Driver not found!", e);
            throw new DatabaseConnectionException("JDBC Driver is missing", e);
        }
        catch (SQLException e){
            logger.log(Level.SEVERE, "Failed to connect to the database!", e);
            throw new DatabaseConnectionException("Database connection failed.", e);
        }
        finally {
            System.out.println("Resources: Connection, Statement, and ResultSet are automatically closed here.");
        }
    }
}

