package org.example;

import org.example.ui.HomeScreen;

public class Main {
    public static void main(String[] args) {
        HomeScreen.getInstance().displayHeader();
        HomeScreen.getInstance().displayMenu();
    }
}