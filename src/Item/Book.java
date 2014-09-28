/**
 * 
 */
package Item;

import java.util.Date;

/**
 * @author Josiah
 *
 */
public class Book extends Item {
	private int bookID;
	private String sn;
	private String author;
	private Date publish_Year;
	private String title;
	private String publisher;
	private String description;
	private double price;
	private int timesOut;
	private enum statusEnum {
		AVAILABLE, HOLD, OUT
	};
	private String status;

	public Book() {
		super();
	}
	
	

	/**
	 * @param bookID
	 * @param sN
	 * @param author
	 * @param publish_Year
	 * @param title
	 * @param publisher
	 * @param description
	 * @param price
	 * @param status
	 */
	public Book(int bookID, String sN, String author, Date publish_Year,
			String title, String publisher, String description, double price, int timesOut,
			String status) {
		this.bookID = bookID;
		sn = sN;
		this.author = author;
		this.publish_Year = publish_Year;
		this.title = title;
		this.publisher = publisher;
		this.description = description;
		this.price = price;
		this.status = status;
		this.setTimesOut(timesOut);
	}


	
	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}



	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}



	/**
	 * @return the sN
	 */
	public String getSn() {
		return sn;
	}



	/**
	 * @param sN the sN to set
	 */
	public void setSn(String sN) {
		sn = sN;
	}



	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}



	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}



	/**
	 * @return the publish_Year
	 */
	public Date getPublish_Year() {
		return publish_Year;
	}



	/**
	 * @param publish_Year the publish_Year to set
	 */
	public void setPublish_Year(Date publish_Year) {
		this.publish_Year = publish_Year;
	}



	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}



	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}



	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}



	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		//check that status is in enum list
		this.status = status;
	}


	/////////////
	///Methods///
	/////////////
	
	//allows admin to add book info 

	public void addBook(int bookID, String sN, String author,
			Date publish_Year, String title, String publisher,
			String description, double price) {
		this.bookID = bookID;
		this.sn = sN;
		this.author = author;
		this.publish_Year = publish_Year;
		this.title = title;
		this.publisher = publisher;
		this.description = description;
		this.price = price;
	}

	// shows book info on search, to user
	// will be changed later when we change to GUI
	public void showBookInfo() {
		System.out.printf("Title: ", this.title);
		System.out.printf("Serial Number: ", this.sn);
		System.out.printf("Author: ", this.author);
		System.out.printf("Published: ", this.publish_Year);
		System.out.printf("Publisher: ", this.publisher);
		System.out.printf("Description: ", this.description);
		
	}



	/**
	 * @return the timesOut
	 */
	public int getTimesOut() {
		return timesOut;
	}



	/**
	 * @param timesOut the timesOut to set
	 */
	public void setTimesOut(int timesOut) {
		this.timesOut = timesOut;
	}

}
