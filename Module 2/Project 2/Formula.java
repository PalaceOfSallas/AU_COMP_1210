import java.util.Scanner;

/** 
 * Reads input values and computes.
 *
 * Activity 2
 * Stephen Sallas COMP 1210-005
 * 9/6/19
 */
public class Formula 
{
   /** 
    * Reads input values and uses specified formula.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args)
   {
      // Scanner
      Scanner userInput = new Scanner(System.in);
      
      // Variables
      double x, y, z, result;
      
      // Outputting Formula
      System.out.println("result = (3x + 10.5) (2y + 7.5) (z + 5.5) / xyz");
      
      // Inputting information
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      
      // Calculation with Exception Handling
      if ((x == 0) || (y == 0) || (z == 0))
      {
         result = 0;
         System.out.println("result = " + result);
      }
      else
      {
         result = (((3 * x + 10.5) * (2 * y + 7.5) * (z + 5.5)) / (x * y * z));
         System.out.println("result = " + result);
      }
   }
}
   
