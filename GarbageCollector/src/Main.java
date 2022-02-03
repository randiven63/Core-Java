
public class Main {
	String obj_name;
	public Main(String obj_name)
	{
		this.obj_name=obj_name;
	}
	public static void main(String[] args) {
		Main t1=new Main("t1");
		Main t2=new Main("t2");
		t1=t2;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println(this.obj_name+"Successful");
	}
}
