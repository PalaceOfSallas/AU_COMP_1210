/**
 * Online Book class.
 *
 * Activity 09
 * Stephen Sallas COMP 1210-005
 * 11/4/19
 */
public class OnlineBook extends OnlineTextItem
{
   // Instance Variable
   protected String author;
   
   /**
    * Constructor.
    * @param nameIn   
    * @param priceIn   
    */
   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
    * To string.
    * @return name + " - " + author + ": $" + price    
    */
   public String toString()
   {
      return name + " - " + author + ": $" + price;
   }
   
   /**
    * Setting author.
    * @param authorIn     
    */
   public void setAuthor(String authorIn)
   {
      author = authorIn;
   }
}


