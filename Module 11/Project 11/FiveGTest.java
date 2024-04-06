import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * FiveG Test.
 */
public class FiveGTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * FiveG Test.
    */
   @Test public void test() 
   {
      FiveG n4 = new FiveG("My Phone", 80.0, 50.00, 1200, 10.0);
      
      // Testing monthlyCost()
      Assert.assertEquals(80.00, n4.monthlyCost(), .01);
      n4.setDataLimit(13.0);
      Assert.assertEquals(50.00, n4.monthlyCost(), .01);
   }
}
