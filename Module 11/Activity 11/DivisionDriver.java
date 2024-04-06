import javax.swing.JOptionPane;

/**
 * Division Driver class.
 *
 * Activity 11
 * Stephen Sallas COMP 1210-005
 * 11/18/19
 */
public class DivisionDriver
{
   /**
    * Main method in driver class.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args)
   {
      // Dialog Box
      String numInput
         = JOptionPane.showInputDialog("Enter the numerator:");
      
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
      // Try and Catch
      try
      {  
         // Conversions
         int num  = Integer.parseInt(numInput);
         int denom  = Integer.parseInt(denomInput);  
      
         // Creating String 
         String result = "Integer division: \n"
               + Division.intDivide(num, denom)
               + "\n\nFloating point division: \n"
               + Division.decimalDivide(num, denom);
            
         // Result to Dialog Box
         JOptionPane.showMessageDialog(null, result,
               "Result", JOptionPane.PLAIN_MESSAGE); 
      }
      catch (NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null,
               "Invalid input: enter numerical integer values only.",
               "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e)
      {
         JOptionPane.showMessageDialog(null,
               e, "Error", JOptionPane.ERROR_MESSAGE);
      }
         
          
                         
   
      
   
   
   
   
   }
}

