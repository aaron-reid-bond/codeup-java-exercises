package movies;

import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static Movie[] list = findAll();

    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Hello, welcome to my movie application!");
        int userInput = 6;
        while (userInput != 0) {
            menu();
            userInput = in.getInt();
            user(userInput);
        }
    }

    private static void menu() {
        System.out.println("What would you like to see?");
        System.out.println();
        System.out.printf("0 - exit%n1 - view all movies%n2 - view movies in the animated category%n3 - view movies in the drama category%n4 - view movies in the horror category%n5 - view movies in the sci-fi category%n Enter your choice: ");
    }

    private static void user(int input) {
        switch (input) {
            case 1 -> printMovies("all");
            case 2 -> printMovies("animated");
            case 3 -> printMovies("drama");
            case 4 -> printMovies("horror");
            case 5 -> printMovies("scifi");
        }
    }

    public static void printMovies(String category) {
        System.out.println("Here is your selection");
        System.out.println();
        for (Movie movie : list) {
            if (movie.getCategory().equals(category) || category.equalsIgnoreCase("all")) {
                System.out.printf("Title: %s, Genre: %s%n", movie.getName(), movie.getCategory());
            }
        }
        System.out.println();
    }
}