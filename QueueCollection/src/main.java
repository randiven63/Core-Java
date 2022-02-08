import java.util.*;

public class main {

	public static void main(String[] args) {
		Queue<String> list=new PriorityQueue<String>();
		list.add("Nayna");
		list.add("poonam");
		list.add("Tejashri");
		list.add("Sanjana");
		System.out.println(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		for(String s:list)
			System.out.println(s);
	}

}
