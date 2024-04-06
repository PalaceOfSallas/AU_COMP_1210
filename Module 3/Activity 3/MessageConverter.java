import java.util.Scanner;

/**
 * Converting messages.
 *
 * Activity 03
 * Stephen Sallas COMP 1210-005
 * 9/9/19
 */
public class MessageConverter
{
   /**
    * Converts inputs in five different ways.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args)
   {
      // Scanner
      Scanner userInput = new Scanner(System.in);
      
      // Variables
      String message = "";
      int outputType;
      String result = "";
      
      // Inputting Initial Message
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      // Choosing Output Type
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
         
      outputType = Integer.parseInt(userInput.nextLine());
      
      // Outputs
      if (outputType == 0) 
      {
         // As Is
         result = message;
         System.out.println("\n" + result);
      }
      else if (outputType == 1)
      {
         // Trimmed
         result = message.trim();
         System.out.println("\n" + result);
      }
      else if (outputType == 2)
      {
         // Lower Case
         result = message.toLowerCase();
         System.out.println("\n" + result);
      }
      else if (outputType == 3)
      {
         // Upper Case
         result = message.toUpperCase();
         System.out.println("\n" + result);
      }
      else if (outputType == 4)
      {
         // Replace Vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
         System.out.println("\n" + result);
      }
      else if (outputType == 5)
      {
         // Without First and Last Character
         result = message.substring(1, message.length() - 1);
         System.out.println("\n" + result);
      }
      else
      {
         // Invalid Input
         result = "Error: Invalid choice input.";
         System.out.println("\n" + result);
      }
   
   
   
   
      
   
   
   
   
   
   
   
   
   
   }
}
 
