/**
 * Inventory Item class.
 *
 * Activity 10
 * Stephen Sallas COMP 1210-005
 * 11/11/19
 */
public class ItemsList
{
   // Instance Variables
   private InventoryItem[] inventory;
   private int count;
   
   /**
    * Constructor. 
    */
   public ItemsList()
   {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
    * Adds item.
    * @param itemIn  
    */
   public void addItem(InventoryItem itemIn)
   {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
    * Adds item.
    * @param electronicsSurcharge 
    * @return total 
    */
   public double calculateTotal(double electronicsSurcharge)
   {
      double total = 0;
      for (int i = 0; i < count; i++)
      {
         if (inventory[i] instanceof ElectronicsItem)
         {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else
         {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
    * To string.
    * @return output     
    */
   public String toString()
   {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++)
      {
         output += inventory[i] + "\n";
      }
      
      return output;
   }   
   
   

   
   

   
   
   
   
   
   
   
   
   
   
}
