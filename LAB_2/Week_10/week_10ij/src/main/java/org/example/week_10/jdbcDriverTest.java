package org.example.week_10;

public class jdbcDriverTest {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver NOT found! Check your setup.");
        }
    }
}