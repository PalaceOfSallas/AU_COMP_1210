import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Cellular Test.
 */
public class CellularTest 
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * Cellular Test.
    */
   @Test public void test() 
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      
      // Testing getTime() 
      Assert.assertEquals(1200.0, n2.getTime(), .01);
      
      // Testing setTime()
      n2.setTime(1200);
      
      // Testing getDataLimit()
      Assert.assertEquals(1.0, n2.getDataLimit(), .01);
      
      // Testing setDataLimit()
      n2.setDataLimit(1.0);
      
      // Testing dataUsage()
      Assert.assertEquals(0.75, n2.dataUsage(), .01);
      
      // Testing monthlyCost()
      Assert.assertEquals(20.00, n2.monthlyCost(), .01);
      n2.setDataLimit(0.7);
      Assert.assertEquals(20.05, n2.monthlyCost(), .01);
      
      // Testing toString()
      n2.setDataLimit(1.0);
      Assert.assertEquals("My Note (class Cellular) Cost: $20.00\n"
            + "Bandwidth: 5.0 Mbps\n"
            + "Time: 1200.0 seconds\n"
            + "Data Limit: 1.0 GB\n"
            + "Data Used: 0.75 GB", n2.toString()); 
    
         
      
      

      
      
      
      
         
   
      
      
      
         
   
      
      
      
      
         
   
      
      
         
   }
}
