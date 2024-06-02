package assignment_17;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class City_Population_Tracker{
    private static TreeMap<String, Integer> cityPopulations = new TreeMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nCity Population Tracker:");
            System.out.println("1. Add/Update city population");
            System.out.println("2. Delete city population");
            System.out.println("3. Retrieve city population");
            System.out.println("4. Display city populations");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addOrUpdateCityPopulation();
                    break;
                case 2:
                    deleteCityPopulation();
                    break;
                case 3:
                    retrieveCityPopulation();
                    break;
                case 4:
                    displayCityPopulations();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addOrUpdateCityPopulation() {
        System.out.print("Enter city name: ");
        String cityName = scanner.nextLine();
        System.out.print("Enter city population: ");
        int population = scanner.nextInt();
        scanner.nextLine(); 
        
        cityPopulations.put(cityName, population);
        System.out.println("City population added/updated successfully.");
    }

    private static void deleteCityPopulation() {
        System.out.print("Enter city name to delete: ");
        String cityName = scanner.nextLine();
        if (cityPopulations.remove(cityName) != null) {
            System.out.println("City population deleted successfully.");
        } else {
            System.out.println("City not found.");
        }
    }

    private static void retrieveCityPopulation() {
        System.out.print("Enter city name to retrieve: ");
        String cityName = scanner.nextLine();
        Integer population = cityPopulations.get(cityName);
        if (population != null) {
            System.out.println("Population of " + cityName + ": " + population);
        } else {
            System.out.println("City not found.");
        }
    }

    private static void displayCityPopulations() {
        System.out.println("City populations:");
        for (Map.Entry<String, Integer> entry : cityPopulations.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
