//Taking input dynamically from the user.

package tnsindiafoundation.c2tc.m07; //1 create the package

import java.sql.*;
import java.util.Scanner;
//import java.lang.ClassNotFoundException;
public class Demo2 {

	public static void main(String[] args) throws Exception 
	{
		try (Scanner sc = new Scanner(System.in)) {
			String name=sc.nextLine();
			int uid = sc.nextInt();
			String age=sc.next();
			
			String url="jdbc:mysql://localhost:3306/m07";
			String user="root";
			String pass="Nayna@123";
			
			System.out.println(uid);
			System.out.println(name);
			System.out.println(age);
			
			//Insert
			//String query="INSERT INTO `m07`.`details` VALUES " 
					//+ "("+ uid +", "+ name +", "+ age +"); ";
			
			//delete
			//String query="DELETE FROM `details` WHERE uid = 2100800 ";
			
			//Upadate
			String query="UPDATE `details` SET `uid` = '2100804' WHERE (`uid` = '2100800');";

								
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			
			Statement st=con.createStatement();
			
			int rs= st.executeUpdate(query);
			//System.out.println("Number of rows inserted"+rs);
			System.out.println("Number of rows Updated"+rs);
			//System.out.println("Number of rows deleted"+rs);
					
			st.close();
			con.close();
		}
	}

}
