/**
 * Cellular class.
 *
 * Project 10
 * Stephen Sallas COMP 1210-005
 * 11/21/19
 */
public class Cellular extends WirelessNetwork
{
   // Instance Variables
   protected double time;
   protected double dataLimit;
   
   /**
    * Constant Variable.
    */
   public static final double COST_FACTOR = 1.0;
   
   /**
    * Constructor.
    * @param nameIn 
    * @param bandwidthIn 
    * @param monthlyFixedCostIn 
    * @param timeIn 
    * @param dataLimitIn      
    */
   public Cellular(String nameIn, double bandwidthIn, 
         double monthlyFixedCostIn, double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, monthlyFixedCostIn);
      time = timeIn;
      dataLimit = dataLimitIn;
   }
   
   /**
    * Getting time.
    * @return time   
    */
   public double getTime()
   {
      return time;
   }
   
   /**
    * Setting time.
    * @param timeIn 
    */
   public void setTime(double timeIn)
   {
      time = timeIn;
   }
   
   /**
    * Getting dataLimit.
    * @return dataLimit    
    */
   public double getDataLimit()
   {
      return dataLimit;
   }
   
   /**
    * Setting dataLimit.
    * @param dataLimitIn 
    */
   public void setDataLimit(double dataLimitIn)
   {
      dataLimit = dataLimitIn;
   }
   
   /**
    * Returning dataUsage.
    * @return dataUsage    
    */
   public double dataUsage()
   {
      double dataUsage = bandwidth / 8000 * time;
      
      return dataUsage;
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
               * Cellular.COST_FACTOR;
      }
   }
   
   /**
    * To string.
    * @return output 
    */
   public String toString()
   {
      String output = super.toString() 
            + "\nTime: " + time + " seconds\n" 
            + "Data Limit: " + dataLimit + " GB\n" 
            + "Data Used: " + dataUsage() + " GB";
            
      return output;
   }  



   
   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
