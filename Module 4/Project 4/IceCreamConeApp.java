import java.util.Scanner;

/**
 * Ice cream cone driver class, "app".
 *
 * Project 04
 * Stephen Sallas COMP 1210-005
 * 9/20/19
 */
public class IceCreamConeApp
{
   /**
   * Main method in driver class.
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args)
   {
      // Scanner
      Scanner userInput = new Scanner(System.in);
      
      // Variables
      String labelIn = "";
      double radiusIn, heightIn;
      
      // Output Statement
      System.out.println("Enter label, radius, and "
            + "height for an ice cream cone.");
      
      // Inputting Label
      System.out.print("\tlabel: ");
      labelIn = userInput.nextLine();
      
      // Inputting Radius
      System.out.print("\tradius: ");
      radiusIn = Double.parseDouble(userInput.nextLine());
      
      // Exception Handling for Radius
      if (radiusIn <= 0)
      {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }
      
      // Inputting Height
      System.out.print("\theight: ");
      heightIn = Double.parseDouble(userInput.nextLine());
      
      // Exception Handling for Height
      if (heightIn <= 0)
      {
         System.out.println("Error: height must be greater than 0.");
         return;
      }
      
      // Creating New Ice Cream Cone
      IceCreamCone icc = new IceCreamCone(labelIn, radiusIn, heightIn);
      
      // Final Output
      System.out.println("\n" + icc);
      

         
      
      
      
   }
   
   
   
   
}
      


