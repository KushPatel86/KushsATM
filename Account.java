//name: Kush Patel
//Date: 11/29/22
//Assingment: Project 10
//A bank account class
public class Account 
{
   private int balance;

   //Constructor for an account that takes an initial balance
   public Account(int bal) 
   {
      this.balance = bal;
   }

   
   public void deposit(int amt) 
   {
      balance += amt;
   }
   
   public void withdraw(int amt) throws OverdrawnException
   {
      if(balance<amt)
      {
         throw new OverdrawnException("Insufficient balance to withdraw " + amt + ".");
      }
      else
      {
         balance-=amt;
      }
   }
   
   public int getBalance() 
   {
      return balance;
   }
}