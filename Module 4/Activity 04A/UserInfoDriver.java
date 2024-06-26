/**
 * Writing Classes - driver class.
 *
 * Activity 04A
 * Stephen Sallas COMP 1210-005
 * 9/16/19
 */
public class UserInfoDriver
{
  /**
   * Main method in driver class.
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args)
   {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}

      
      
