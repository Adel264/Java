package assignment1;


public class SpecialAccount extends Account{

	public SpecialAccount(double balance,int account_number) {
	super( balance, account_number);	
	}
	
     @Override
	public  void withdraw(double take_out){
		if (Balance-take_out=>-1000) 
		{
			System.out.println("Thanks for using our Bank"); 
		
		System.out.println("Your Balance now is: "+this.getBalance()) ;
		}
        else 
	{System.out.println("Sorry you can't withdraw this money, your Balance can't be less than -1000 ");
	System.out.println("Your Balance is: "+this.getBalance()) ;
			}
	}
