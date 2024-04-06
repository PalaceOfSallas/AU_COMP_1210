import java.util.ArrayList;

/**
 * Temeperatures Class.
 *
 * Activity 06
 * Stephen Sallas COMP 1210-005
 * 10/7/19
 */
public class Temperatures
{
   // Instance Variables
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
   /**
    * Constructor.
    * @param temperaturesIn = inputted temperatures.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   
   /**
    * Getting low temperature.
    * @return lowTemp = low temperature.
    */
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /**
    * Getting high temperature.
    * @return highTemp = high temperature.
    */
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }

      int high = temperatures.get(0);
      for (Integer temp : temperatures)
      {
         if (temp > high)
         {
            high = temp;
         }
      }
      return high;
   }
   
   /**
    * Returns lowest temperature.
    * @param lowIn = inputted low temperature.
    * @return lowIn, getLowTemp() = returns lowest temperature.
    */
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
    * Returns highest temperature.
    * @param highIn = inputted high temperature.
    * @return highIn, getHighTemp() = returns highest temperature.
    */
   public int higherMaximum(int highIn)
   {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
    * Returns string.
    * @return output = final output.
    */
   public String toString()
   {
      return "\tTemperatures: " + temperatures
            + "\n\tLow: " + getLowTemp()
            + "\n\tHigh: " + getHighTemp();

   }
      

   
   
   

      
      
       

   
   
   
   
   
   
   
   
   
   
   
   
}
 
 