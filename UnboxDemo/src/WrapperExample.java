//Unboxing example of Integer to int
public class WrapperExample {

	public static void main(String[] args) {
		Integer a=new Integer(3);
		int i=a.intValue();
		int j=a;
		System.out.println(a+ " " +i+ " " +j);
	}

}
