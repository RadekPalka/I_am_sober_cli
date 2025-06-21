package org.example;

import org.example.context.AppContext;
import org.example.ui.HomeScreen;
import org.example.utils.Validator;

public class Main {
    public static void main(String[] args) {
        boolean isInRange = true;
        boolean isUserInputCorrect = false;
        HomeScreen.getInstance().displayHeader();
        HomeScreen.getInstance().displayMenu();
        while(!isUserInputCorrect || !isInRange){
            try{
                isInRange = true;
                HomeScreen.getInstance().getOptionFromUser();
                isInRange = Validator.getInstance().isWithinRange(AppContext.getInstance().getUserOption()-1, HomeScreen.getInstance().getMenuArrayLength());
                isUserInputCorrect = true;
            } catch (Exception e) {
                isUserInputCorrect = false;
                System.out.println("Incorrect character. Please try again");
            }
            if (!isInRange){
                System.out.println("Incorrect number. Please try again.");
            }
        }
        HomeScreen.getInstance().runMenuAction(AppContext.getInstance().getUserOption());
    }
}