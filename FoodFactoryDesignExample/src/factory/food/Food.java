package factory.food;

public interface Food 
{
	 public String getType();
}
class Pizza implements Food 
{
	 public String getType() 
	 {
		 return "Someone ordered a Fast Food!";
	 }
}

class Cake implements Food 
{
	 public String getType() 
	 {
		 return "Someone ordered a Dessert!";
	 }
}

class FoodFactory 
{
		public Food getFood(String order) 
		{
           if(order == null )
        	   return null;
           else if(order.equalsIgnoreCase("cake"))
        	   return new Cake();
           else if(order.equalsIgnoreCase("pizza"))
        	   return new Pizza();
           else
        	   return null;
           
         
		}
		//End of getFood method
		 public static void main(String[] args) 
         {
          		FoodFactory ff=new FoodFactory();
             	Food f=ff.getFood("cake");
             	f.getType();
          }	

}