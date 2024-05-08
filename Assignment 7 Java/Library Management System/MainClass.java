

public class MainClass {
    public static void main(String[] args) {
        Book book=new Book();
        System.out.println(book.GetTitle());
        System.out.println(book.GetAuthor());
        System.out.println(book.GetISBN());
        System.out.println(book.GetPriceOfBoook());
        System.out.println(book.GetPages());
    }
}