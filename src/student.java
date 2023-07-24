
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class student
{
	public static void main(String args[])
	{
		System.out.println("helo");
		final String URL="jdbc:mysql://localhost:3306?user=root&&password=Coder@29";
//		Scanner sc=new Scanner(System.in);
//		String name=new String();
//		name=sc.nextLine();
//		int id;
//		id=sc.nextInt();
		String query="insert into student.stud values(1,'Pratiksha')";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL);
			System.out.println("connected successfully");
			Statement stmt=con.createStatement();
			stmt.execute(query);
			System.out.println("Inserted successfully");
			stmt.close();
			con.close();
		}catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}