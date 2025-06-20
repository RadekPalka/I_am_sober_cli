package org.example.context;

import java.util.Scanner;

public class AppContext {
    private static AppContext instance;
    private Scanner scanner;
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
}

