package assignment1;


public class Client extends Account 
{
     private String Name;
     private String NationalID;
     private String Address;
     private int Phone;
     Account account;
     public void setName(String name)
     {
    	 Name = name;
     }
     
     public void setNationalID(String national_id)
     {
    	 NationalID = national_id;
     }
     
     public void setAddress(String address)
     {
    	 Address = address;
     }
      
     public void setPhone(int phone)
     {
    	 Phone = phone;
     }
     ///////////////////////////////////////////////////
     
     public String getName()
     {
    	 return Name;
     }
     
     public String getNationalID()
     {
    	 return NationalID;
     }
     
     public String getAddress()
     {
    	 return Address;
     }
     
     public int getPhone()
     {
    	 return Phone;
     }
     
public Client(String name, String national_id , String address , int phone)
     {
    	
    	 Name = name;
    	 NationalID = national_id;
    	 Address = address;
    	 Phone = phone;
    	 
     }
     public Client(String name, String national_id , String address , int phone,Account account)
     {
    	 Account = account
    	 Name = name;
    	 NationalID = national_id;
    	 Address = address;
    	 Phone = phone;
    	 
     }     
   

    public void setAccount(Account account) {
        Account = account;
    }
    public Account getAccount() {
        return Account;
    }
    
	public print()
     {
    	 System.out.println(" The Name is : "+ Name +"/n The National_id is: " + NationalID+ "/n The Address is :"+ Address + "/n Phone is: " + Phone); 
       
     }
     @Override
 	public static string toString()
     {

         return "The Name is : "+ Name +"/n The National_id is: " + NationalID+ "/n The Address is :"+ Address + "/n Phone is: " + Phone +\n"Account is: "+ account.toString;
    	
 		
 				
 	 }
    
     
     
     
}
