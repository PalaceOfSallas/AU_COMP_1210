/**
 * WiFi class.
 *
 * Project 10
 * Stephen Sallas COMP 1210-005
 * 11/21/19
 */
public class WiFi extends WirelessNetwork
{
   // Instance Variable
   private double modemCost;
   
   /**
    * Constructor.
    * @param nameIn 
    * @param bandwidthIn 
    * @param monthlyFixedCostIn 
    * @param modemCostIn  
    */
   public WiFi(String nameIn, double bandwidthIn, 
         double monthlyFixedCostIn, double modemCostIn)
   {
      super(nameIn, bandwidthIn, monthlyFixedCostIn);
      modemCost = modemCostIn;
   }
   
   /**
    * Getting modemCost.
    * @return modemCost  
    */
   public double getModemCost()
   {
      return modemCost;
   }
   
   /**
    * Setting modemCost.
    * @param modemCostIn 
    */
   public void setModemCost(double modemCostIn)
   {
      modemCost = modemCostIn;
   }
   
   /**
    * Monthly cost.
    * @return monthlyCost 
    */
   public double monthlyCost()
   {
      double monthlyCost = monthlyFixedCost + modemCost;
      return monthlyCost;
   }


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
