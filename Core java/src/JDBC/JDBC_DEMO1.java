package JDBC;
import java.sql.*;

public class JDBC_DEMO1 {

	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/muskaan?useSSL=false";
		String uname="root";
		String pass="Tiya2809*";
		String query="SELECT USER_NAME FROM STUDENTS WHERE USER_ID=3";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		rs.next();
		String name=rs.getString("USER_NAME");
		System.out.println(name);
		
			
		st.close();
		con.close();
	}

}
