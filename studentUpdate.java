package javaJdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;


	public class studentUpdate {
		 public static void main(String[] args) throws ClassNotFoundException, SQLException {

		    	Class.forName("com.mysql.jdbc.Driver");
		        
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "root");

		        String query = "update student set sname='Vaishnavi' where sid =104"; // where city=pune then it will give particular data
		        
		        Statement smt = con.createStatement();
		        int x= smt.executeUpdate(query);//it returns zero if data dont gets in database, and returnss 1 when data goes in database
	           System.out.println(x);
	           
	           
		        con.close();
		        smt.close();
		        System.out.println("successfull");
		    }
		
	}


