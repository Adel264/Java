package assignment1;


public class CommercialClient extends Client 
{
	

	private String CommercialID ;
        private Account account;
	
	public void setCommercialID(String commerciaid)
	{
		CommercialID = commerciaid;
	}
	
	public String getCommercialID()
	{
		return CommercialID;
	}
	

	public CommercialClient ( String name, String national_id , String address , int phone,double balance,int account_number , int commerciaid)
	{
		super( name, national_id , address , phone, Account account  );	
		NationalID="00000000000000";
		CommercialID = commerciaid;
	
	}

 public void setAccount(Account account) {
        Account = account;
    }
 public Account getAccount() {
        return Account;
    }

	
	 @Override
	 	public String toString()
	     {
	 		
	 	  retun account.tostring +"The CommercialID is: "+CommercialID;
	 		
	 		
	 		
	 				
	 	 }

}
