import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ice cream cone list class.
 *
 * Project 06
 * Stephen Sallas COMP 1210-005
 * 10/14/19
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
   
   /////////////////////////////////////////////////////////////////////////////
   
   /**
    * Returns array list.
    * @return x = array of ice cream cones.
    */
   public ArrayList<IceCreamCone> getList()
   {
      return list;
   }
   
   /**
    * Reads in file.
    * @param fileName = inputted file name.
    * @return newList = array of ice cream cones.
    * @throws FileNotFoundException = Catches if file is not found.
    */
   public IceCreamConeList readFile(String fileName) 
      throws FileNotFoundException
   {
      // Variables
      ArrayList<IceCreamCone> newList = new ArrayList<IceCreamCone>();
      
      // File Scanner
      Scanner scanFile = new Scanner(new File(fileName));
      
      // Getting List Name
      String newListName = scanFile.nextLine(); 
      
      // Creating Ice Cream Cones
      while (scanFile.hasNext())
      {
         String labelIn = scanFile.nextLine();
         double radiusIn = Double.parseDouble(scanFile.nextLine());
         double heightIn = Double.parseDouble(scanFile.nextLine());
         newList.add(new IceCreamCone(labelIn, radiusIn, heightIn));  
      }
      scanFile.close();
      
      // Creating and Returning New List
      IceCreamConeList x = new IceCreamConeList(newListName, newList);
      return x;
   }
   
   /**
    * Adds an ice cream cone to the list.
    * @param labelIn = new label.
    * @param radiusIn = new radius.
    * @param heightIn = new height
    */
   public void addIceCreamCone(String labelIn, double radiusIn, double heightIn)
   {
      list.add(new IceCreamCone(labelIn, radiusIn, heightIn));
   }
   
   /**
    * Inputs an IceCreamCone label and returns the IceCreamCone object.
    * @param labelIn = label to search for.
    * @return list.get(index), null = IceCreamCone that matches label or N/A.
    */
   public IceCreamCone findIceCreamCone(String labelIn)
   {
      // Variables
      int index = 0;
      
      // Loop to Check for Label
      while (index < list.size())
      {
         
         // Comparing Labels and Returning if Same
         if (list.get(index).getLabel().equalsIgnoreCase(labelIn))
         {
            return list.get(index);
         }
         
         // Increasing Index
         index++;
      }
      
      // Returning Null if Label is Never Found
      return null;
   }
   
   /**
    * Deletes an Ice Cream Cone.
    * @param labelIn = label to search for.
    * @return x, null = Deleted IceCreamCone or N/A.
    */
   public IceCreamCone deleteIceCreamCone(String labelIn)
   {
      
      IceCreamCone x = findIceCreamCone(labelIn);
      
      if (x == null)
      {
         return null;
      }
      else
      {
         list.remove(x);
         return x;
      }
   }
   
   /**
    * Edits an Ice Cream Cone.
    * @param labelIn = label to search for.
    * @param radiusIn = new radius.
    * @param heightIn = new height.
    * @return true, false = if label is found or not.
    */
   public boolean editIceCreamCone(String labelIn, double radiusIn, 
      double heightIn)
   {
      // Variables
      int index = 0;
      
      // Loop to Check for Label
      while (index < list.size())
      {
         
         // Comparing Labels and Returning if Same
         if (list.get(index).getLabel().equalsIgnoreCase(labelIn))
         {
            list.get(index).setRadius(radiusIn);
            list.get(index).setHeight(heightIn);
            return true;
         }
         
         // Increasing Index
         index++;
      }
      
      // Returning False if Label is Never Found
      return false;   
   }
}