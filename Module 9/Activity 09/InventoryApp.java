/**
 * Inventory App class (Driver).
 *
 * Activity 09
 * Stephen Sallas COMP 1210-005
 * 11/4/19
 */
public class InventoryApp
{
   /**
    * Main method in driver class.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args)
   {
      // Setting Tax Rate
      InventoryItem.setTaxRate(0.05);
      
      // Creating Items
      InventoryItem item1 = new InventoryItem("Oil Change Kit", 39.00);
      
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
   }
}
