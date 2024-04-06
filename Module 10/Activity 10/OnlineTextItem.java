/**
 * Online Text Item class.
 *
 * Activity 09
 * Stephen Sallas COMP 1210-005
 * 11/4/19
 */
public abstract class OnlineTextItem extends InventoryItem
{
   /**
    * Constructor.
    * @param nameIn   
    * @param priceIn   
    */
   public OnlineTextItem(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
   }
   
   /**
    * Calculating cost (override).
    * @return price   
    */
   public double calculateCost()
   {
      return price;
   }
}
