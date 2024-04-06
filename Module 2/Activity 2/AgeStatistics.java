import java.util.Scanner;

/** 
 * Printing out basic information.
 *
 * Activity 2
 * Stephen Sallas COMP 1210-005
 * 9/4/19
 */
public class AgeStatistics 
{
   /** 
    * Printing name, age, gender, and other calculations.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args)
   {
      // Scanner
      Scanner userInput = new Scanner(System.in);
      
      // Variables
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      // Getting Inputs
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
   
      // Converting Age
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes.");
      
      System.out.println("\tYour age in centuries is "
            + (double) ageInYears / 100 + " centuries.");
            
      // Displaying Max Heart Rate
      System.out.print("Your max heart rate is ");
      if (gender == 1)
      {
         maxHeartRate = (209 - (0.7 * ageInYears));
         System.out.println(maxHeartRate + " beats per minute.");
      }
      else
      {
         maxHeartRate = (214 - (0.8 * ageInYears));
         System.out.println(maxHeartRate + " beats per minute.");
      } 
   }
}