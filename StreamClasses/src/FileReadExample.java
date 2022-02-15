import java.io.FileReader;
import java.io.Reader;
//import java.util.*;
public class FileReadExample 
{
	public static void main(String[] args) 
	{
		try
		{
			Reader reader=new FileReader("file1.txt");
			int data=reader.read();
			while(data!=-1)
			{
				System.out.print((char)data);
				data=reader.read();
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
