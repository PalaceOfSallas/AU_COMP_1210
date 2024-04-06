import org.junit.Assert;
import org.junit.Before;
import org.junit.Test; 
import java.util.ArrayList;

/** 
 * Testing.
 */
public class IceCreamConeTest
{
   /** 
    * Fixture initialization (common initializationfor all tests). 
    */
   @Before public void setUp()
   {
   }


   /** 
    * Testing.
    */
   @Test public void test() 
   {
      // Creating Ice Cream Cone to Test
      IceCreamCone icc = new IceCreamCone("Test", 1, 2);
      
      // Testing getLabel()
      Assert.assertEquals("Test", icc.getLabel());
      
      // Testing setLabel()
      Assert.assertEquals(false, icc.setLabel(null));
      Assert.assertEquals(true, icc.setLabel("Test"));
      
      // Testing getRadius()
      Assert.assertEquals(1, icc.getRadius(), 0);
      
      // Testing setRadius()
      Assert.assertEquals(false, icc.setRadius(0));
      Assert.assertEquals(true, icc.setRadius(1));
      
      // Testing getHeight()
      Assert.assertEquals(2, icc.getHeight(), 0);
      
      // Testing setHeight()
      Assert.assertEquals(false, icc.setHeight(0));
      Assert.assertEquals(true, icc.setHeight(2));
      
      // Testing surfaceArea()
      Assert.assertEquals(13.308, icc.surfaceArea(), .01);
      
      // Testing surfaceArea()
      Assert.assertEquals(4.189, icc.volume(), .01);
      
      // Testing toString()
      Assert.assertEquals("IceCreamCone \"Test\" with radius = 1.0 and "
            + "height = 2.0 units has:\n\tsurface area = 13.308 square units\n"
            + "\tvolume = 4.1887902 cubic units", icc.toString());
      
      // Testing resetCount() & getCount()
      icc.resetCount();
      Assert.assertEquals(0, icc.getCount(), .01);
      
      // Testing equals()
      ArrayList<IceCreamCone> object = new ArrayList<IceCreamCone>();
      IceCreamCone icc2 = new IceCreamCone("Test", 1, 2);
      IceCreamCone icc3 = new IceCreamCone("Test1", 1, 2);
      IceCreamCone icc4 = new IceCreamCone("Test", 0, 2);
      IceCreamCone icc5 = new IceCreamCone("Test", 1, 0);
      
      Assert.assertEquals(false, icc.equals(object));
      Assert.assertEquals(true, icc.equals(icc2));
      Assert.assertEquals(false, icc.equals(icc3));
      Assert.assertEquals(false, icc.equals(icc4));
      Assert.assertEquals(false, icc.equals(icc5));
      
      // Testing hashCode()
      Assert.assertEquals(0, icc.hashCode(), .01);
      
      
      
      
      
      
      
      
      
      

      
      

      
      
      
      
      
       
   }
}