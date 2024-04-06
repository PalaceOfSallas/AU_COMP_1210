/**
 * Writing Classes - main class.
 *
 * Activity 04A
 * Stephen Sallas COMP 1210-005
 * 9/16/19
 */
public class UserInfo
{
   // instance variables
   private String firstName = "";
   private String lastName = "";
   private String location = "";
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;

   // constructor
   
  /**
   * Constructor.
   * @param firstNameIn for user's first name.
   * @param lastNameIn for user's last name.
   */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
   
 /**
  * Method to output information as string.
  * @return all inputted information as an output string.
  */
   public String toString()
   {
      String output = "Name: " + firstName + " " + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
      
      return output;
   }
   
 /**
  * Method to input location.
  * @param locationIn is the inputted location.
  */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
 /**
  * Method to input age.
  * @param ageIn is the age inputted by the user.
  * @return isSet is a boolean value in response to if the age was accepted.
  */ 
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
 /**
  * Method to output age.
  * @return age inputted previously.
  */
   public int getAge()
   {
      return age;
   }
   
  /**
   * Method to output location.
   * @return location inputted previously.
   */
   public String getLocation()
   {
      return location;
   }
   
  /**
* Method to change status to offline.
*/
   public void logOff()
   {
      status = OFFLINE;
   }
   
  /**
* Method to change status to online.
*/
   public void logOn()
   {
      status = ONLINE;
   }
}