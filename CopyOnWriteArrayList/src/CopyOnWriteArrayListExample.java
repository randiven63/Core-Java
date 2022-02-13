import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListExample 
{
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Ram","Ravi","Krishna");
		CopyOnWriteArrayList<String> c=new CopyOnWriteArrayList<String>(list);
		System.out.println("Without modification="+c);
		Iterator<String> iterator1=c.iterator();
		c.add("hi");
		System.out.println("After modification="+c);
		Iterator<String> iterator2=c.iterator();
		System.out.println("Element from first Iterator:");
		iterator1.forEachRemaining(System.out::println);
		System.out.println("Element from second Iterator:");
		iterator2.forEachRemaining(System.out::println);

	}
	

}
