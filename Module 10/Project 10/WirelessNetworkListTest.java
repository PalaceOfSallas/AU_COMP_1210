import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;


/**
 * Test.
 */
public class WirelessNetworkListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
    * Testing. 
    * @throws FileNotFoundException 
    */
   @Test public void defaultTest()
         throws FileNotFoundException 
   {
      // Creating Arrays
      WirelessNetwork[] wirelessNetworks = new WirelessNetwork[0];
      String[] invalidRecords = new String[0];
      String s = "Test";
      
      WiFi w = new WiFi("My WiFi", 450, 40.00, 5.00);
      Cellular c = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      LTE l = new LTE("My iPad", 20.0, 30.00, 1200, 2.0);
      FiveG f = new FiveG("My Phone", 80.0, 50.00, 1200, 10.0);
      
      // Testing Constructor
      WirelessNetworkList wnl = new WirelessNetworkList();
      WirelessNetworkList wnl2 = new WirelessNetworkList();
      WirelessNetworkList wnl3 = new WirelessNetworkList();
      
      // Testing getWirelessNetworksArray()
      Assert.assertArrayEquals(wirelessNetworks, 
            wnl.getWirelessNetworksArray());
      
      // Testing getInvalidRecordsArray()
      Assert.assertArrayEquals(invalidRecords, wnl.getInvalidRecordsArray());
      
      // Testing addWirelessNetwork()
      wnl.addWirelessNetwork(w);
      
      // Testing addInvalidRecord()
      wnl.addInvalidRecord(s);
      
      // Testing readFile()
      wnl2.readFile("wireless_network_data1.csv");
      wnl3.readFile("wireless_network_data2.exceptions.csv");
      
      
      // Testing generateReport()
      Assert.assertTrue(wnl2.generateReport().contains("---------------------"
            + "----------\n"
            + "Monthly Wireless Network Report\n"
            + "-------------------------------\n"
            + "My Wifi (class WiFi) Cost: $45.00"));
            
      // Testing generateReportByName()
      Assert.assertTrue(wnl2.generateReportByName().contains("Monthly "
            + "Wireless Network Report (by Name)\n"
            + "-----------------------------------------\n"
            + "My iPad (class LTE) Cost: $38.00"));
            
      // Testing generateReportByBandwidth()
      Assert.assertTrue(wnl2.generateReportByBandwidth().contains("Monthly " 
            + "Wireless Network Report (by Bandwidth)\n"
            + "----------------------------------------------\n"
            + "My Note (class Cellular) Cost: $20.00"));
            
      // Testing generateReportByMonthlyCost()
      Assert.assertTrue(wnl2.generateReportByMonthlyCost().contains("Monthly "
            + "Wireless Network Report (by Monthly Cost)\n"
            + "-------------------------------------------------\n"
            + "My Phone (class FiveG) Cost: $80.00"));

            

            
     
      
      
      
   }
}
