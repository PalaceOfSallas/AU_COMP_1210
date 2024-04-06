/**
 * Number Operations Class.
 *
 * Project 05
 * Stephen Sallas COMP 1210-005
 * 9/30/19
 */
public class NumberOperations
{
   // Instance Variables
   private int number;
   
   /**
    * Constructor.
    * @param numberIn = number inputted.
    */
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   
   /**
    * Returns value of the number.
    * @return number = current value of the number.
    */
   public int getValue()
   {
      return number;
   }
   
   /**
    * Returns all positive odd numbers less than the number.
    * @return output = all positive odd numbers less than the number.
    */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
    * Returns all powers of two less than the number. 
    * @return output = all powers of two less than the number
    */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   
   /**
    * Comparisons with number.
    * @param compareNumber = number being compared with original number
    * @return 1, -1, 0 = depends
    */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber)
      {
         return 1;
      }
      else if (number < compareNumber)
      {
         return -1;
      }
      else
      {
         return 0;
      }
   }
   
   /**
    * Final output.
    * @return number
    */
   public String toString()
   {
      return number + "";
   }






   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
