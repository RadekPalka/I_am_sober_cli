package org.example;

import org.example.context.AppContext;
import org.example.ui.HomeScreen;
import org.example.utils.ScreenManager;
import org.example.utils.Validator;

public class Main {
    public static void main(String[] args) {
        ScreenManager.getInstance().showScreen(HomeScreen.getInstance());
    }
}