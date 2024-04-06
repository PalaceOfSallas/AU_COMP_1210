/**
 * FiveG class.
 *
 * Project 10
 * Stephen Sallas COMP 1210-005
 * 11/21/19
 */
public class FiveG extends Cellular
{
   /**
    * Constant Variable.
    */
   public static final double COST_FACTOR = 5.0;
   
   /**
    * Constructor.
    * @param nameIn 
    * @param bandwidthIn 
    * @param monthlyFixedCostIn 
    * @param timeIn 
    * @param dataLimitIn      
    */
   public FiveG(String nameIn, double bandwidthIn, 
         double monthlyFixedCostIn, double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, monthlyFixedCostIn, timeIn,
            dataLimitIn);
   }
   
   /**
    * Monthly cost.
    * @return monthlyCost 
    */
   public double monthlyCost()
   {
      double monthlyCost = monthlyFixedCost;
      
      if (dataUsage() <= dataLimit)
      {
         return monthlyCost;
      }
      else
      {
         return monthlyFixedCost + (dataUsage() - dataLimit)
               * FiveG.COST_FACTOR * 3;
      }
   }

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
