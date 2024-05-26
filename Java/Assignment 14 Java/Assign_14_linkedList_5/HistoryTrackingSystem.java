package Assign_14_linkedList_5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class HistoryTrackingSystem {
    private LinkedList<WebPage> webPages = new LinkedList<>();

    public void addPage(String pageId, String url, String title, String visitDate) {
        webPages.add(new WebPage(pageId, url, title, visitDate));
    }

    public void removePage(String id) {
        Iterator<WebPage> iterator = webPages.iterator();
        while (iterator.hasNext()) {
            WebPage webPage = iterator.next();
            if (webPage.getPageId().equals(id)) {
                iterator.remove();
            }
        }
    }

    public WebPage searchPage(String id) {
        for (WebPage webPage : webPages) {
            if (webPage.getPageId().equals(id)) {
                return webPage;
            }
        }
        return null;
    }

    public void displayPages() {
        for (WebPage webPage : webPages) {
            System.out.println(webPage);
        }
    }
    public static void main(String[] args) {
        HistoryTrackingSystem hts = new HistoryTrackingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHistory Tracking System");
            System.out.println("1. Add a Page");
            System.out.println("2. Remove a Page by ID");
            System.out.println("3. Search for a Page by ID");
            System.out.println("4. Display all Pages");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Page ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Page URL: ");
                    String url = scanner.nextLine();
                    System.out.print("Enter Page Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Visit Date: ");
                    String visitDate = scanner.nextLine();
                    hts.addPage(id, url, title, visitDate);
                    break;

                case 2:
                    System.out.print("Enter Page ID to remove: ");
                    String removeId = scanner.nextLine();
                    hts.removePage(removeId);
                    break;

                case 3:
                    System.out.print("Enter Page ID to search: ");
                    String searchId = scanner.nextLine();
                    WebPage webPage = hts.searchPage(searchId);
                    if (webPage != null) {
                        System.out.println(webPage);
                    } else {
                        System.out.println("Page not found.");
                    }
                    break;

                case 4:
                    hts.displayPages();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

   