import java.util.Scanner;

public class Book{
        private String Title="Java";
        private String Author="ABC";
        private String ISBN="JA82487";
        private String priceOfBoook="500";
        private String pages="300";

        public String GetTitle() {
                System.out.println("Title");
                return Title;
        }

        public String GetAuthor() {
                System.out.println("Author");
                return Author;
        }

        public String GetISBN() {
                System.out.println("ISBN");
                return ISBN;
        }

        public String GetPriceOfBoook() {
                System.out.println("Price");
                return priceOfBoook;
        }

        public String GetPages() {
                System.out.println("Pages");
                return pages;
        }
}


        
        
