/**
 * Inventory List App.
 *
 * Activity 10
 * Stephen Sallas COMP 1210-005
 * 11/11/19
 */
public class InventoryListApp
{
   /**
    * Main method in driver class.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args)
   {
      // Variable
      ItemsList myItems = new ItemsList();
      
      // Setting Tax Rate
      InventoryItem.setTaxRate(0.05);
      
      // Adding Items
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      // Printing
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}