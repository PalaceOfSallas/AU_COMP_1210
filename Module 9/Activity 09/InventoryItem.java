/**
 * Inventory Item class.
 *
 * Activity 09
 * Stephen Sallas COMP 1210-005
 * 11/4/19
 */
public class InventoryItem
{
   // Instance Variables
   protected String name;
   protected double price;
   
   // Static Variables
   private static double taxRate = 0;
   
   /**
    * Constructor.
    * @param nameIn  
    * @param priceIn  
    */
   public InventoryItem(String nameIn, double priceIn)   
   {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * Getting name.
    * @return name    
    */
   public String getName()
   {
      return name;
   }
   
   /**
    * Calculating cost.
    * @return price * (1 + taxRate)    
    */
   public double calculateCost()
   {
      return price * (1 + taxRate);
   }
   
   /**
    * Setting tax rate.
    * @param taxRateIn    
    */
   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   }
   
   /**
    * To string.
    * @return name + ": $" + calculateCost()    
    */
   public String toString()
   {
      return name + ": $" + calculateCost();
   }   
}
