package com.sparta.jh;
// Written by James 
public class App {
    public static void main( String[] args ) {
        int timeOfDay = 52; //Strongly typed, Statically typed
        String welcomeMessage = greeting(timeOfDay);
        System.out.println(welcomeMessage);
    }
    public static String greeting(int timeOfDay) {
        String message = null;
        if (timeOfDay >= 5 && timeOfDay < 12) {
            message = "Good Morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            message = "Good Afternoon!";
        } else if (timeOfDay > 18 && timeOfDay <= 24) {
            message = "Good Evening!";
        } else if (timeOfDay >= 0 && timeOfDay < 5) {
            message = "Go to bed!";
        } else {
            message = "This is not a valid time of day!";
        }
        return message;
    }
}

