package OnlineShoppingPlatform;

public class MainClass {
    public static void main(String[] args) {
        Product electronic=new Product() {

            @Override
            public void displayDetails() {
                System.out.println("electronic details :");
            }

            @Override
            public void calculatePrice() {
                System.out.println("electronic price :");
            }
        };

        Product cloth=new Product() {

            @Override
            public void displayDetails() {
                System.out.println("cloth details :");
            }

            @Override
            public void calculatePrice() {
                System.out.println("cloth price :");
            }
        };

        Product book=new Product() {

            @Override
            public void displayDetails() {
                System.out.println("book details :");
            }

            @Override
            public void calculatePrice() {
                System.out.println("price of book :");
            }
        };
    }
}
