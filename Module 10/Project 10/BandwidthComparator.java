import java.util.Comparator;

/**
 * Bandwidth Comparator.
 *
 * Project 10
 * Stephen Sallas COMP 1210-005
 * 11/21/19
 */   
public class BandwidthComparator 
      implements Comparator<WirelessNetwork> 
{
   /**
    * Reading file.
    * @param n1 
    * @param n2 
    * @return -1, 1, 0      
    */
   public int compare(WirelessNetwork n1, WirelessNetwork n2) 
   {
      if (n1.getBandwidth() < n2.getBandwidth()) 
      {
         return -1;
      }
      else if (n1.getBandwidth() > n2.getBandwidth()) 
      {
         return 1;
      }
      else 
      {
         return 0;
      }
   }
}
   
