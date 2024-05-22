package LibraryManagementSystem;

public class MainClass {
    public static void main(String[] args) {
        LibraryItem journals = new LibraryItem() {

            @Override
            public void returnItem() {
                System.out.println("return journals ");
            }

            @Override
            public void checkOut() {
                System.out.println("checkout journals");
            }
        };

        LibraryItem dvd = new LibraryItem() {

            @Override
            public void returnItem() {
                System.out.println("return dvd ");
            }

            @Override
            public void checkOut() {
                System.out.println("checkout dvd");
            }
        };

        LibraryItem books = new LibraryItem() {

            @Override
            public void returnItem() {
                System.out.println("return book ");
            }

            @Override
            public void checkOut() {
                System.out.println("checkout book");
            }
        };
    }
}
