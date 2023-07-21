//name: Kush Patel
//Date: 11/29/22
//Assingment: Project 10
public class ATM 
{
   public static void main(String args[]) 
   {
      //Create a new account with 100 dollars
      Account myAccount = new Account(100);
      //Add 200 dollars to the account and print the new balance
      myAccount.deposit(200);
      System.out.println("Balance: " + myAccount.getBalance());
      
      //YOUR CHANGES HERE
      try
      {
         myAccount.withdraw(1500);
      }
      catch(OverdrawnException e)
      {
         System.out.println(e.getMessage());
      }
      System.out.println("Balance: " + myAccount.getBalance());

   }

}