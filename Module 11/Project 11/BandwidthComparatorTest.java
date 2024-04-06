import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.util.Arrays;


/**
 * Testing.
 */
public class BandwidthComparatorTest {


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
      WirelessNetworkList wnl = new WirelessNetworkList();
      
      wnl.readFile("wireless_network_data1.csv");
      
      WiFi wf = new WiFi("EqualBandwidth", 450, 40.00, 5.00);
      wnl.addWirelessNetwork(wf);
      
      Arrays.sort(wnl.getWirelessNetworksArray(), new BandwidthComparator());
     
      Assert.assertEquals(Cellular.COST_FACTOR, 1.0, 0.01);
   }
}
