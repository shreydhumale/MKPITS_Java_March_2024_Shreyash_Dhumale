import java.util.HashMap;
import java.util.Map;

public class ShoppingCart implements Cart{
    private Map<Product,Integer> cartItems;

    public ShoppingCart(){
        cartItems=new HashMap<>();
    }

    @Override
    public void addProduct(Product product, int quantity) {
        cartItems.put(product, cartItems.getOrDefault(product,0)+quantity);
    }

    @Override
    public void removeProduct(Product product) {
        cartItems.remove(product);

    public void viewCart(){
        for (Map.Entry<Product, Integer> entry):
    }
}
