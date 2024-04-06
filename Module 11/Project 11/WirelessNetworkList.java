import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;

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
         //throws InvalidCategoryException
   {
          
      // File Scanner
      Scanner scanFile = new Scanner(new File(fileName));
      
      // String for Other Scanner
      String line = "";
      
      // Scanning Lines
      while (scanFile.hasNext())
      {
         try
         {
            line = scanFile.nextLine();
            Scanner scanLine = new Scanner(line).useDelimiter(",");
            String selection = scanLine.next().toUpperCase();
            char selectionChar = selection.charAt(0);
            
            // In Case Category is Invalid
            String invalidCategory = Character.toString(selectionChar);
            
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
                  throw new InvalidCategoryException(invalidCategory);
      
            }
         }
      
         // Exceptions to Catch
         catch (InvalidCategoryException error)
         {
            String ir = line + "\n" + error;
            addInvalidRecord(ir);
         }
         catch (NumberFormatException error)
         {
            String ir2 = line + "\n" + error;
            addInvalidRecord(ir2);   
         }
         catch (NoSuchElementException error)
         {
            String ir3 = line + "\n" + error
                  + ": For missing input data";
            addInvalidRecord(ir3);   
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
   
   /**
    * Generating invalid records report.
    * @return output      
    */
   public String generateInvalidRecordsReport()
   {
      // Header
      String output = "----------------------\n"
            + "Invalid Records Report\n"
            + "----------------------\n";
      
      // Adding Elements to Output
      for (String ir : invalidRecords)
      {
         output += ir + "\n\n";
      }  
      
      // Returning Output               
      return output;
   }




      



   

   
   

   
   
    
















}