package org.example.ui;

import org.example.context.AppContext;
import org.example.utils.ScreenManager;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AbstractScreen{
    private static HomeScreen instance;


    private HomeScreen(){
        this.menu = new MenuItem[]{
                new MenuItem("Register", () -> ScreenManager.getInstance().showScreen(RegisterScreen.getInstance())),
                new MenuItem("Log in", () -> ScreenManager.getInstance().showScreen(LoginScreen.getInstance()))
        };
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

}
