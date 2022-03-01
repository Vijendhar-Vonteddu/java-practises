package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    static final String DB_URL = "jdbc:postgresql://localhost/postgres";
    static final String USER = "postgres";
    static final String PASS = "postgres";
    public static void main(String[] args) {
       try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
       ) {		      
           String sql = "CREATE TABLE STUDENT " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " + 
                    " last VARCHAR(255), " + 
                    " age INTEGER, " + 
                    " PRIMARY KEY ( id ))"; 
 
          stmt.executeUpdate(sql);
          System.out.println("Created table in given database...");   	  
       } catch (SQLException e) {
          e.printStackTrace();
       } 
    }
 
}
