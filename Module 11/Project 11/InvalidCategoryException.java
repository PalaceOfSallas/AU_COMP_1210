/**
 *  InvalidCategoryException for WirelessNetworkList.
 */
public class InvalidCategoryException extends Exception 
{
   /**
    *  @param categoryIn   
    */
   public InvalidCategoryException(String categoryIn) 
   {
      super("For category: " + categoryIn);
   }
}
