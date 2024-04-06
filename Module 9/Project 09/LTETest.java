import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * LTE Test.
 */
public class LTETest 
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * LTE Test.
    */
   @Test public void test() 
   {
      LTE n3 = new LTE("My iPad", 20.0, 30.00, 1200, 2.0);
      
      // Testing monthlyCost()
      Assert.assertEquals(38.00, n3.monthlyCost(), .01);
      n3.setDataLimit(4.0);
      Assert.assertEquals(30.00, n3.monthlyCost(), .01);
   }   
}
