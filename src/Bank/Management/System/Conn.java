
package Bank.Management.System;


import java.sql.*;//this SQL package allows us to select, insert, update, and delete data in SQL tables.

public class Conn {
  
    java.sql.Connection  c;
    java.sql.Statement   s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//to register JDBC Driver.
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_management","YOUR_USERNAME","YOUR_PASSWORD");//establashing connection.
            s=c.createStatement();//acssess to our database;
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    void executeUpdate(String q1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
        