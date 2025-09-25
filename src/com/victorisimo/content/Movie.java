package com.victorisimo.content;

import java.time.LocalDate;
import java.util.Date;

/*
    * Movie class to represent a movie in the streaming platform
 */
public class Movie {
    public String title;
    public String description;
    public int duration;
    public String gender;
    public int year_of_release;
    public double rating;
    public boolean available;
    public LocalDate yearofRelease;

    public Movie(){

    }

    public Movie(String title, String description, int duration, String gender, int year_of_release, double rating, boolean available) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.gender = gender;
        this.year_of_release = year_of_release;
        this.rating = rating;
        this.available = available;
    }

    public void reproduce(){
        System.out.println("Reproducing: " + title);
    }

    public boolean isPopular(){
        return rating >= 4;
    }

    public String getMovieInformation(){
        return title + " (" + yearofRelease.getYear() + ") \n" +
                "Gender: " + gender + "\n" +
                "Rating: " + rating + "/5";
    }

    public void ratingMovie(double rating){
        if(rating >= 0 && rating <= 5){
            this.rating = rating;
        }
    }

    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration + '\'' +
                ", gender='" + gender + '\'' +
                ", year_of_release=" + year_of_release + '\'' +
                ", rating=" + rating + '\'' +
                ", available=" + available +
                '}';
    }
}
