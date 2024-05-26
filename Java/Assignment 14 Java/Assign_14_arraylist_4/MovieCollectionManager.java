package Assign_14_arraylist_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieCollectionManager {
    ArrayList<MovieDetails> movieDetails = new ArrayList<MovieDetails>();

    public void addNewMovie(String movieID, String movieTitle, String movieGenre, String releasedYear) {
        movieDetails.add(new MovieDetails(movieID, movieTitle, movieGenre, releasedYear));
    }

    public void removeMovie(String id) {
        Iterator<MovieDetails> iterator = movieDetails.iterator();
        while (iterator.hasNext()) {
            MovieDetails movie = iterator.next();
            if (movie.getMovieID().equals(id)) {
                iterator.remove();
                System.out.println("Movie with ID " + id + " removed.");
                return;
            }
        }
        System.out.println("Movie with ID " + id + " not found.");
    }

    public MovieDetails searchForMovie(String title) {
        for (MovieDetails movie : movieDetails) {
            if (movie.getMovieTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }

    public void displayMoviesByGenre(String genre) {
        boolean found = false;
        for (MovieDetails movie : movieDetails) {
            if (movie.getMovieGenre().equalsIgnoreCase(genre)) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found in genre " + genre);
        }
    }

    public void displayMovies() {
        if (movieDetails.isEmpty()) {
            System.out.println("No movies in the collection.");
        } else {
            for (MovieDetails movie : movieDetails) {
                System.out.println(movie);
            }
        }
    }

    public static void main(String[] args) {
        MovieCollectionManager movieCollectionManager = new MovieCollectionManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMovie Collection Manager");
            System.out.println("1. Add a new movie to the collection.");
            System.out.println("2. Remove a movie by movieID.");
            System.out.println("3. Search for a movie by title and display its details.");
            System.out.println("4. Display all movies of a specific genre.");
            System.out.println("5. Display all movies.");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Movie ID:");
                    String id = scanner.nextLine();
                    System.out.println("Enter Movie Title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter Movie Genre:");
                    String genre = scanner.nextLine();
                    System.out.println("Enter Year Released:");
                    String yearReleased = scanner.nextLine();
                    movieCollectionManager.addNewMovie(id, title, genre, yearReleased);
                    break;

                case 2:
                    System.out.println("Enter movie ID to remove movie:");
                    String removeID = scanner.nextLine();
                    movieCollectionManager.removeMovie(removeID);
                    break;

                case 3:
                    System.out.println("Enter title to search for a movie:");
                    String searchTitle = scanner.nextLine();
                    MovieDetails movieDetails = movieCollectionManager.searchForMovie(searchTitle);
                    if (movieDetails != null) {
                        System.out.println(movieDetails);
                    } else {
                        System.out.println("Movie not found!");
                    }
                    break;

                case 4:
                    System.out.println("Enter genre to display movies:");
                    String searchGenre = scanner.nextLine();
                    movieCollectionManager.displayMoviesByGenre(searchGenre);
                    break;

                case 5:
                    movieCollectionManager.displayMovies();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}