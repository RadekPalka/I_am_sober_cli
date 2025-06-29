package org.example.ui;

import org.example.context.AppContext;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AbstractScreen{
    private static HomeScreen instance;


    private HomeScreen(){
        this.menu = new MenuItem[]{
                new MenuItem("Register", () -> System.out.println("You are registered")),
                new MenuItem("Log in", () -> System.out.println("You are login"))
        };
    }

    public static HomeScreen getInstance(){
        if (instance == null){
            instance = new HomeScreen();

        }
        return instance;
    }




}
