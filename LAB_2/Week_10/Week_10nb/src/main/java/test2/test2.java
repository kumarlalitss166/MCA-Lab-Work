package test2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test2 {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "lalit";
    private static final String PASSWORD = "32165487";

    public static void main(String[] args) {
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students")
        ) {
            while (rs.next()) {
                System.out.println( "Student Name: " + rs.getString("name") + "\nStudent Age:" + rs.getInt("age"));
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        // Connection, Statement, and ResultSet are automatically closed here
    }
}