package User;

import java.util.Date;

import UserInclassw8.User;

public class Admin extends Receptionist {
//add 
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int uID, String uFirstName, String uLastName, String uTitle,
			String uPhone, String uEmail, String uAddress, Date uDOB,
			String uUsername, String uPassword) {
		super(uID, uFirstName, uLastName, uTitle, uPhone, uEmail, uAddress,
				uDOB, uUsername, uPassword);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void borrowBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}
	
	public void addACustomer(){
		
	}
	
	public void updateCustomerInfo(){
		
	}
	
	public void deleteACustomer(){
		
	}
	
	public void addReceptionist(){
		
	}

	public void updateReceptionistInfo(){
		
	}
	
	public void deleteReceptionist(){
		
	}
	
	public void addBook(){
		
	}
	
	public void removeBook(){
		
	}
	
	public void takeFine(int cID){
		
	}
	
	public void updateBookStatus(){
		
	}

}
