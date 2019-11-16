package nov16;

import java.sql.*;

public class insertrecord {

	public static void main(String[] args) throws Throwable{
	//loading jdbc class
		Class.forName("com.mysql.jdbc.Driver");
		//connection to database
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
	//create sql statement
	Statement smt=con.createStatement();
	//smt.executeUpdate("insert into emp values('Akhilesh',201,50000)");
	smt.executeUpdate("update emp set  esal=90000 where esal=50000");
	con.close();

	}

}
