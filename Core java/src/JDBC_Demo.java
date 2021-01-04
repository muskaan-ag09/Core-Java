/*
 * 1. import -> java.sql.*
 * 2. load and register the driver -> com.mysql.jdbc.Driver
 * 3. Create connection --> Connection
 * 4. Create a statement --> Statement
 * 5. Execute the query
 * 6. Process the results
 * 7. close as per requirements
 */

import java.sql.*;

public class JDBC_Demo {

	public static void main(String[] args) throws Exception{

		String url="jdbc:mysql://localhost:3306/muskaan?useSSL=false";
		String uname="root";
		String pass="Tiya2809*";
		String query="SELECT USER_NAME FROM STUDENTS WHERE USER_ID>1";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()){
			String name=rs.getString("USER_NAME");
			System.out.println(name);
		}
		st.close();
		con.close();
	}
}
