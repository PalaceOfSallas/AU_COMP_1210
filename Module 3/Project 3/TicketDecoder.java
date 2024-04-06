import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * Decoding Football Ticket Codes.
 *
 * Project 03
 * Stephen Sallas COMP 1210-005
 * 9/13/19
 */
public class TicketDecoder
{
   /**
    * Inputting a football ticket code and outputting a description.
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args)
   {
      // Scanner
      Scanner userInput = new Scanner(System.in);
      
      // Decimal Formats
      DecimalFormat money = new DecimalFormat("$#,##0.00");
      DecimalFormat percent = new DecimalFormat("0%");
      
      // Variables
      String ticketCode = " ";
      String game = " ";
      String month = " ";
      String day = " ";
      String year = " ";
      String hour = " ";
      String minute = " ";
      String section = " ";
      String row = " ";
      String seat = " ";
      double price;
      double discount;
      double cost;
      int prizeNumber;
      
      // Inputting Ticket Code
      System.out.print("Enter your ticket code: ");
      ticketCode = userInput.nextLine();
      ticketCode = ticketCode.trim();
      System.out.println("");
      
      // Exception Handling
      if (ticketCode.length() < 26)
      {
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at least 26 characters.");
      }
      else
      {
         // Inputting Information from Ticket Code
         price = Double.parseDouble(ticketCode.substring(0, 3) + "." 
               + ticketCode.substring(3, 5));
         discount = Double.parseDouble("." + ticketCode.substring(5, 7));
         hour = ticketCode.substring(7, 9);
         minute = ticketCode.substring(9, 11);
         month = ticketCode.substring(11, 13);
         day = ticketCode.substring(13, 15);
         year = ticketCode.substring(15, 19);
         section = ticketCode.substring(19, 21);
         row = ticketCode.substring(21, 23);
         seat = ticketCode.substring(23, 25);
         game = ticketCode.substring(25);
      
         // Finding Cost
         cost = price - (price * discount);
      
         // Formatting Price, Discount, and Cost
         String priceStr = money.format(price);
         String discountStr = percent.format(discount);
         String costStr = money.format(cost);
         
         // Generating Random Prize Number
         Random generator = new Random();
         prizeNumber = generator.nextInt(10000000);
        
         // Outputting Information
         System.out.println("Game: " + game + "   Date: " + month + "/" + day 
               + "/" + year + "   Time: " + hour + ":" + minute);
         System.out.println("Section: " + section + "   Row: " + row
               + "   Seat: " + seat);
         System.out.println("Price: " + priceStr + "   Discount: " + discountStr
               + "   Cost: " + costStr);
         System.out.println("Prize Number: " + prizeNumber);
      } 
   }
}