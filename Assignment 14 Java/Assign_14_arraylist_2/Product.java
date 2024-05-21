package Assign_14_arraylist_2;

public class Product implements Comparable<Product>{
	private String productId;
	private String productName;
	private int quantity;
	private String price;
	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getPrice() {
		return price;
	}

	public Product(String productId, String productName, int quantity, String price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return "Product" +" id=" +productId +"\n"+
			   "Product name="+productName+"\n"+
			   "Quantity= "+quantity+"\n"+
			   "Price="+price+"$";
	}


	public int compareTo(Product product) {
		return price.compareTo(product.getPrice());
	}
}