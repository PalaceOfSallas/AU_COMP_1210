/**
 * Scores class.
 *
 * Activity 07
 * Stephen Sallas COMP 1210-005
 * 10/14/19
 */
public class Scores
{
   // Instance Variables
   private int[] numbers;
   
   /**
    * Constructor.
    * @param numbersIn = array of int values.
    */
   public Scores(int[] numbersIn)
   {
      numbers = numbersIn;
   }
   
   /**
    * Finding evens.
    * @return evens = even numbers in array list.
    */
   public int[] findEvens()
   {
      // Initializing Variable
      int numberEvens = 0;
      
      // Creating an Array of the Right Size
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      
      // Adding Even Numbers to the New Array
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            evens[count] = numbers[i];
            count++;
         }
      }
      
      // Returning Array
      return evens;
   }
   
   /**
    * Finding odds.
    * @return odds = odd numbers in array list.
    */
   public int[] findOdds()
   {
      // Initializing Variable
      int numberOdds = 0;
      
      // Creating an Array of the Right Size
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 != 0)
         {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      
      // Adding Odd Numbers to the New Array
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 != 0)
         {
            odds[count] = numbers[i];
            count++;
         }
      }
      
      // Returning Array
      return odds;

   }
   
   /**
    * Calculating average.
    * @return avg = average of numbers in array list.
    */
   public double calculateAverage()
   {
      // Variables
      int sum = 0;
      double numLength;
      double newSum;
      double avg;
      
      // Loop to Find Sum
      for (int i = 0; i < numbers.length; i++)
      {
         sum += numbers[i];
      }
      
      // Finding and Returning Average
      newSum = (double) sum;
      numLength = (double) numbers.length;
      avg = (sum / numLength);
      return avg;
   }
   
   /**
    * Final output string.
    * @return result = all numbers in array. 
    */
   public String toString()
   {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++)
      {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
   
   /**
    * Final output string reversed.
    * @return result = all numbers in array reversed. 
    */
   public String toStringInReverse()
   {
      String result = "";
      
      for (int i = numbers.length - 1; i > -1; i--)
      {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}
 
  

   
   
   
   

   


   