public class ConcreteProduct implements Product{
    private String name;
    private double price;
    private int quantity;

    public ConcreteProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPrice() {
        return null;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
