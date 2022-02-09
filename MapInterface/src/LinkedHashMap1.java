import java.util.*;
public class LinkedHashMap1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(103, "Rahul");
		//map.put(100, "Sanjana");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	
	}

}
