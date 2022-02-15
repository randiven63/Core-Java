package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) 
	{
		try
		{
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("file2.txt"));
			Student s=(Student)in.readObject();
			System.out.println(s.id+" "+s.name+" "+s.age);
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
