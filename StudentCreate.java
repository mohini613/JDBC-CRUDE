 package javaJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentCreate {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    	Class.forName("com.mysql.jdbc.Driver");
        
Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/test", "root", "root");

        String query = " create INTO student VALUES (104, 'sham', 'Pune')";
        Statement smt = con.createStatement();
        smt.execute(query);

        con.close();
        smt.close();
        System.out.println("successfull");
    }
}
