import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ice cream cone list class.
 *
 * Project 07
 * Stephen Sallas COMP 1210-005
 * 10/18/19
 */
public class IceCreamConeList2
{
   // Instance Variables
   private String listName = "";
   // private ArrayList<IceCreamCone> list = new ArrayList<IceCreamCone>();
   private IceCreamCone[] list;
   private int listLength = 0;

   /**
    * Constructor.
    * @param x = Name of list.
    * @param y = Array of ice cream cones.
    * @param z = length of array. 
    */
   public IceCreamConeList2(String x, IceCreamCone[] y, int z)
   {
      listName = x;
      list = y;
      listLength = z;
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
      return listLength;
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
      while (index <= (listLength - 1))
      {
         totalSA += list[index].surfaceArea();
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
      while (index <= (listLength - 1))
      {
         totalV += list[index].volume();
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
      if (listLength == 0)
      {
         return averageSA;
      }
      else 
      {
         averageSA = (totalSurfaceArea() / listLength);
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
      if (listLength == 0)
      {
         return averageV;
      }
      else 
      {
         averageV = (totalVolume() / listLength);
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
      while (index <= (listLength - 1))
      {
         output += list[index].toString() + "\n\n";
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
      output += "Number of IceCreamCone Objects: " + listLength + "\n";
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
   public IceCreamCone[] getList()
   {
      return list;
   }
   
   /**
    * Reads in file.
    * @param fileName = inputted file name.
    * @return newList = array of ice cream cones.
    * @throws FileNotFoundException = Catches if file is not found.
    */
   public IceCreamConeList2 readFile(String fileName) 
      throws FileNotFoundException
   {
      // Variables
      IceCreamCone[] newList = new IceCreamCone[20];
      int index = 0;
      
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
         newList[index] = new IceCreamCone(labelIn, radiusIn, heightIn);
         index++;
      }
      scanFile.close();
      
      // Creating and Returning New List
      IceCreamConeList2 x = new IceCreamConeList2(newListName, newList, index);
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
      list[listLength] = new IceCreamCone(labelIn, radiusIn, heightIn);
      listLength++;
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
      while (index < listLength)
      {
         
         // Comparing Labels and Returning if Same
         if (list[index].getLabel().equalsIgnoreCase(labelIn))
         {
            return list[index];
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
      // Variables
      int index = 0;
      IceCreamCone deleted = new IceCreamCone("Placeholder", 0, 0);
      
      // Deleting and Adjusting Array
      if (findIceCreamCone(labelIn) == null)
      {
         return null;
      }
      else
      {
         // Loop to Check for Label
         while (index < listLength)
         {
            // Comparing Labels and Returning if Same
            if (list[index].getLabel().equalsIgnoreCase(labelIn))
            {
               deleted = list[index];
               list[index] = null;
               index++;
               while (list[index] != null)
               {
                  list[index - 1] = list[index];
                  list[index] = null;
                  index++;
               }
            }
            // Increasing Index
            index++;
         }
         listLength--;
         return deleted;
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
      while (index < listLength)
      {
         
         // Comparing Labels and Returning if Same
         if (list[index].getLabel().equalsIgnoreCase(labelIn))
         {
            list[index].setRadius(radiusIn);
            list[index].setHeight(heightIn);
            return true;
         }
         
         // Increasing Index
         index++;
      }
      
      // Returning False if Label is Never Found
      return false;   
   }
}