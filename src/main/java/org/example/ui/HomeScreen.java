package org.example.ui;

public class HomeScreen implements Screen{
    public static HomeScreen instance;

    private HomeScreen(){

    }

    public static HomeScreen getInstance(){
        if (instance == null){
            instance = new HomeScreen();

        }
        return instance;
    }

    public void displayHeader(){
        System.out.println("Welcome to I am sober cli app");
    }

    public void displayMenu(){
        System.out.println("Choose option:");
        System.out.println("1. Register");
    }
}
