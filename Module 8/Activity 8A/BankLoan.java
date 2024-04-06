/**
 * Bank Loan class.
 *
 * Activity 08A
 * Stephen Sallas COMP 1210-005
 * 10/21/19
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
   // static variables
   private static int loansCreated = 0;
   
   /**
    * Constructor.
    * @param customerNameIn 
    * @param interestRateIn 
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
    * Borrowing from bank.
    * @param amount 
    * @return wasLoanMade   
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
   /**
    * Paying bank.
    * @param amountPaid 
    * @return Math.abs(newBalance), 0     
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    * Getting Balance.
    * @return balance   
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Setting interest rate.
    * @param interestRateIn  
    * @return true, false   
    */   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Getting interest rate.
    * @return interestRate    
    */   
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * Charging interest.
    */   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * Final output string.
    * @return output     
    */      
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
    * Seeing if amount is valid.
    * @param amount  
    * @return true, false    
    */      
   public static boolean isAmountValid(double amount)
   {
      return (amount >= 0); 
   }
   
   /**
    * Seeing if they are in debt.
    * @param loan  
    * @return true, false     
    */      
   public static boolean isInDebt(BankLoan loan)
   {
      if (loan.getBalance() > 0)
      {
         return true;
      }
      return false;
   }

   /**
    * Seeing how many loans have been created.
    * @return loansCreated      
    */      
   public static int getLoansCreated()
   {
      return loansCreated;
   }
   
   /**
    * Resetting amount of loans created to zero.   
    */      
   public static void resetLoansCreated()
   { 
      loansCreated = 0;
   }
}
