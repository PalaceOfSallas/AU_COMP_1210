/**
 * Electronics Item class.
 *
 * Activity 09
 * Stephen Sallas COMP 1210-005
 * 11/4/19
 */
public class ElectronicsItem extends InventoryItem
{
   // Instance Variable
   protected double weight;
   
   /** 
    * Static Variable.
    */
   public static final double SHIPPING_COST = 1.5;
   
   /**
    * Constructor.
    * @param nameIn   
    * @param priceIn 
    * @param weightIn   
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn)
   {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
    * Calculating cost (override).
    * @return super.calculateCost() + (SHIPPING_COST * weight) 
    */
   public double calculateCost()
   {
      return super.calculateCost() + (SHIPPING_COST * weight);
   } 
}