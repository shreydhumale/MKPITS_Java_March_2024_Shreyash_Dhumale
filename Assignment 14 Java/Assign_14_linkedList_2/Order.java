package Assign_14_linkedList_2;

public class Order {
	private String orderIdString;
	private String coustumerNameString;
	private String priorityString;
	private String quantityString;
	private String orderDateString;
	public String getOrderIdString() {
		return orderIdString;
	}
	public void setOrderIdString(String orderIdString) {
		this.orderIdString = orderIdString;
	}
	public String getCoustumerNameString() {
		return coustumerNameString;
	}
	public void setCoustumerNameString(String coustumerNameString) {
		this.coustumerNameString = coustumerNameString;
	}
	public String getPriorityString() {
		return priorityString;
	}
	public void setPriorityString(String priorityString) {
		this.priorityString = priorityString;
	}
	public String getQuantityString() {
		return quantityString;
	}
	public void setQuantityString(String quantityString) {
		this.quantityString = quantityString;
	}
	public String getOrderDateString() {
		return orderDateString;
	}
	public void setOrderDateString(String orderDateString) {
		this.orderDateString = orderDateString;
	}
	public Order(String orderIdString, String coustumerNameString, String priorityString, String quantityString,
			String orderDateString) {
		super();
		this.orderIdString = orderIdString;
		this.coustumerNameString = coustumerNameString;
		this.priorityString = priorityString;
		this.quantityString = quantityString;
		this.orderDateString = orderDateString;
	}
	@Override
	public String toString() {
		return "Order [orderIdString=" + orderIdString + ", coustumerNameString=" + coustumerNameString
				+ ", priorityString=" + priorityString + ", quantityString=" + quantityString + ", orderDateString="
				+ orderDateString + "]";
	}
	
}
