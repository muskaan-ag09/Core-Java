package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_DEMO2 {

	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/muskaan?useSSL=false";
		String uname="root";
		String pass="Tiya2809*";
		String query="SELECT * FROM STUDENTS";	//DQL statement
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);	//For DQL statement, we use executeQuery();
		
		while(rs.next()) {
			String user_data=rs.getInt(1)+" : "+rs.getString(2);
			System.out.println(user_data);
		}
			
		st.close();
		con.close();
	}

}
