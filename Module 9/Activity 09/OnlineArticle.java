/**
 * Online Article class.
 *
 * Activity 09
 * Stephen Sallas COMP 1210-005
 * 11/4/19
 */
public class OnlineArticle extends OnlineTextItem
{
   // Instance Variable
   private int wordCount;
   
   /**
    * Constructor.
    * @param nameIn   
    * @param priceIn   
    */
   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
    * Setting word count.
    * @param wordCountIn     
    */
   public void setWordCount(int wordCountIn)
   {
      wordCount = wordCountIn;
   }
}

