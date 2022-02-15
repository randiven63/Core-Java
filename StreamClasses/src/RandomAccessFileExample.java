import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample 
{
	static final String FILEPATH="file1.txt";
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(new String(readFromFile(FILEPATH,0,18)));
			writeToFile(FILEPATH,"i LOVE MY COUNTRY AND MY PEOPLE",31);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	private static byte[] readFromFile(String filepath, int position, int size) throws IOException
	{
		RandomAccessFile file=new RandomAccessFile(FILEPATH,"r");
		file.seek(position);
		byte[] bytes=new byte[size];
		file.read(bytes);
		file.close();
		return bytes;
	}
	private static void writeToFile(String filepath, String data, int position) throws IOException
	{
		RandomAccessFile file=new RandomAccessFile(FILEPATH,"rws");
		file.seek(position);
		//byte[] bytes=new byte[size];
		file.write(data.getBytes());
		file.close();
		
	}
}
