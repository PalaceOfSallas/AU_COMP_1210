import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Wireless Network class.
 * Project 10
 * Stephen Sallas COMP 1210-005
 * 11/21/19
 */
public class WirelessNetworkList
{
   // Fields
   private WirelessNetwork[] wirelessNetworks;
   private String[] invalidRecords;
   
   /**
    * Constructor. 
    */
   public WirelessNetworkList()
   {
      wirelessNetworks = new WirelessNetwork[0];
      invalidRecords = new String[0];
   }
   
   /**
    * Getting wireless networks array.
    * @return wirelessNetworks  
    */
   public WirelessNetwork[] getWirelessNetworksArray()
   {
      return wirelessNetworks;
   }
   
   /**
    * Getting invalid records array.
    * @return invalidRecords   
    */
   public String[] getInvalidRecordsArray()
   {
      return invalidRecords;
   }
   
   /**
    * Adding wireless network.
    * @param newObject    
    */
   public void addWirelessNetwork(WirelessNetwork newObject)
   {
      wirelessNetworks = Arrays.copyOf(wirelessNetworks, 
            wirelessNetworks.length + 1);
      wirelessNetworks[wirelessNetworks.length - 1] = newObject;
   }
   
   /**
    * Adding invalid record.
    * @param newObject    
    */
   public void addInvalidRecord(String newObject)
   {
      invalidRecords = Arrays.copyOf(invalidRecords, 
            invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = newObject;
   }
   
   /**
    * Reading file.
    * @param fileName 
    * @throws FileNotFoundException     
    */
   public void readFile(String fileName)
         throws FileNotFoundException
   {
          
      // File Scanner
      Scanner scanFile = new Scanner(new File(fileName));
      
      // Scanning Lines
      while (scanFile.hasNext())
      {
         Scanner scanLine = new Scanner(scanFile.nextLine()).useDelimiter(",");
         String selection = scanLine.next().toUpperCase();
         char selectionChar = selection.charAt(0);
         
         switch(selectionChar)
         {
            case 'W':
               WiFi w = new WiFi(scanLine.next(), 
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()));
               addWirelessNetwork(w);
               break;
               
            case 'C':
               Cellular c = new Cellular(scanLine.next(), 
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()),
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()));
               addWirelessNetwork(c);
               break;
               
            case 'L':
               LTE l = new LTE(scanLine.next(), 
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()),
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()));
               addWirelessNetwork(l);
               break;
               
            case 'F':
               FiveG f = new FiveG(scanLine.next(), 
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()),
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()));
               addWirelessNetwork(f);
               break;
               
            default:
               break;
    
         }
      }
   }
   
   /**
    * Generating report.
    * @return output      
    */
   public String generateReport()
   {
      // Header
      String output = "-------------------------------\n"
            + "Monthly Wireless Network Report\n"
            + "-------------------------------\n";
      
      // Adding Elements to Output
      for (WirelessNetwork wn : wirelessNetworks)
      {
         output += wn + "\n\n";
      }  
      
      // Returning Output               
      return output;
   }
   
   /**
    * Generating report by name.
    * @return output      
    */
   public String generateReportByName()
   {
      // Sorting By Name
      Arrays.sort(getWirelessNetworksArray());
      
      // Header
      String output = "-----------------------------------------\n"
            + "Monthly Wireless Network Report (by Name)\n"
            + "-----------------------------------------\n";
      
      // Adding Elements to Output
      for (WirelessNetwork wn : wirelessNetworks)
      {
         output += wn + "\n\n";
      }  
      
      // Returning Output               
      return output;
   }
   
   /**
    * Generating report by bandwidth.
    * @return output      
    */
   public String generateReportByBandwidth()
   {
      // Sorting by Bandwidth
      Arrays.sort(getWirelessNetworksArray(), new BandwidthComparator());

      // Header
      String output = "----------------------------------------------\n"
            + "Monthly Wireless Network Report (by Bandwidth)\n"
            + "----------------------------------------------\n";
      
      // Adding Elements to Output
      for (WirelessNetwork wn : wirelessNetworks)
      {
         output += wn + "\n\n";
      }  
      
      // Returning Output               
      return output;
   }
   
   /**
    * Generating report by Monthly Cost.
    * @return output      
    */
   public String generateReportByMonthlyCost()
   {
      // Sorting by Bandwidth
      Arrays.sort(getWirelessNetworksArray(), new MonthlyCostComparator());

      // Header
      String output = "-------------------------------------------------\n"
            + "Monthly Wireless Network Report (by Monthly Cost)\n"
            + "-------------------------------------------------\n";
      
      // Adding Elements to Output
      for (WirelessNetwork wn : wirelessNetworks)
      {
         output += wn + "\n\n";
      }  
      
      // Returning Output               
      return output;
   }



      



   

   
   

   
   
    
















}