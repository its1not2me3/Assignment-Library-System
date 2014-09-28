/**
 * 
 */
package User;

import javax.swing.JOptionPane;

/**
 * @author Josiah
 *
 */
public abstract class User  {
	//Initialize variable
	private String First_Name;
	private String Last_Name;
	private String Email;
	private String PhoneNo;
	private String Number;
	private String Street;
	private String Suburb;
	private int Postcode;
	private String City;

	public User() {
		super();
	}

	/**
	 * Default constructor
	 * @param first_Name
	 * @param last_Name
	 * @param email
	 * @param phoneNo
	 */
	
	public User(String first_Name, String last_Name, String email, String phoneNo) {
		setFirst_Name(first_Name);
		setLast_Name(last_Name);
		setEmail(email);
		setPhoneNo(phoneNo);
	}
	
	/**
	 * @param number
	 * @param street
	 * @param suburb
	 * @param postcode
	 * @param city
	 * @return 
	 */
	public void address(String Number, String street, String suburb, int postcode, String city) {
		this.setNumber(Number);
		setStreet(street);
		setSuburb(suburb);
		setPostcode(postcode);
		setCity(city);
	}


	public String getUserInput(String prompt){
		return JOptionPane.showInputDialog(prompt);
	}

	/**
	 * @return the first_Name
	 */
	public String getFirst_Name() {
		return First_Name;
	}

	/**
	 * @param first_Name the first_Name to set
	 */
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	/**
	 * @return the last_Name
	 */
	public String getLast_Name() {
		return Last_Name;
	}

	/**
	 * @param last_Name the last_Name to set
	 */
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return PhoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return Number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		Number = number;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return Street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		Street = street;
	}

	/**
	 * @return the suburb
	 */
	public String getSuburb() {
		return Suburb;
	}

	/**
	 * @param suburb the suburb to set
	 */
	public void setSuburb(String suburb) {
		Suburb = suburb;
	}

	/**
	 * @return the postcode
	 */
	public int getPostcode() {
		return Postcode;
	}

	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(int postcode) {
		Postcode = postcode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}

	public void login() {

	}

	public void logout() {
		
	}
	
}
