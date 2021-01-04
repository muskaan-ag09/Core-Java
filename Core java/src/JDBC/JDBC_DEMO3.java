//Example of Prepared statement

package JDBC;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_DEMO3 {

	public static void main(String[] args) throws Exception{
		
		Scanner in=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/muskaan?useSSL=false";
		String uname="root";
		String pass="Tiya2809*";
		
		int user_id;
		String user_name;
		
		user_id=in.nextInt();
		in.nextLine();
		user_name=in.nextLine();
		
		String query="INSERT INTO STUDENTS VALUES (?,?)";	//DML statement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		
		st.setInt(1,user_id);
		st.setString(2,user_name);
		
		int count=st.executeUpdate();	//For DML statement, we use executeUpdate();
		
		System.out.println(count+" rows affected");
			
		st.close();
		con.close();
	}

}
