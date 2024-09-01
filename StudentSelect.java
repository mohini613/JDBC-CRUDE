package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentSelect {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {

	    	Class.forName("com.mysql.jdbc.Driver");
	        
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/test", "root", "root");

	        String query = "select * from student "; // where city=pune then it will give particular data
	        
	        Statement smt = con.createStatement();
	      java.sql.ResultSet  r =  smt.executeQuery(query);
           //r.next();//returns boolean 
       while    (r.next())//loop whic will give whole data from database 
       {
           System.out.println(r.getInt(1));
           System.out.println(r.getString(2));
           System.out.println(r.getString(3));
           System.out.println("------------------");

       }
           
           
           
	        con.close();
	        smt.close();
	        System.out.println("successfull");
	    }
	
}
