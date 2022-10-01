
package entity;



public class Accounts {

private	long accountNumber;
private	String userName;
private	String password;
private	int balance;
private	KYCVerification kycDetails;
private	ContactDetails contactDetails;
private	int cashback;
private AccountDetails ad;
private KYCVerification kyc;
private ContactDetails cd;
public Accounts(long accountNumber2, String username2, int password2, int balance2, Object object, Object object2, int cashback2) {

	super();
	// TODO Auto-generated constructor stub
}
public Accounts(long accountNumber, String userName,String password, int balance, KYCVerification kycDetails,
		ContactDetails contactDetails, int cashback) {
	super();
	this.accountNumber = accountNumber;
	this.userName = userName;
	this.password = password;
	this.balance = balance;
	this.kycDetails = kycDetails;
	this.contactDetails = contactDetails;
	this.cashback = cashback;
}
public AccountDetails getAccountdetails() {
	return ad;
}
public KYCVerification getKycdetails()
{
	return kyc;
}
public ContactDetails getContactDetail()
{
	return cd;
}

public void setAccountDetails(AccountDetails ad) {
	this.ad = ad;
}
public void setKYCVerification(KYCVerification kyc)
{
	this.kyc=kyc;
}
public void setContactDetail(ContactDetails cd)
{
	this.cd=cd;
}

public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public KYCVerification getKycDetails() {
	return kycDetails;
}
public void setKycDetails(KYCVerification kycDetails) {
	this.kycDetails = kycDetails;
}
public ContactDetails getContactDetails() {
	return contactDetails;
}
public void setContactDetails(ContactDetails contactDetails) {
	this.contactDetails = contactDetails;
}
public int getCashback() {
	return cashback;
}
public void setCashback(int cashback) {
	this.cashback = cashback;
}
@Override
public String toString() {
	return "Accounts [accountNumber=" + accountNumber + ", userName=" + userName + ", password=" + password
			+ ", balance=" + balance + ", contactDetails=" + contactDetails + ", cashback=" + cashback + "]";

	
}
public String getHolderName() {
	// TODO Auto-generated method stub
	return null;
}
public char[] getKYCVerification() {
	// TODO Auto-generated method stub
	return null;
}
}


