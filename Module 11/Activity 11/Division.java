/**
 * Division class.
 *
 * Activity 11
 * Stephen Sallas COMP 1210-005
 * 11/18/19
 */
public class Division
{

   /**
    * Constructor.  
    */
   public Division()
   {
   }
   
   /**
    * Integer division.
    * @param numerator      
    * @param denominator  
    * @return answer    
    */
   public static int intDivide(int numerator, int denominator)
   {
      try
      {
         return numerator / denominator;
      }
      catch (ArithmeticException e)
      {
         return 0;
      }
   }
   
   /**
    * Decimal division.
    * @param numerator    
    * @param denominator  
    * @return answer    
    */
   public static double decimalDivide(double numerator, double denominator)
   {
      if (denominator == 0)
      {
         throw new IllegalArgumentException("The deominator "
               + "cannot be zero.");
      }
      double answer = numerator / denominator;
      return answer;
   }
}
   
   
