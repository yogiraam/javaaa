
	 
package entity;


import java.util.*;
import entity.Accounts;
import entity.KYCVerification;
import entity.ContactDetails;
import java.util.Random;

public class MainClassAccounts {
	Accounts allAccount[]=new Accounts[5000];
	int noOfAccountEntry=0;
	Scanner sc = new Scanner(System.in);//for string
	Scanner sc1 = new Scanner(System.in);//for nonString
	private long accountNumber;
	private String locname;
	private Object kycDetails;
	private Object contactDetails;
	private long adharNumber;
	private String documentType;
	private long documentNo;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   MainClassAccounts app = new MainClassAccounts();
	   while(true) {
		   System.out.println("\n\n=========KYCBankDetails=================\n\n");
		   System.out.println("0.Exit");
		   System.out.println("1.Submit user details");
		   System.out.println("2.do deposit operation");
		   System.out.println("4.print user contact details");
		   System.out.println("5.print user KYC document details");
		   System.out.println("6.print balance");
		   System.out.println("7.change mobile number");
		   System.out.println("8.change mail id");
		   System.out.println("Enter option[0-8]");
		   switch(app.sc.nextInt()){
		   case 1:
			   app.submitUserDetails();
			   break;
		   case 2:
			   app.deposit();
			   break;

		   case 3:
			   app.viewalluserdetails();
			   break;
		   case 4:
			   app.contactDetails();
			   break;
		   case 5:
			   app.viewkycDetails();
			   break;
		   case 6:
			   app.userBalance();
			   break;
		   case 7:
			   app.changeMobileNumber();
			   break;
		   default:
			   System.out.println("Exit");
			   System.exit(0);
		   }//Switch end
	   }//While end
		}private void viewalluserdetails() {
			// TODO Auto-generated method stub

		}
		//main end
		public void submitUserDetails()
		{
			Random myRandom=new Random();
			long AccountNumber=myRandom.nextLong();
			System.out.println("Enter the user name ");
			String username=sc1.nextLine();
			System.out.println("Enter the password");
			int password=sc.nextInt();
			System.out.println("Enter the balance");
			int balance=sc.nextInt();
			System.out.println("Enter cashback");
			int cashback=sc.nextInt();
			System.out.println("Enter the PAN Number");
			String panNumber=sc1.nextLine();
			System.out.println("Enter the Aadhar Number");
			 long aaharNumber=sc.nextLong();
			System.out.println("Enter the Document Type");
			String documenttype=sc1.nextLine();
			System.out.println("Enter the Document Number");
			String documentNumber=sc1.nextLine();
		    System.out.println("Enter the house Number");
		    String houseNumber=sc1.nextLine();
			System.out.println("Enter the Locality Name");
			String localityName=sc1.nextLine();
			System.out.println("Enter the City Name");
			String cityName=sc1.nextLine();
			System.out.println("Enter the State Name");
			String stateName=sc1.nextLine();
			System.out.println("Enter the Country Name");
			String countryName=sc1.nextLine();
			System.out.println("Enter the pin Code");
			long pinCode =sc.nextLong();
			System.out.println("Enter the Mobile Number");
			long mobileNumber=sc.nextLong();
			System.out.println("Enter the emailId");
			String emailId=sc1.nextLine();

			Accounts a=new Accounts(accountNumber, locname,  password, balance, kycDetails,
					 contactDetails,  cashback);
			KYCVerification kycDetails=new KYCVerification( panNumber, adharNumber,documentType, documentNo) ;
			ContactDetails contactDetails=new   ContactDetails( houseNumber, localityName,  cityName, stateName,pinCode,
					 mobileNumber,emailId);


			a.setKYCVerification(kycDetails);
			a.setContactDetails(contactDetails);
			allAccount[noOfAccountEntry++]=a;
			System.out.println(""+a);
			System.out.println("Added in the list");
		}
		@SuppressWarnings("unused")
		public void printall(Accounts a1) {
			System.out.println("\n"+a1.getAccountNumber()+"\t");
			System.out.println(a1.getUserName()+"\t");
			System.out.println(a1.getBalance()+"\t");

			System.out.println("\n=======================\n");
		for(int i=0;i<noOfAccountEntry;i++ ) {
			Accounts a=allAccount[i];
			printall(a1);
		}

		}


			public void deposit() {
			System.out.println("Enter the Deposit Amount");
			int amount=sc.nextInt();
			System.out.println("Enter the Account number to deposit");
			int searchAccNumber=sc.nextInt();
			Accounts account=null;
			boolean foundAccount= false;

			for (int i =0;i<noOfAccountEntry;i++) {
				Accounts a=allAccount[i];
				if(a.getAccountNumber()==searchAccNumber);
				{
					account =a;
					foundAccount=true;
				}
			}
			if(foundAccount) {
				account.setBalance(account.getBalance()+amount);
			}
			System.out.println("The amount has been deposited ");
			System.out.println("Check Balance");
			System.out.println(account.getAccountNumber()+"-"+account.getBalance());
			}
			public Accounts printAccountDetails(int searchAccNumber) {
				for(int i=0;i<noOfAccountEntry;i++) {
					Accounts a =allAccount[i];
					boolean isFound=(a.getAccountNumber()==searchAccNumber)?true:false;
					if(isFound)
					{
						return a;
					}
				}
				return null;
			}

		public void contactDetails()	
		{
		System.out.println("Enter the account number");	
		int  searchaccNumber=sc.nextInt();	
		Accounts a =printAccountDetails(searchaccNumber);	
		System.out.println(a.getContactDetails());	
		}



		public void viewkycDetails()	
		{
		System.out.println("Enter the account Number");	
		int searchaccNo= sc.nextInt();	
		Accounts a = printAccountDetails(searchaccNo);	
		System.out.println(((Accounts) a).getKYCVerification());	
		}




		public void userBalance()	
		{	
		System.out.println("Enter the Account number");	
		int searchAccNumber= sc.nextInt();	
		Accounts a=printAccountDetails(searchAccNumber);	
		System.out.println(a.getBalance());
		}	



		public void changeMobileNumber()	
		{
		System.out.println("Enter the account number");	
		int searchAccNumber = sc.nextInt();	

		Accounts a = printAccountDetails(searchAccNumber);	
		System.out.println("Enter new mobile number");
		long newmobileno=sc.nextLong();
		System.out.println();	
		a.getContactDetails().setMobileNumber(newmobileno);
		System.out.println("---->>new mobileno after updation:-");
		System.out.println(a);
		}
		public void changeEmailId() {
			System.out.println("Enter account no");
			String emailId=sc1.nextLine();
			Accounts a=new Accounts(accountNumber, emailId, noOfAccountEntry, noOfAccountEntry, contactDetails, contactDetails, noOfAccountEntry);
			System.out.println("Enter new emailId");
			String newmailid = sc1.nextLine();
			System.out.println(a.getContactDetails());
			a.getContactDetails().setEmailId(newmailid);

			System.out.println("---->>email after updation:-");
			System.out.println(a);
		}


		}


