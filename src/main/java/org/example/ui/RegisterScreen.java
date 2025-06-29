package org.example.ui;

import org.example.utils.ScreenManager;

public class RegisterScreen extends AbstractScreen{
    private static RegisterScreen instance;

    private RegisterScreen(){
        this.menu = new MenuItem[]{
                new MenuItem("Main menu", () -> ScreenManager.getInstance().showScreen(HomeScreen.getInstance())),
                new MenuItem("Log in", () -> ScreenManager.getInstance().showScreen(LoginScreen.getInstance()))
        };
    }

    public static RegisterScreen getInstance(){
        if (instance == null){
            instance = new RegisterScreen();
        }
        return instance;
    }

    @Override
    public void displayHeader(){
        System.out.println("Sign up");
    }
}
