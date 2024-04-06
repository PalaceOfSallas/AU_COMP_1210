import java.util.Scanner;
import java.util.ArrayList;

/**
 * Temperatures Driver Class.
 *
 * Activity 06
 * Stephen Sallas COMP 1210-005
 * 10/7/19
 */
public class TemperatureInfo
{
   /**
    * Main method in driver class.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args)
   {
      // Scanner
      Scanner userInput = new Scanner(System.in);
      
      // Array List
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      // Entering Temperatures
      String tempInput = "";
      do
      {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals(""))
         {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      // Creating Array
      Temperatures temps = new Temperatures(tempsList);
      
      // Menu
      char choice = 'E';
      do
      {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, " 
               + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice)
         {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }               
}
             

               
               


      
      

