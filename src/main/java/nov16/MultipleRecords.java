package nov16;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleRecords {

	public static void main(String[] args)throws Throwable {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
	Statement smt=con.createStatement();
	FileInputStream fi=new FileInputStream("d://database.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet ws=wb.getSheetAt(0);
	int rc=ws.getLastRowNum();
	for(int i=1;i<=rc;i++)
	{
		String ename=ws.getRow(i).getCell(0).getStringCellValue();
		double eno=ws.getRow(i).getCell(1).getNumericCellValue();
		double esal=ws.getRow(i).getCell(2).getNumericCellValue();
	smt.executeUpdate("insert into emp values('"+ename+"',"+eno+","+esal+")");
	}
	fi.close();
	con.close();
	wb.close();

	}

}















