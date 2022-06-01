package assignment1;

import java.util.*;

public class Account {
	static Scanner input= new Scanner(System.in);
	private double Balance;
	private int Account_Number;

      
    public Account(double balance,int account_number)
    {
    	Balance =balance;
    	Account_Number= account_number;
    }
    
	public void setBalance(double balance) 
    {
    	Balance= balance;
    }
    
    public void setAccount_Number(int account_number)
    {
    	Account_Number=account_number;
    }
    
    public int getAccount_Number()
    {
    	return Account_Number;
    }
    public double getBalance() 
    {
    	return Balance;
    }
    
    public void withdraw(double take_out ) 
    {
    	   take_out=input.nextDouble();
           if (Balance>= take_out){
           Balance = Balance - take_out;
           System.out.prinln("Your Balance now is: "+this.getBalance);}
           else{
           System.out.prinln("You can;t withdraw more thab: "+this.getBalance);}
    	    
          
    }
    
    public void deposit(double put_in ) 
    {
    	   put_in=input.nextDouble();
           System.out.prinln("Your Balance now is: ");
    	  
    }
    public string toString(int account_number, double balance ) {
    	return "Account Number: " +account_number+ "\nBAlance: " +Balance ;
    	
    }
    
}

