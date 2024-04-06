import java.util.Scanner;

/** 
 * Reads input of ounces of oil.
 *
 * Activity 2
 * Stephen Sallas COMP 1210-005
 * 9/6/19
 */
public class OilUnits 
{
   /** 
    * Uses inputted ounces of oil to do calculations.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args)
   {
      // Scanner
      Scanner userInput = new Scanner(System.in);
      
      // Variables
      int ouncesOriginal, barrels, gallons, quarts, ounces;
      
      // Inputting Original Ounces of Oil
      System.out.print("Enter amount of oil in ounces: ");
      ouncesOriginal = userInput.nextInt();
      
      // Output Statements and Exception Handling
      if (ouncesOriginal >= 1000000000)
      {
         System.out.println("Amount must not exceed 1,000,000,000.");
      }
      else
      {
         // Calculations
         ounces = ouncesOriginal;
         barrels = (ounces / 5376);
         ounces = (ounces - barrels * 5376);
         gallons = (ounces / 128);
         ounces = (ounces - gallons * 128);
         quarts = (ounces / 32);
         ounces = (ounces - quarts * 32);
         
         // Outputs
         System.out.println("Oil amount in units:");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         System.out.println(ouncesOriginal + " oz = (" + barrels
                  + " bl * 5376 oz) + (" + gallons + " gal * 128 oz) + (" 
                  + quarts + " qt * 32 oz) + (" + ounces + " oz)");   
      }
   }
}