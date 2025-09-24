package com.victorisimo.platform;

import com.victorisimo.content.Movie;

import java.time.LocalDateTime;

/*
    * User class to represent a user in the streaming platform
 */
public class User {
    public String name;
    public String email;
    public String password;
    public boolean isPremium;
    public LocalDateTime subscriptionDate;

    public User(){

    }

    // Constructor
    public User(String name, String email, String password, boolean isPremium) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isPremium = isPremium;
    }

    public void watchContent(Movie movie){
        if(movie.available || isPremium){
            System.out.println(name + " is watching: " + movie.title);
        } else {
            System.out.println("Sorry " + name + ", this content is not available for your subscription level.");
        }

    }

    public void subscribeToPremium(){
        isPremium = true;
        System.out.println("Congratulations " + name + ", you are now a premium user!");
    }

    public void unsubscribeFromPremium(){
        isPremium = false;
        System.out.println("You have unsubscribed from premium, " + name + ".");
    }
}
