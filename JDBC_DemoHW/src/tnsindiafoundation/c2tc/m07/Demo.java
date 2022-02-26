package tnsindiafoundation.c2tc.m07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/m07";
		String user="root";
		String pass="Nayna@123";
		
		String query="SELECT * FROM m07.details";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.prepareStatement(query);
		
		ResultSet rs= st.executeQuery(query);
		System.out.println("uid \t\t name \t\t age");
		 
        // Condition check
        while (rs.next()) 
        {
        	int uid = rs.getInt("uid");
            String name = rs.getString("name");
            String age = rs.getString("age");
            System.out.println(uid + "\t\t" + name + "\t\t" + age);
        }
        
		st.close();
		con.close();
	}

}
