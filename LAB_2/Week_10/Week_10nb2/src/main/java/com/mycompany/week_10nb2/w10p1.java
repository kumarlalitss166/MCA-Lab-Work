package com.mycompany.week_10nb2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class w10p1 {
    //Database connection parameters
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "system";
    private static final String PASSWORD = "32165487";

    //Method to get a database connection
    public static void getConnection(){
        try{
            // Load MySQL JDBC Driver (checked Exception)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Use try-with-resources to ensure proper resource management
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Database connected succesfully!");
            conn.close();
        }
        catch (ClassNotFoundException | SQLException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args){
        getConnection();
    }
}
