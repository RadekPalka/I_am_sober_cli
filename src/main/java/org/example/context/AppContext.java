package org.example.context;

import java.util.Scanner;

public class AppContext {
    private static AppContext instance;
    private final Scanner scanner;
    private int userOption;
    private AppContext(){
        this.scanner = new Scanner(System.in);
    }

    public static AppContext getInstance(){
        if (instance == null){
            instance = new AppContext();
        }
        return instance;
    }

    public Scanner getScanner(){
        return scanner;
    }

    public int getUserOption() {
        return userOption;
    }

    public void setUserOption(int userOption) {
        this.userOption = userOption;
    }
}

