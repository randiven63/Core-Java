package tnsindiafoundation.c2tc.m07;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("tnsindiafoundation.c2tc.m07.Student");
		Student.display();
		//Student s=new Student();
		//s.display();
	}

}
