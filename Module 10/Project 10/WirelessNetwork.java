import java.text.DecimalFormat;

/**
 * Wireless Network class.
 *
 * Project 10
 * Stephen Sallas COMP 1210-005
 * 11/21/19
 */
public abstract class WirelessNetwork 
      implements Comparable<WirelessNetwork>
{
   // Instance Variables
   protected String name;
   protected double bandwidth;
   protected double monthlyFixedCost;
   
   // Static Variables
   protected static int count = 0;
   
   /**
    * Constructor.
    * @param nameIn 
    * @param bandwidthIn 
    * @param monthlyFixedCostIn 
    */
   public WirelessNetwork(String nameIn, double bandwidthIn, 
         double monthlyFixedCostIn)
   {
      name = nameIn;
      bandwidth = bandwidthIn;
      monthlyFixedCost = monthlyFixedCostIn;
      count++;
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
    * Setting name.
    * @param nameIn 
    */
   public void setName(String nameIn)
   {
      name = nameIn;
   }
   
   /**
    * Getting bandwidth.
    * @return bandwidth 
    */
   public double getBandwidth()
   {
      return bandwidth;
   }
   
   /**
    * Setting bandwidth.
    * @param bandwidthIn 
    */
   public void setBandwidth(double bandwidthIn)
   {
      bandwidth = bandwidthIn;
   }
   
   /**
    * Getting monthlyFixedCost.
    * @return monthlyFixedCost  
    */
   public double getMonthlyFixedCost()
   {
      return monthlyFixedCost;
   }
   
   /**
    * Setting monthlyFixedCost.
    * @param monthlyFixedCostIn 
    */
   public void setMonthlyFixedCost(double monthlyFixedCostIn)
   {
      monthlyFixedCost = monthlyFixedCostIn;
   }
   
   /**
    * Getting count.
    * @return count  
    */
   public static int getCount()
   {
      return count;
   }
   
   /**
    * Resetting count.  
    */
   public static void resetCount()
   {
      count = 0;
   }
   
   /**
    * To string.
    * @return output 
    */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      
      String output = name + " (" + this.getClass() + ") Cost: "
            + df.format(monthlyCost()) + "\nBandwidth: " + bandwidth 
            + " Mbps";
            
      return output;
   }
   
   /**
    * @return monthlyCost
    */
   public abstract double monthlyCost(); 
   
   /**
    * @param wirelessNetworkIn 
    * @return result 
    */
   public int compareTo(WirelessNetwork other)
   {
      return name.toLowerCase()  
            .compareTo(other.getName().toLowerCase());
   }
}
