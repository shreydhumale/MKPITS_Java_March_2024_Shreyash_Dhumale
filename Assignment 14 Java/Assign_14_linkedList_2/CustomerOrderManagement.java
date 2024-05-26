package Assign_14_linkedList_2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomerOrderManagement {
	LinkedList<Order> orders;
	public CustomerOrderManagement() {
		orders=new LinkedList<Order>();
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	public void updateQuantity(String quantity) {
		Iterator<Order>iterator=orders.iterator();
		while(iterator.hasNext()) {
			Order order=iterator.next();
			if(order.getOrderIdString().equals(quantity)){
				quantity+=1;
			}
		}
	}
	public void removeOrder(String id) {
		Iterator<Order>iterator=orders.iterator();
		while(iterator.hasNext()) {
			Order order=(Order)iterator.next();
			if(order.getQuantityString().equals(id)) {
				iterator.remove();
				System.out.println("order deleted ");
			}
		}
	}
	
	public void sort() {
		Collections.sort(orders, new orderDateComparator());
	}
	public void displayOrders() {
		Iterator<Order> iterator = orders.iterator();
		while (iterator.hasNext()) {
			Order order=(Order)iterator.next();

			System.out.println(order);

		}
	}
	public static void main(String[] args) {
		CustomerOrderManagement c1=new CustomerOrderManagement();
		c1.addOrder(new Order("10","order1","9","1","20th june"));
		c1.addOrder(new Order("20","order2","10","1","21th june"));
		c1.addOrder(new Order("30","order3","6","1","10th june"));
		c1.addOrder(new Order("40","order4","8","1","19th june"));
		c1.displayOrders();
		
	}
}
