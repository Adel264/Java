package assignment1;

import java.util.Scanner;
import java.util.ArrayList;
public static Bank bank;


public class test {

	public static void main(String[] args) {
		System.out.println("Welcome to our Bank");
		
	public static void Main_menu()
			{System.out.println("1\Account \n2\Client \n3\Exit");
		    static Scanner input= new Scanner(System.in);
                     System.out.println("Enter your choise");
            int Choise_1=input.nextInt();
            switch(Choise_1):
        	  case 1:
        		Account_menu();
        		Main_menu();
        	        break;
        	  case 2:
        	  
        	 
        	  case 3:
        		  break;
        	  }

        		  
              
                    private static void Account_menu() {
        			System.out.println("1\Normal Account \n2\Special Account \n3\Main menu");
                               System.out.println("Enter your choise");
        		    int Choise_2=input.nextInt();    	        
         	        	  
                                  switch(Choise_2): {
                                  case 1:
                                    double balance;
                                    int account_Number;
                                    System.out.println("Please enter the Account number and the Balance ");
                                    System.out.print("The Account number= ");
                                    account_Number = scanner.nextInt();
                                    System.out.print("The Balance= ");
                                    Balance = scanner.nextDouble();
                                    Account account = new Account(balance, account_Number);
                                    account_data.add(account);
                                    Account_menu()
                                    break;


                                  case 2:
                                    System.out.println("Please enter the Account number and the Balance ");
                                    System.out.print("The Account number= ");
                                    account_Number = scanner.nextInt();
                                    System.out.print("The Balance= ");
                                    Balance = scanner.nextDouble();
                                    SpecialAccount account = new SpecialAccount(balance, account_Number);
                                    account_data.add(specialaccount);
                                    Account_menu()
                                    break;
        	           case 3:
                         	  Main_menu;
                         	  break;
                           }
public static void Client_menu:{
        		  String national_ID;
                          String commercialid 
                          String address;
                          String phone_Number;
        		  System.out.println("1\Normal Client \n2\Commercial Client \n3\Show All Clients \n4\Main list");
		         	          
		          int choice_3 = scanner.nextInt();
  		          switch (Choise_3):{
  		        	  case 1:
  		        	   System.out.print("Enter the Name: ");  		        	  
  		        	   name = scanner.next();  		        	
  		        	   System.out.print("Entert the national ID: ");
  		        	   national_ID = scanner.next();
                                   System.out.print("Enter the address: ");
  		        	   address = scanner.next();
  		        	   System.out.print("Enter the phone number: ");
  		        	   phone_Number = scanner.next();
  		        	   Client client = new Client(name, national_ID, address, phone_Number);
  		        	   clients_data.add(client);
                                   Assign();
		                   break;

                                  case 2:
                                   System.out.print("Enter the Name: ");  		        	  
  		        	   name = scanner.next();  		        	
  		        	   System.out.print("Entert the Commercial ID: ");
  		        	   commercialid = scanner.next();
                                   System.out.print("Enter the address: ");
  		        	   address = scanner.next();
  		        	   System.out.print("Enter the phone number: ");
  		        	   phone_Number = scanner.next();
  		        	   CommercialClient clint = new CommercialClient(name, commercialid, address, phone_Number);
  		        	   clients_data.add(Commercial client);
                                   Assign();
		                   break;
                                  case 3:
                                   bank.Disblay();
                                   Clients_menu;
                                   break;
                                  case 4:
                                   Main_menu;
                                   break;

 private static void Options() {
        System.out.println("1\ Withdraw \n2\ Deposit \n3\ Main menu");

        
        int choice_4 = scanner.nextInt();

        switch (choice_4) {
            case 1:

                System.out.println("Enter your Account number");
                int Account_number = scanner.nextInt();
                for (int i = 0; i < bank.Account_data().size(); i++) {
                    if (bank.Account_data().get(i).getAccount_number() == Account_number) {
                        System.out.println("How many you want to withdraw");
                        double put_in= scanner.nextDouble();
                        bank.Account_data().get(i).withdraw(put_in);
                        Main_menu();
                    } else {
                        System.out.println("There is no account with this Account number");
                        Options();
                    }
                }
                
                break;
           case 2:
                 System.out.println("Enter your Account number");
                int Account_number = scanner.nextInt();
                for (int i = 0; i < bank.Account_data().size(); i++) {
                    if (bank.Account_data().get(i).getAccount_number() == Account_number) {
                        System.out.println("How many you want to depsit");
                        double take_out= scanner.nextDouble();
                        bank.Account_data().get(i).deposit(take_out);
                        Main_menu();
                    } else {
                        System.out.println("There is no account with this Account number");
                        Options();
                    }
                }
                
                break; 
           case 3:
               Main_menu();
               break;
}

Static void Assign(){
 System.out.println("Assign Account: \n1\Yes \n2\No \n\t 3\Main menu ");
            int choice_5 = scanner.nextInt();
            switch (choice_5) {
                case 1:
                    System.out.println("Enter the account number: ");
                    int number = scanner.nextInt();
                    for (int i = 0; i < account_data.size(); i++) {
                        if (number == account_data.get(i).getAccount_number()) {
                            client_data.get(j- 1).setAccount(account_data.get(i));
                           Options();
                case 2:
                     Client_menu();
                     break;
                case 3:
                     Main_menu();
                     break;
}
	}
  
}
