import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/** 
 * Testing.
 */
public class IceCreamConeList2Test
{
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** 
    * Testing first group of methods.
    */
   @Test public void methodsGroup1()
   {
      IceCreamCone ex1 = new IceCreamCone("ex1", 1, 2);
      IceCreamCone ex2 = new IceCreamCone("ex2", 3, 4);
      IceCreamCone ex3 = new IceCreamCone("ex3", 5, 6);
      IceCreamCone[] iccl = {ex1, ex2, ex3};
      IceCreamCone[] icclEmpty = new IceCreamCone[0];
      IceCreamConeList2 iccl2 = new IceCreamConeList2("Test", iccl, 3);
      IceCreamConeList2 iccl2Empty = new IceCreamConeList2("Test", icclEmpty,
            0);
      IceCreamCone[] toStringArray = {ex1};
      IceCreamConeList2 toStringList = new IceCreamConeList2("toString", 
            toStringArray, 1);
      
      // getName() Test
      Assert.assertEquals("Test", iccl2.getName());
      
      // numberOfIceCreamCones() Test
      Assert.assertEquals(3, iccl2.numberOfIceCreamCones(), .01);
      
      // totalSurfaceArea() Test
      Assert.assertEquals(396.74, iccl2.totalSurfaceArea(), .01);
      
      // totalVolume() Test
      Assert.assertEquals(517.32, iccl2.totalVolume(), .01);
      
      // averageSurfaceArea() Test
      Assert.assertEquals(0, iccl2Empty.averageSurfaceArea(), .01);
      Assert.assertEquals(132.25, iccl2.averageSurfaceArea(), .01);
      
      // averageVolume() Test
      Assert.assertEquals(0, iccl2Empty.averageVolume(), .01);
      Assert.assertEquals(172.44, iccl2.averageVolume(), .01);
      
      // toString() Test
      Assert.assertEquals("toString" + "\n\n"
            + "IceCreamCone \"ex1\" with radius = 1.0 and height = 2.0"
            + " units has:" + "\n"
            + "\tsurface area = 13.308 square units" + "\n"
            + "\tvolume = 4.1887902 cubic units" 
            + "\n\n", toStringList.toString());
      
      // summaryInfo() Test
      Assert.assertEquals("----- Summary for Test -----" + "\n"
            + "Number of IceCreamCone Objects: 0" + "\n"
            + "Total Surface Area: 0.0" + "\n"
            + "Total Volume: 0.0" + "\n"
            + "Average Surface Area: 0.0" + "\n"
            + "Average Volume: 0.0", iccl2Empty.summaryInfo());   
   }
   
   /** 
    * Testing second group of methods.
    * @throws FileNotFoundException  
    */
   @Test public void methodsGroup2()
         throws FileNotFoundException
   {
      IceCreamCone ex1 = new IceCreamCone("ex1", 1, 2);
      IceCreamCone ex2 = new IceCreamCone("ex2", 3, 4);
      IceCreamCone ex3 = new IceCreamCone("ex3", 5, 6);
      IceCreamCone[] iccl = {ex1, ex2, ex3};
      IceCreamConeList2 iccl2 = new IceCreamConeList2("Test", iccl, 3);
      
      IceCreamCone[] forReadFileMethod = new IceCreamCone[100];
      IceCreamConeList2 frfm = new IceCreamConeList2("For readFile()", 
            forReadFileMethod, 0);
      
      IceCreamCone[] icclEmpty = new IceCreamCone[100];
      IceCreamConeList2 iccl2Empty = new IceCreamConeList2("Empty Test", 
            icclEmpty, 0);
      
      // getList() Test
      Assert.assertEquals(iccl, iccl2.getList());
      
      // readFile() Test
      frfm = frfm.readFile("IceCreamCone_data_1.txt");
      
      // addIceCreamCone() Test
      iccl2Empty.addIceCreamCone("ex4", 7, 8);
      
      // findIceCreamCone() Test
      Assert.assertEquals(ex1, iccl2.findIceCreamCone("ex1"));
      Assert.assertEquals(null, iccl2.findIceCreamCone("xxx")); 
      
      // deleteIceCreamCone() Test
      IceCreamCone ex4 = new IceCreamCone("ex4", 7, 8);
      iccl2Empty.addIceCreamCone("ex5", 9, 10);
      Assert.assertEquals(ex4, iccl2Empty.deleteIceCreamCone("Ex4"));
      Assert.assertEquals(null, iccl2.deleteIceCreamCone("xxx"));
      
      // editIceCreamCone() Test
      Assert.assertTrue(iccl2.editIceCreamCone("ex1", 2, 3));
      Assert.assertFalse(iccl2.editIceCreamCone("ex5", 2, 3));  
   }
   
   /** 
    * Testing third group of methods.
    * @throws FileNotFoundException  
    */
   @Test public void methodsGroup3()
   {
      IceCreamCone ex1 = new IceCreamCone("ex1", 1, 2);
      IceCreamCone ex2 = new IceCreamCone("ex2", 3, 4);
      IceCreamCone ex3 = new IceCreamCone("ex3", 5, 6);
      IceCreamCone[] iccl = {ex1, ex2, ex3};
      IceCreamCone[] icclEmpty = new IceCreamCone[0];
      IceCreamConeList2 iccl2 = new IceCreamConeList2("Test", iccl, 3);
      IceCreamConeList2 iccl2Empty = new IceCreamConeList2("Test", icclEmpty,
            0);
      // findIceCreamConeWithLongestRadius() Test
      Assert.assertEquals(ex3, iccl2.findIceCreamConeWithLongestRadius());
      Assert.assertEquals(null, iccl2Empty.findIceCreamConeWithLongestRadius());
      
      // findIceCreamConeWithShortestRadius() Test
      Assert.assertEquals(ex1, 
            iccl2.findIceCreamConeWithShortestRadius());
      Assert.assertEquals(null, 
            iccl2Empty.findIceCreamConeWithShortestRadius());
      
      // findIceCreamConeWithLargestVolume() Test
      Assert.assertEquals(ex3, iccl2.findIceCreamConeWithLargestVolume());
      Assert.assertEquals(null, iccl2Empty.findIceCreamConeWithLargestVolume());
      
      // findIceCreamConeWithSmallestVolume() Test
      Assert.assertEquals(ex1, iccl2.findIceCreamConeWithSmallestVolume());
      Assert.assertEquals(null, 
            iccl2Empty.findIceCreamConeWithSmallestVolume());
      
       
      
      
      
      
   }
      




      

      
      
      
   


   
   
   
   
}
