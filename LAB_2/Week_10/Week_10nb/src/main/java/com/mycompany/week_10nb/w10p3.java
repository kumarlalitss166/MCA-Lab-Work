package com.mycompany.week_10nb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Custom Exception for Database Connection Issues
class DatabaseConnectionException_2 extends Exception{
    public DatabaseConnectionException_2(String message, Throwable cause){
        super(message, cause);
    }
}
public class w10p3 {
    private static final Logger logger = Logger.getLogger(w10p2.class.getName());
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "lalit";
    private static final String PASSWORD = "32165487";
    
    public static void main(String[] args) throws DatabaseConnectionException_2 {
                
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        ) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded successfully!");
            }
        catch (ClassNotFoundException e){
            logger.log(Level.SEVERE, "JDBC Driver not found!", e);
            throw new DatabaseConnectionException_2("JDBC Driver is missing", e);
        }
        catch (SQLSyntaxErrorException e){
            logger.log(Level.SEVERE, "Table missing or Wrong Query Executed!", e);
            throw new DatabaseConnectionException_2("Table missing or Wrong Query Executed!", e);
        }
        catch (SQLException e){
            logger.log(Level.SEVERE, "Failed to connect to the database!", e);
            throw new DatabaseConnectionException_2("Database connection failed.", e);
        }
        finally {
            System.out.println("Resources: Connection, Statement, and ResultSet are automatically closed here.");
        }
    }
}