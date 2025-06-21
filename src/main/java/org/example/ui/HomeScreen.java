package org.example.ui;

import org.example.context.AppContext;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AbstractScreen{
    private static HomeScreen instance;
    private final MenuItem[] menu= {new MenuItem("Register", ()->System.out.println("You are registered")),
            new MenuItem("Log in", ()-> System.out.println("You are login"))};


    private HomeScreen(){

    }

    public static HomeScreen getInstance(){
        if (instance == null){
            instance = new HomeScreen();

        }
        return instance;
    }
    @Override
    public void displayHeader(){
        System.out.println("Welcome to I am sober cli app");
    }

    @Override
    public void displayMenu(){
        for (int i=0; i< menu.length; i++){
            System.out.printf("%d-> %s%n", i+1, menu[i].getLabel());
        }
    }

    @Override
    public int getOptionFromUser() {
        System.out.print("Choose option: ");
        return AppContext.getInstance().getScanner().nextInt();
    }

    @Override
    public void checkAnswer(int option){
        menu[option-1].getAction().run();
    }
}
