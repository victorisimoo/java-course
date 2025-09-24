package com.victorisimo;

import com.victorisimo.content.Movie;
import com.victorisimo.platform.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Platzi Play 🍿 -----");

        /* Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();
        System.out.print(name + ", how old are you?: ");
        int years = scanner.nextInt();
        System.out.println("Hi " + name + " " + years + " this is Platzi Play!");*/

        Movie movie = new Movie();
        movie.title = "Heat";
        movie.yearofRelease = LocalDate.of(1995, 7, 15);
        movie.gender = "Action";
        movie.ratingMovie(4.5);
        System.out.println(movie.getMovieInformation());

        User user = new User();
        user.name = "Victor";
        user.subscriptionDate = LocalDateTime.of(2024, 6, 20, 10, 0);
        user.isPremium = true;
        user.watchContent(movie);
        System.out.println(user.subscriptionDate);




    }
}