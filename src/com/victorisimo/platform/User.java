package com.victorisimo.platform;

import com.victorisimo.content.Movie;

import java.time.LocalDateTime;

/*
    * User class to represent a user in the streaming platform
 */
public class User {
    private String name;
    private String email;
    private String password;
    private boolean isPremium;
    private LocalDateTime subscriptionDate;

    public User(){

    }

    // Constructor
    public User(String name, String email, String password, boolean isPremium) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isPremium = isPremium;
        this.subscriptionDate = LocalDateTime.now();
    }

    public void watchContent(Movie movie){
        if(movie.isAvailable() || isPremium){
            System.out.println(name + " is watching: " + movie.getTitle());
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public LocalDateTime getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDateTime subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }
}
