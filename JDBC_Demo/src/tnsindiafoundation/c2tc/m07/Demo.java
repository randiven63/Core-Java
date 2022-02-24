package tnsindiafoundation.c2tc.m07; //1

import java.sql.*;
public class Demo {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/m07";
		String user="root";
		String pass="Nayna@123";
		
		String query="SELECT * FROM m07.details where uid=2110611";
		Class.forName("com.myql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		
		ResultSet rs= st.executeQuery(query);
		rs.next();
		System.out.println("UID of the student is"+rs.getInt(1));
		System.out.println("UID of the student is"+rs.getString(2));
		
		st.close();
		con.close();
	}

}
