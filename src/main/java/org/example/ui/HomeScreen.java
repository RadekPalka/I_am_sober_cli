package org.example.ui;

import java.util.List;

public class HomeScreen extends AbstractScreen{
    private static HomeScreen instance;



    private HomeScreen(){
        this.menu= List.of(
                new MenuItem("Register", ()->System.out.println("You are registered")),
                new MenuItem("Log in", ()-> System.out.println("You are login"))
        );
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
        for (int i=0; i< menu.size(); i++){
            System.out.printf("%d-> %s%n", i+1, menu.get(i).getLabel());
        }
    }
}
