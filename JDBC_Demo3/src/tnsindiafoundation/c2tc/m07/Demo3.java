package tnsindiafoundation.c2tc.m07;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			String name=sc.nextLine();
			int uid = sc.nextInt();
			String age=sc.next();
			//String age=sc.next();
			
			String url="jdbc:mysql://localhost:3306/m07";
			String user="root";
			String pass="Nayna@123";
			
			String query="INSERT INTO `m07`.`details` VALUES (?,?,?);";//this is the query to append execute
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			
			//Concatenation of two string
			PreparedStatement st=con.prepareStatement(query);
			st.setInt(1, uid);
			st.setString(2, name);
			st.setString(3, age);
			
			int rs= st.executeUpdate();
			//rs.next();
			System.out.println("Number of rows updated" +rs);
			
			st.close();
			con.close();
		}
	}

}
