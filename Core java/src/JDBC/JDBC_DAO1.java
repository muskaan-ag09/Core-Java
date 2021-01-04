package JDBC;
import java.sql.*;

public class JDBC_DAO1 {

	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		dao.connect();	//to connect to server
		
		Student s1=dao.getStudent(5);	//to store the student object
		System.out.println(s1.sname);
		
		//To add student
		Student s2=new Student();
		s2.rollno=7;
		s2.sname="Lokesh";
		
		dao.addStudent(s2);
	}

}

class StudentDAO{
	

	Connection con=null;
	
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muskaan?useSSL=false","root","Tiya2809*");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public Student getStudent(int rollno) {
		try {
			String query="select sname from school where roll_no="+rollno;
			Student s=new Student();
			s.rollno=rollno;
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name=rs.getString(1);
			s.sname=name;
			return s;
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return null;
	}
	
	public Student addStudent(Student s) {
		String query= "INSERT INTO SCHOOL VALUES (?,?)";
		PreparedStatement pet;
		try{ 
			pet=con.prepareStatement(query);
			pet.setInt(1, s.rollno);
			pet.setString(2, s.sname);
			pet.executeUpdate();
			System.out.println("1 record added succesfully!");
			return s;
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return null;
	}
}

class Student{
	int rollno;
	String sname;
}