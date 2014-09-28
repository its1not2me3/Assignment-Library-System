package Item;

import java.util.ArrayList;

import LibrarySystem.Records;

public class Receipt {
	/**
	 * @param issueDate
	 * @param records
	 */
	
	private int receiptID;
	private String issueDate;
	private ArrayList<Records> records;
	
	

	public Receipt() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param receiptID
	 * @param issueDate
	 * @param records
	 */
	public Receipt(int receiptID, String issueDate) {
		super();
		this.receiptID = receiptID;
		this.issueDate = issueDate;
		this.records = new ArrayList<Records>();
	}



	/**
	 * @return the receiptID
	 */
	public int getReceiptID() {
		return receiptID;
	}



	/**
	 * @param receiptID the receiptID to set
	 */
	public void setReceiptID(int receiptID) {
		this.receiptID = receiptID;
	}



	/**
	 * @return the issueDate
	 */
	public String getIssueDate() {
		return issueDate;
	}



	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}



	/**
	 * @return the records
	 */
	public ArrayList<Records> getRecords() {
		return records;
	}



	/**
	 * @param records the records to set
	 */
	public void setRecords(ArrayList<Records> records) {
		this.records = records;
	}
	
	public void printReceipt(){
		
	}
	
	public void createReceipt(ArrayList<Records> records){
		//automatically gets all records for receipts
		//admin receptionist
	}
	
}
