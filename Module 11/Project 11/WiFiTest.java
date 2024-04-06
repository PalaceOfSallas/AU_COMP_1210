import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * WiFi Test.
 */
public class WiFiTest 
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * WirelessNetwork test.
    */
   @Test public void test()
   {
      // Creating WiFi object
      WiFi x = new WiFi("wf", 1, 2.00, 3.00);
      
      // Testing getName()
      Assert.assertEquals("wf", x.getName());
      
      // Testing setName()
      x.setName("wf");
      
      // Testing getBandwidth()
      Assert.assertEquals(1.0, x.getBandwidth(), 0.01);
      
      // Testing setBandwidth()
      x.setBandwidth(1.0);
      
      // Testing getMonthlyFixedCost()
      Assert.assertEquals(2.0, x.getMonthlyFixedCost(), 0.01);
      
      // Testing setMonthlyFixedCost()
      x.setMonthlyFixedCost(2.0);
      
      // Testing resetCount() & getCount()
      x.resetCount();
      Assert.assertEquals(0, x.getCount(), 0.01); 
   }
   
   /**
    * WiFi test.
    */
   @Test public void test2()
   {
      // Creating WiFi object
      WiFi x = new WiFi("wf", 1, 2.00, 3.00);

      // Testing getModemCost()
      Assert.assertEquals(3.00, x.getModemCost(), .01);
      
      // Testing setModemCost()
      x.setModemCost(4.00);
      
      // Testing monthlyCost()
      Assert.assertEquals(6.00, x.monthlyCost(), .01);
      
      // Testing toString()
      Assert.assertEquals("wf (class WiFi) Cost: $6.00\n" 
            + "Bandwidth: 1.0 Mbps", x.toString());   
   }
}
