package com.victorisimo;

import com.victorisimo.content.Movie;
import com.victorisimo.platform.Platform;
import com.victorisimo.util.ScannerUtils;

import java.time.LocalDate;

public class Main {

    public static final String VERSION = "1.0.0";
    public static final String NAME_PLATFORM = "Platzi Play";

    public static void main(String[] args) {
        System.out.println(NAME_PLATFORM + ": v" + VERSION);

        Platform platform = new Platform(NAME_PLATFORM);

        /* Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();
        System.out.print(name + ", how old are you?: ");
        int years = scanner.nextInt();
        System.out.println("Hi " + name + " " + years + " this is Platzi Play!");*/

        String titleMovie = ScannerUtils.readStringInput("What do you want to watch today");
        int durationMovie = ScannerUtils.readIntInput("How long is the movie (in minutes)");
        double ratingMovie = ScannerUtils.readDoubleInput("How do you rate the movie (0 to 5)");

        Movie movie = new Movie();
        movie.setTitle(titleMovie);
        movie.setDuration(durationMovie);
        movie.setYearofRelease(LocalDate.of(1995, 7, 15));
        movie.setGender("Action");
        movie.setRating(ratingMovie);

        Movie movie2 = new Movie("The Matrix", "A computer hacker learns about the true nature of his reality and his role in the war against its controllers.", 136, "Science Fiction", 1999, 4.7, true);

        platform.addMovie(movie);
        platform.addMovie(movie2);

        platform.removeMovie(movie2);

        System.out.println("Movies saves: ");
        platform.getMovieList();
        System.out.println("Movies count: "+ (platform.getMovies()).size());
        //System.out.println(movie.toString());
        //System.out.println(movie.getMovieInformation());

       /* User user = new User();
        user.name = "Victor";
        user.subscriptionDate = LocalDateTime.of(2024, 6, 20, 10, 0);
        user.isPremium = true;*/

    }
}