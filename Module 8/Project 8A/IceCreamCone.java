import java.text.DecimalFormat;

/**
 * Ice cream cone class.
 *
 * Project 06
 * Stephen Sallas COMP 1210-005
 * 10/14/19
 */
public class IceCreamCone
{
   // Instance Variables
   private String label = "";
   private double radius = 0;
   private double height = 0;
   
   // Class Variables
   private static int counter = 0;
   
   /**
    * Constructor.
    * @param labelIn inputs label
    * @param radiusIn inputs radius
    * @param heightIn inputs height
    */
   public IceCreamCone(String labelIn, double radiusIn, double heightIn)
   {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
      counter++;
   }
   
   /**
    * Method to retrieve label.
    * @return label as a string 
    */
   public String getLabel()
   {
      return label;
   }
   
   /**
    * Method to set the label string.
    * @param labelIn to input label 
    * @return false if string is null, true if string is  not null
    */ 
   public boolean setLabel(String labelIn)
   {
      if (labelIn == null)
      {
         return false;
      }
      else
      {
         label = labelIn.trim();
         return true;
      }
   }
   
   /**
   * Method to retrieve radius.
   * @return radius as a double 
   */
   public double getRadius()
   {
      return radius;
   }
   
   /**
   * Method to set radius.
   * @param radiusIn to input radius 
   * @return false if radius is 0, true if radius is not 0
   */
   public boolean setRadius(double radiusIn)
   {
      if (radiusIn <= 0)
      {
         return false;
      }
      else
      {
         radius = radiusIn;
         return true;
      }
   }
   
   /**
   * Method to retrieve height. 
   * @return height as a double
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   * Method to input height.
   * @param heightIn to input height
   * @return false if height is 0, true if height is not 0
   */
   public boolean setHeight(double heightIn)
   {
      if (heightIn <= 0)
      {
         return false;
      }
      else
      {
         height = heightIn;
         return true;
      }
   }
   
   /**
   * Method to calculate surface area.
   * @return a which is surface area as a double
   */
   public double surfaceArea()
   {
      double cA = Math.PI * radius * Math.sqrt(Math.pow(height, 2) 
            + Math.pow(radius, 2));
      
      double hA = 2 * Math.PI * Math.pow(radius, 2);
      
      double a = cA + hA;
      
      return a;  
   }
   
   /**
   * Method to calculate volume.
   * @return v which is volume as a double
   */
   public double volume()
   {
      double cV = (height * Math.PI * Math.pow(radius, 2)) / 3;
      
      double hV = (2 * Math.PI * Math.pow(radius, 3)) / 3;
      
      double v = cV + hV;
      
      return v;
   }
   
   /**
   * Method to convert all information to a printable string.
   * @return output as a string which is all inputted information
   */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0######");
      
      String output = "IceCreamCone \"" + label + "\" with radius = "
            + df.format(radius) + " and height = " + df.format(height) 
            + " units has:\n";
            
      output += "\tsurface area = " + df.format(surfaceArea())
            + " square units\n";
      
      output += "\tvolume = " + df.format(volume()) + " cubic units"; 
     
      return output;         
   }
   
   /**
    * Method to return the count of IceCreamCones.
    * @return counter = number of IceCreamCones created
    */
   public static int getCount()
   {
      return counter;
   }
   
   /**
    * Method to reset counter to 0.
    */
   public static void resetCount()
   {
      counter = 0;
   }
   
   /**
    * Method to check if an object is an IceCreamCone.
    * @param obj = object to compare
    * @return true, false   
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof IceCreamCone))
      {
         return false;
      }
      else
      {
         IceCreamCone icc = (IceCreamCone) obj;
         return (label.equalsIgnoreCase(icc.getLabel())
            && Math.abs(radius - icc.getRadius()) < .000001
            && Math.abs(height - icc.getHeight()) < .000001);
      }
   }
   
   /**
    * Required by checkstyle.
    * @return 0  
    */
   public int hashCode()
   {
      return 0;
   }
}
      

   
   
