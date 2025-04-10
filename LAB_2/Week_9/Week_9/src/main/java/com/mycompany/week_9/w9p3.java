package com.mycompany.week_9;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class w9p3 {
    private static final Logger logger = LogManager.getLogger(w9p3.class);

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            logger.error("Exception occurred: ", e);
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}