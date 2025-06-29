package org.example.utils;

import org.example.context.AppContext;
import org.example.ui.AbstractScreen;
import org.example.ui.HomeScreen;

public class ScreenManager {
    private static ScreenManager instance;

    private ScreenManager(){}

    public static ScreenManager getInstance(){
        if (instance == null){
            instance = new ScreenManager();
        }
        return instance;
    }

    public void showScreen(AbstractScreen screen){
        boolean isInRange = true;
        boolean isUserInputCorrect = false;
        screen.displayHeader();
        screen.displayMenu();
        while(!isUserInputCorrect || !isInRange){
            try{
                HomeScreen.getInstance().getOptionFromUser();
                isInRange = Validator.getInstance().isWithinRange(AppContext.getInstance().getUserOption()-1, HomeScreen.getInstance().getMenuArrayLength());
                isUserInputCorrect = true;
            } catch (NumberFormatException e) {
                isUserInputCorrect = false;
                System.out.println("Incorrect character. Please try again");
            }
            if (isUserInputCorrect && !isInRange){
                System.out.println("Incorrect number. Please try again.");
            }
        }
        screen.runMenuAction(AppContext.getInstance().getUserOption());
    }
}
