package test1;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
////Custom Exception for Database Connection Issues
//class DatabaseConnectionException extends Exception{
//    public DatabaseConnectionException(String message, Throwable cause){
//        super(message, cause);
//    }
//}
//public class test1 {
//    private static final Logger logger = Logger.getLogger(test1.class.getName());
//
//    //Database connection parameters
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
//    private static final String USER = "lalit";
//    private static final String PASSWORD = "32165487";
//
//    //Method to get a database connection
//    public static Connection getConnection() throws DatabaseConnectionException {
//        try{
//            // Load MySQL JDBC Driver (checked Exception)
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            //Use try-with-resources to ensure proper resource management
//            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
//            System.out.println("Database connected succesfully!");
//            return connection;
//        }
//        catch (ClassNotFoundException e){
//            logger.log(Level.SEVERE, "JDBC Driver not found!", e);
//            throw new DatabaseConnectionException("JDBC Driver is missing", e);
//        }
//        catch (SQLException e){
//            logger.log(Level.SEVERE, "Failed to connect to the database!", e);
//            throw new DatabaseConnectionException("Database connection failed.", e);
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            Connection conn = getConnection();
//        } catch (DatabaseConnectionException e) {
//            System.err.println("Error: " + e.getMessage());
//        }
//    }
//}

public class test1{
    public static void main(String[] args){
        String db_URL = "jdbc:mysql://localhost:3306/";
        String db_name = "test";
        System.out.println(db_URL + db_name);
    }
}