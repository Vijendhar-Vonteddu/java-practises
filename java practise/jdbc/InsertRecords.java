package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {
   static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
   static final String USER = "postgres";
   static final String PASS = "postgres";

   public static void main(String[] args) {
   
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
   
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO Student VALUES (1911366, 'Vijay', 'Reddy', 18)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO student VALUES (191711367, 'Mahesh', 'China', 25)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO student VALUES (1917368, 'Mustafa', 'Shaik', 30)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO student VALUES(103, 'Sumit', 'Mittal', 28)";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}