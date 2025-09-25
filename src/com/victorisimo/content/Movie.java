package com.victorisimo.content;

import java.time.LocalDate;
import java.util.Date;

/*
    * Movie class to represent a movie in the streaming platform
 */
public class Movie {
    private String title;
    private String description;
    private int duration;
    private String gender;
    private int year_of_release;
    private double rating;
    private boolean available;
    private LocalDate yearofRelease;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear_of_release() {
        return year_of_release;
    }

    public void setYear_of_release(int year_of_release) {
        this.year_of_release = year_of_release;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getYearofRelease() {
        return yearofRelease;
    }

    public void setYearofRelease(LocalDate yearofRelease) {
        this.yearofRelease = yearofRelease;
    }
}
