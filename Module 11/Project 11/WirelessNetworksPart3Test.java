import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * Testing.
 */
public class WirelessNetworksPart3Test {


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
      Assert.assertEquals(Cellular.COST_FACTOR, 1.0, 0.01);
      
      WirelessNetworksPart3 app = new WirelessNetworksPart3();
      
      String[] args1 = {};
      WirelessNetworksPart3.main(args1);
      
      String[] args2 = {"wireless_network_data1.csv"};
      WirelessNetworksPart3.main(args2);
      
      String[] args3 = {"bad_file.csv"};
      WirelessNetworksPart3.main(args3);
      
      
      
      
   }
}

