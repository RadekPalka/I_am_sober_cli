package org.example.ui;

import org.example.utils.ScreenManager;

public class LoginScreen extends AbstractScreen{
    private static LoginScreen instance;

    private LoginScreen(){
        this.menu = new MenuItem[]{
                new MenuItem("Main menu", () -> ScreenManager.getInstance().showScreen(HomeScreen.getInstance())),
                new MenuItem("Register", () -> ScreenManager.getInstance().showScreen(RegisterScreen.getInstance()))
        };
    }

    public static LoginScreen getInstance(){
        if (instance == null){
            instance  = new LoginScreen();
        }

        return instance;
    }

    @Override
    public void displayHeader(){
        System.out.println("Sign in");
    }
}
