package stud;

public class Student {
	private String rollNo;
	private String sName;
	private String sAddress;
	private String sCity;
	
	public Student(String rollNo, String sName, String sAddress, String sCity) {
		super();
		this.rollNo = rollNo;
		this.sName = sName;
		this.sAddress = sAddress;
		this.sCity = sCity;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	
	
}
