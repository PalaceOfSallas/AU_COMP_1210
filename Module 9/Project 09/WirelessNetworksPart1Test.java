import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * WirelessNetworksPart1 Test.
 */
public class WirelessNetworksPart1Test 
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * WirelessNetworksPart1 Test.
    */
   @Test public void test() 
   {
      WirelessNetwork.resetCount();
      WirelessNetworksPart1.main(null);
      Assert.assertEquals("WirelessNetwork count should be 4. ",
            4, WirelessNetwork.getCount());     
   }
}
