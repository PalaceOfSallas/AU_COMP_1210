//import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Scanner;

/**
 * Wireless Networks Part 2.
 *
 * Project 10
 * Stephen Sallas COMP 1210-005
 * 11/21/19
 */
public class WirelessNetworksPart2
{
   /**
   * Main method in driver class.
   * @param args Command line arguments - not used.
   * @throws FileNotFoundException 
   */
   public static void main(String[] args)
         throws FileNotFoundException
   {
      // Creating Wireless Network List
      WirelessNetworkList wnl = new WirelessNetworkList();
      
      // Checking for Command Line Arguments
      if (args.length == 0)
      {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else
      {
         // Reading File
         wnl.readFile(args[0]);
      
         // Printing
         //System.out.print(wnl.generateReport());
         //System.out.print(wnl.generateReportByName());
         //System.out.print(wnl.generateReportByBandwidth());
         //System.out.print(wnl.generateReportByMonthlyCost());
         System.out.print(wnl.generateInvalidRecordsReport());
      }
      
   }
}
      
     
      

