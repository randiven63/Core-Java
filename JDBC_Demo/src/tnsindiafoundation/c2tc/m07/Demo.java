package tnsindiafoundation.c2tc.m07; //1 create the package

import java.sql.*;
//import java.lang.ClassNotFoundException;
public class Demo {

	public static void main(String[] args) throws Exception 
	{
		//2.loading and registering the driver.
		String url="jdbc:mysql://localhost:3306/m07";
		String user="root";
		String pass="Nayna@123";
		
		String query="SELECT * FROM m07.details where uid=2110611";//this is the query to execute
		
		//3.Establish the connection forName is used to load the class.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		
		//4.create the statement.
		Statement st=con.createStatement();
		
		//5.execute the query st.executeQuery(query) .
		//6.process the result by using result set.
		ResultSet rs= st.executeQuery(query);
		rs.next();
		
		System.out.println("UID of the student is"  + rs.getInt(1));
		System.out.println("name of the student is " + rs.getString(2));
		System.out.println("age of the student is " + rs.getString(3));
		
		//7.close the connection.
		st.close();
		con.close();
	}

}
