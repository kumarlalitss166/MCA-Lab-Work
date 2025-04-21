package com.mycompany.week_9;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class w9p7 {
//    private static final Logger logger = LoggerFactory.getLogger(w9p7.class);
//
//    public static void main(String[] args) {
//        try {
//            // Simulating a runtime exception
//            int result = 10 / 0;
//        } catch (Exception e) {
//            // Log the exception at ERROR level
//            logger.error("Severe Runtime Exception occurred: ", e);
//
//            // Exit the application with an error code
//            System.exit(1);
//        }
//    }
//}

 import org.apache.logging.log4j.LogManager;
 import org.apache.logging.log4j.Logger;
 public class w9p7 {
     private static final Logger logger = LogManager.getLogger(w9p7.class);

     public static void main(String[] args) {
         try {
             // Simulating a runtime exception
             int result = 10 / 0;
         } catch (Exception e) {
             // Log the exception at SEVERE level
             logger.error("Severe Runtime Exception occurred: ", e);
            
             // Exit the application with an error code
             System.exit(1);
         }
     }
 }

