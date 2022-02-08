import java.util.*;

public class main1 {

	public static void main(String[] args) {
		List<String> list=new Stack<String>();
		((Stack<String>) list).push("Nayna");
		((Stack<String>) list).push("poonam");
		((Stack<String>) list).push("Tejashri");
		((Stack<String>) list).push("Sanjana");
		((Stack<String>) list).push("Bhakti");
		System.out.println(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		for(String s:list)
			System.out.println(s);
		//System.out.println(((Stack<String>) list).pop());
	}

}
