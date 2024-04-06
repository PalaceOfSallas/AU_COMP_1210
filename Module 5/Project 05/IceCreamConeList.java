import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Ice cream cone class.
 *
 * Project 05
 * Stephen Sallas COMP 1210-005
 * 10/4/19
 */
public class IceCreamConeList
{
   // Instance Variables
   private String listName = "";
   private ArrayList<IceCreamCone> list = new ArrayList<IceCreamCone>();
   
   /**
    * Constructor.
    * @param x = Name of list.
    * @param y = Array list of ice cream cones. 
    */
   public IceCreamConeList(String x, ArrayList<IceCreamCone> y)
   {
      listName = x;
      list = y;
   }
   
   /**
    * Method to get name of list.
    * @return listName
    */
   public String getName()
   {
      return listName;
   }
   
   /**
    * Method to return number of Ice cream cones in array.
    * @return numObjects
    */
   public int numberOfIceCreamCones()
   {
      int numObjects = list.size();
      return numObjects;
   }
   
   /**
    * Method returning total surface area of all ice cream cones.
    * @return totalSA
    */
   public double totalSurfaceArea()
   {
      // Variables
      double totalSA = 0;
      int index = 0;
      
      // Adding All Surface Areas
      while (index <= (list.size() - 1))
      {
         totalSA += (list.get(index)).surfaceArea();
         index++;
      }
      
      // Returning Total
      return totalSA;
   }
   
   /**
    * Method returning total volume of all ice cream cones.
    * @return totalV
    */
   public double totalVolume()
   {
      // Variables
      double totalV = 0;
      int index = 0;
      
      // Adding All Surface Areas
      while (index <= (list.size() - 1))
      {
         totalV += (list.get(index)).volume();
         index++;
      }
      
      // Returning Total
      return totalV;
   }
   
   /**
    * Method returning average surface area of all ice cream cones.
    * @return averageSA
    */
   public double averageSurfaceArea()
   {
      // Variables
      double averageSA = 0;
      
      // Averaging and Returning Surface Areas
      if (list.size() == 0)
      {
         return averageSA;
      }
      else 
      {
         averageSA = (totalSurfaceArea() / list.size());
         return averageSA;
      }
   }
   
   /**
    * Method returning average volume of all ice cream cones.
    * @return averageV
    */
   public double averageVolume()
   {
      // Variables
      double averageV = 0;
      
      // Averaging and Returning Surface Areas
      if (list.size() == 0)
      {
         return averageV;
      }
      else 
      {
         averageV = (totalVolume() / list.size());
         return averageV;
      }
   }
   
   /**
    * Method returning string message.
    * @return output
    */
   public String toString()
   {
      // Variables
      int index = 0;
      String output = (listName + "\n" + "\n");
      
      // Loop to Add to String
      while (index <= (list.size() - 1))
      {
         output += (list.get(index)).toString() + "\n\n";
         index++;
      }
      
      // Returning String
      return output;
   }
   
    /**
    * Method returning summary.
    * @return output
    */
   public String summaryInfo()
   {
      // Decimal Format
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      //Variables
      String output = "";
      
      // Creating the String
      output += "----- Summary for " + listName + " -----\n";
      output += "Number of IceCreamCone Objects: " + list.size() + "\n";
      output += "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n";
      output += "Total Volume: " + df.format(totalVolume()) + "\n";
      output += "Average Surface Area: " + df.format(averageSurfaceArea())
          + "\n";
      output += "Average Volume: " + df.format(averageVolume());
      
      // Return Output
      return output;
   } 
}