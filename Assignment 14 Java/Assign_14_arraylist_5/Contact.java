package Assign_14_arraylist_5;

public class Contact {
	private String contactId;
	private String contactName;
	private String contactNUmber;
	private String emailId;
	public String getContactId() {
		return contactId;
	}
	
	public String getContactName() {
		return contactName;
	}
	
	public String getContactNUmber() {
		return contactNUmber;
	}

	public String getEmailId() {
		return emailId;
	}

	public Contact(String contactId, String contactName, String contactNUmber, String emailId) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNUmber = contactNUmber;
		this.emailId = emailId;
	}
	
	public void displayDetails() {
		
	}
}
