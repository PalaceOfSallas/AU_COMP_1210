/**
 * Project 9 Driver.
 *
 * Project 05
 * Stephen Sallas COMP 1210-005
 * 9/20/19
 */
public class WirelessNetworksPart1
{
   /**
   * Main method in driver class.
   * @param args Command line arguments - not used.
   * @throws FileNotFoundException 
   */
   public static void main(String[] args)
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      LTE n3 = new LTE("My iPad", 20.0, 30.00, 1200, 2.0);
      FiveG n4 = new FiveG("My Phone", 80.0, 50.00, 1200, 10.0);
      
      System.out.print(n1 + "\n\n" + n2 + "\n\n" + n3 + "\n\n" + n4);
   }
}
