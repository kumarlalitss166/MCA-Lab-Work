package test4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test4 {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "lalit"; // Change username if needed
    private static final String PASSWORD = "32165487"; // Change password if needed

    public static void main(String[] args) {
        String dbName = "test"; // New database name
        String tableName = "students";

        try (
            // Connect to MySQL without specifying a database
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement()
        ) {
            // Step 1: Create Database
            String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName;
            stmt.executeUpdate(createDB);
            System.out.println("Database '" + dbName + "' created successfully!");

        } catch (SQLException e) {
            System.err.println("Error creating database: " + e.getMessage());
            return; // Exit if database creation fails
        }

        // Step 2: Connect to the new database `test2`
        String dbURL = DB_URL + dbName;
        try (
            Connection conn = DriverManager.getConnection(dbURL, USER, PASSWORD);
            Statement stmt = conn.createStatement()
        ) {
            // Step 3: Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(50) NOT NULL, "
                + "age INT NOT NULL)";
            stmt.executeUpdate(createTable);
            System.out.println("Table '" + tableName + "' created successfully!");

            // Step 4: Insert two student records
            String insertStudent1 = "INSERT INTO " + tableName + " (name, age) VALUES ('Alice', 21)";
            String insertStudent2 = "INSERT INTO " + tableName + " (name, age) VALUES ('Bob', 22)";
            stmt.executeUpdate(insertStudent1);
            stmt.executeUpdate(insertStudent2);
            System.out.println("Two students inserted successfully!");
            // Step 5: Show table data
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println( "Student Name: " + rs.getString("name") + "\nStudent Age:" + rs.getInt("age"));
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
