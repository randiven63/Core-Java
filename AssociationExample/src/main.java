class Person
{ 
	private String Name;
	private Address address;
	public Person()
	{
		address=new Address();
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public Address getAddress()
	{
		return address;
	}
	public String toString()
	{
		return "Person Name: " + Name + address;
	}
}
class Address
{
	private int doorNo;
	private String rem;
	public int getDoorNo()
	{
		return doorNo;
	}
	public void setDoorNo(int doorNo)
	{
		this.doorNo=doorNo;
	}
	public String getRem()
	{
		return rem;
	}
	public void setRem(String rem)
	{
		this.rem=rem;
	}
	public String toString()
	{
		return "Address: " + doorNo + "," +rem;
	}
}
public class main 
{
	public static void main(String[] args)
	{
		Person person=new Person();
		person.setName("mahendra singh dhoni");
		person.getAddress().setDoorNo(07);
		person.getAddress().setRem("XXX,Ranchi,Jharkhand");
		System.out.println(person);
		person=null;
		if(person!=null){
			System.out.println(person.getAddress());
		}
		else
		{
			System.out.println("Address does not Exist");
		}
	}

}
