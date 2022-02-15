package serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable 
{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

}
