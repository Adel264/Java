package assignment1;

import java.util.ArrayList;

public class Bank 
{
   private String Name;
   private String Address;
   private int Phone;
   
public Bank(String name , String address , int phone)
   {
	   Name = name;
	   Address  = address;
	   Phone = phone;
         
   }
   
   public void setName(String name)
   {
	   Name=name;
   }
   
   public void setAddress(String address)
   {
	   Address = address;
   }
   
   public void  setPhone(int phone)
   {
	   Phone =phone;
   }
   
   public String getName()
   {
	   return Name;
   }
   
   public String getAddress()
   {
	   return Address;
   }
   
   public int getPhone()
   {
	   return Phone;
   }
   
   


public String getNationalID() 
{
	return null;
}

public Object getAccount_Number() 
{
	return null;
}

public Object getBalance() 
{
	return null;
}
    
 
   public void Display() {
        int counter = 1;
if (account_data.isEmpty()) {
            System.out.println("Your accounts list is empty");
    for (Account c : account_data) {

         return couter+"The Name is : "+ Name +"/n The National_id is: " + NationalID+ "/n The Address is :"+ Address + "/n Phone is: " + Phone +\n"Account is: "+ account.toString;
counter++;
        }
        }


   ArrayList client_data = new ArrayList();
   {
   client_data.add(getName());
   client_data.add(getNationalID());
   client_data.add(getAddress());
   client_data.add(getPhone());
   client_data.toString();
   }

   ArrayList account_data = new ArrayList ();
   {
   account_data.add(getBalance());
   account_data.add(getAccount_Number());
   account_data.toString();
   
   }
public String toString() {
        return "The Name is: " + name + "\nThe Address is: " + address +"\nthe Phone=" + phone +"\nThe Accounts_List=" + accounts_data + "\nThe Clients_List=" + clients_data;
    }
}
