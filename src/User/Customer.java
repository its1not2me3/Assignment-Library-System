/**
 * 
 */
package User;

import java.util.Currency;
import java.util.Date;

import UserInclassw8.User;

/**
 * @author Josiah
 *
 */
public class Customer extends User {
	private Date DateOfBirth;
	private Boolean CustomerStatus;
	private int CurrentNumberOfBooks;
	private Currency Balance;
	private double fine;

	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cID
	 * @param uFirstName
	 * @param uLastName
	 * @param uTitle
	 * @param uPhone
	 * @param uEmail
	 * @param uAddress
	 * @param uDOB
	 * @param uUsername
	 * @param uPassword
	 */
	public Customer(int cID, String uFirstName, String uLastName,
			String uTitle, String uPhone, String uEmail, String uAddress,
			Date uDOB, String uUsername, String uPassword) {
		super(uID, uFirstName, uLastName, uTitle, uPhone, uEmail, uAddress,
				uDOB, uUsername, uPassword);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see UserInclassw8.User#borrowBook()
	 */
	@Override
	public void borrowBook() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see UserInclassw8.User#returnBook()
	 */
	@Override
	public void returnBook() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see UserInclassw8.User#searchBook()
	 */
	@Override
	public void searchBook() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see UserInclassw8.User#login()
	 */
	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see UserInclassw8.User#logout()
	 */
	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}

	public void payFine() {
		this.fine = 0;
	}

	public void requestBook() {

	}

	public void changeDetails() {
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#getuFirstName()
	 */
	@Override
	public String getuFirstName() {
		// TODO Auto-generated method stub
		return super.getuFirstName();
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#setuFirstName(java.lang.String)
	 */
	@Override
	public void setuFirstName(String uFirstName) {
		// TODO Auto-generated method stub
		super.setuFirstName(uFirstName);
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#getuLastName()
	 */
	@Override
	public String getuLastName() {
		// TODO Auto-generated method stub
		return super.getuLastName();
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#setuLastName(java.lang.String)
	 */
	@Override
	public void setuLastName(String uLastName) {
		// TODO Auto-generated method stub
		super.setuLastName(uLastName);
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#getuTitle()
	 */
	@Override
	public String getuTitle() {
		// TODO Auto-generated method stub
		return super.getuTitle();
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#setuTitle(java.lang.String)
	 */
	@Override
	public void setuTitle(String uTitle) {
		// TODO Auto-generated method stub
		super.setuTitle(uTitle);
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#getuPhone()
	 */
	@Override
	public String getuPhone() {
		// TODO Auto-generated method stub
		return super.getuPhone();
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#setuPhone(java.lang.String)
	 */
	@Override
	public void setuPhone(String uPhone) {
		// TODO Auto-generated method stub
		super.setuPhone(uPhone);
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#getuEmail()
	 */
	@Override
	public String getuEmail() {
		// TODO Auto-generated method stub
		return super.getuEmail();
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#setuEmail(java.lang.String)
	 */
	@Override
	public void setuEmail(String uEmail) {
		// TODO Auto-generated method stub
		super.setuEmail(uEmail);
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#getuAddress()
	 */
	@Override
	public String getuAddress() {
		// TODO Auto-generated method stub
		return super.getuAddress();
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#setuAddress(java.lang.String)
	 */
	@Override
	public void setuAddress(String uAddress) {
		// TODO Auto-generated method stub
		super.setuAddress(uAddress);
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#getuDOB()
	 */
	@Override
	public Date getuDOB() {
		// TODO Auto-generated method stub
		return super.getuDOB();
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#setuDOB(java.util.Date)
	 */
	@Override
	public void setuDOB(Date uDOB) {
		// TODO Auto-generated method stub
		super.setuDOB(uDOB);
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#getuUsername()
	 */
	@Override
	public String getuUsername() {
		// TODO Auto-generated method stub
		return super.getuUsername();
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#setuUsername(java.lang.String)
	 */
	@Override
	public void setuUsername(String uUsername) {
		// TODO Auto-generated method stub
		super.setuUsername(uUsername);
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#getuPassword()
	 */
	@Override
	public String getuPassword() {
		// TODO Auto-generated method stub
		return super.getuPassword();
	}

	/* (non-Javadoc)
	 * @see UserInclassw8.User#setuPassword(java.lang.String)
	 */
	@Override
	public void setuPassword(String uPassword) {
		// TODO Auto-generated method stub
		super.setuPassword(uPassword);
	}
	
	public void setFine(double fine){
		this.fine =  fine;
	}
	
	public double getFine(){
		return this.fine;
	}
	
	
}