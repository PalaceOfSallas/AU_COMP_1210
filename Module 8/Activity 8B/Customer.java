/**
 * Customer class.
 *
 * Activity 08B
 * Stephen Sallas COMP 1210-005
 * 10/28/19
 */
public class Customer
   implements Comparable<Customer>
{
   // Instance Variables
   private String name;
   private String location;
   private double balance;
   
   /**
    * Constructor.
    * @param nameIn  
    */
   public Customer(String nameIn)
   {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
    * Setting location.
    * @param locationIn 
    */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
   /**
    * Setting location (2).
    * @param city 
    * @param state 
    */
   public void setLocation(String city, String state)
   {
      location = city + ", " + state;
   }

   
   /**
    * Setting balance.
    * @param amount 
    */
   public void changeBalance(double amount)
   {
      balance = amount;
   }
   
   /**
    * Getting location.
    * @return location 
    */
   public String getLocation()
   {
      return location;
   }
   
   /**
    * Getting balance.
    * @return balance 
    */
   public double getBalance()
   {
      return balance;
   }
   
   /**
    * Final output.
    * @return output  
    */
   public String toString()
   {
      String output = name + "\n";
      output += location + "\n";
      output += "$" + balance;
      return output;
   }
   
   /**
    * Comparing to another object.
    * @param obj 
    * @return 0, -1, 1    
    */
   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001)
      {
         return 0; // equal
      }
      else if (this.balance < obj.getBalance())
      {
         return -1;
      }
      else
      {
         return 1;
      }
   }
}

   
   


      

   
   
   
   
   