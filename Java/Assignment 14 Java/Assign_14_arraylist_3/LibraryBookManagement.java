package Assign_14_arraylist_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class LibraryBookManagement {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String bookName, String isbn, String author, String yearPublished) {
        books.add(new Book(bookName, isbn, author, yearPublished));
    }

    public void removeBookByIsbn(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
            }
        }
    }

    public Book searchBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void displayBookDetails() {
//        for (Book book : books) {
//            System.out.println(book);
//        }
    	Collections.sort(books);
    	System.out.println(books);
    }

    public static void main(String[] args) {
        LibraryBookManagement libraryBookManagement = new LibraryBookManagement();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Book Management System");
            System.out.println("1. Add a new book to the library");
            System.out.println("2. Remove a book by ISBN");
            System.out.println("3. Search for a book by ISBN");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the published year of the book: ");
                    String publishedYear = scanner.nextLine();
                    libraryBookManagement.addBook(bookName, isbn, author, publishedYear);
                    break;

                case 2:
                    System.out.print("Enter ISBN to remove book from the library: ");
                    String removeByIsbn = scanner.nextLine();
                    libraryBookManagement.removeBookByIsbn(removeByIsbn);
                    break;

                case 3:
                    System.out.print("Enter ISBN to search for a book in the library: ");
                    String searchBook = scanner.nextLine();
                    Book book = libraryBookManagement.searchBookByIsbn(searchBook);
                    if (book != null) {
                        System.out.println(book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    libraryBookManagement.displayBookDetails();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
