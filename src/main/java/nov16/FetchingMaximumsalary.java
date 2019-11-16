package nov16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class FetchingMaximumsalary {

	public static void main(String[] args)throws Throwable {
		//loading jdbc class
				Class.forName("com.mysql.jdbc.Driver");
				//connection to database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			//create sql statement
			Statement smt=con.createStatement();
			//second highest salary
	//ResultSet rs=smt.executeQuery("Select * from emp where esal=(select max(esal) from emp where esal <(select max(esal) from emp))");
			//first salary
ResultSet rs=smt.executeQuery("Select * from emp where esal=(select max(esal) from emp)");			
	while(rs.next())
	{
	//	System.out.println(rs.getString(1)+"   "+rs.getInt(2)+"    "+rs.getInt(3));
		//System.out.println(rs.getInt(3));
		System.out.println(rs.getInt(3));
	}

	}

}
