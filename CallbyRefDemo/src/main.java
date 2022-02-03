//Code for Call by Reference

class Operation2
{
	int data=50;
	void change(Operation2 op)
	{
		op.data=op.data+100;
	}
}
public class main {

	public static void main(String[] args) {
		Operation2 op=new Operation2();
		System.out.println("before change " +op.data);
		op.change(op);//passing an object
		System.out.println("after change " +op.data);
	}

}
