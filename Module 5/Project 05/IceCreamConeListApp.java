import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ice cream cone list driver class, "app".
 *
 * Project 05
 * Stephen Sallas COMP 1210-005
 * 9/20/19
 */
public class IceCreamConeListApp
{
   /**
   * Main method in driver class.
   * @param args Command line arguments - not used.
   * @throws FileNotFoundException 
   */
   public static void main(String[] args) throws FileNotFoundException
   {
      // User Input Scanner
      Scanner userInput = new Scanner(System.in);
      
      // Variables
      String fileName = "";
      String firstLine = "";
      String labelIn = "";
      double radiusIn, heightIn;
      ArrayList<IceCreamCone> listIn = new ArrayList<IceCreamCone>();
      
      // Inputting File Name
      System.out.print("Enter file name: ");
      fileName = userInput.nextLine();
      
      // File Scanner
      Scanner scanFile = new Scanner(new File(fileName));
      
      // Scanning First Line for Name
      firstLine = scanFile.nextLine();
      

      // Creating Ice Cream Cones
      while (scanFile.hasNext())
      {
         labelIn = scanFile.nextLine();
         radiusIn = Double.parseDouble(scanFile.nextLine());
         heightIn = Double.parseDouble(scanFile.nextLine());
         listIn.add(new IceCreamCone(labelIn, radiusIn, heightIn));  
      }
      scanFile.close();
      
      // Final Output
      IceCreamConeList iccl = new IceCreamConeList(firstLine, listIn);
      System.out.println("\n" + iccl + "\n" + iccl.summaryInfo());    
         
         
         
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}
