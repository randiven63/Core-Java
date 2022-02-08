//ArrayList in collection framework.

import java.util.*;
public class TestJavaCollection {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Nayna");
		list.add("poonam");
		list.add("Tejashri");
		list.add("Sanjana");
		//System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//for(String s:list)
			//System.out.println(s);
	}

}
