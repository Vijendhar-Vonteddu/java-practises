package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SelectDatabase {
        static final String DB_URL = "jdbc:postgresql://localhost/postgres";
        static final String USER ="postgres";
        static final String PASS ="postgres";
     
        public static void main(String[] args) {
           System.out.println("Connecting to a selected database...");
           try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {		      
              System.out.println("Connected database successfully...");  
           } catch (SQLException e) {
              e.printStackTrace();
           } 
        }
     }

