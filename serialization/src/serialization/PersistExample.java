package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersistExample {

	public static void main(String[] args) throws Exception 
	{
		try {
			Student s1=new Student(211,"Ravi",22);//creating object
			//writing object into file
			FileOutputStream f=new FileOutputStream("file2.txt");
			ObjectOutputStream out=new ObjectOutputStream(f);
			out.writeObject(s1);
			out.flush();
			out.close();
			f.close();
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
