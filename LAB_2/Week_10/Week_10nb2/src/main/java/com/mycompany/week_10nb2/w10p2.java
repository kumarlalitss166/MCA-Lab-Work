package com.mycompany.week_10nb2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//Custom Exception for Database Connection Issues
class DatabaseConnectionException extends Exception{
    public DatabaseConnectionException(String message, Throwable cause){
        super(message, cause);
    }
}
public class w10p2{
    private static final Logger logger = Logger.getLogger(w10p2.class.getName());
   
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system";
    private static final String PASSWORD = "32165487";

    public static void main(String[] args) throws DatabaseConnectionException{
        
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students")
        ) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            while (rs.next()) {
                System.out.println( "Student Name: " + rs.getString("name") + "\nStudent Age:" + rs.getInt("age"));
            }
        }
        catch (ClassNotFoundException e){
            logger.log(Level.SEVERE, "JDBC Driver not found!", e);
            throw new DatabaseConnectionException("JDBC Driver is missing", e);
        }
        catch (SQLSyntaxErrorException e){
            logger.log(Level.SEVERE, "Table missing!", e);
            throw new DatabaseConnectionException("Table missing!", e);
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

