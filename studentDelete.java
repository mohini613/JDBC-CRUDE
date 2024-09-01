package javaJdbc;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;


	public class studentDelete {
		 public static void main(String[] args) throws ClassNotFoundException, SQLException {

		    	Class.forName("com.mysql.jdbc.Driver");
		        
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "root");

		        String query = "delete from  student where sid =104";
		        
		        Statement smt = con.createStatement();
		        int x= smt.executeUpdate(query);
	           System.out.println(x);
	           
	           
		        con.close();
		        smt.close();
		        System.out.println("successfull");
		    }
		
	}

