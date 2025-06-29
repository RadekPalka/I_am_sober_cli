package org.example.ui;

import org.example.context.AppContext;

import java.util.List;

public abstract class AbstractScreen implements Screen{
    protected MenuItem[] menu;
    @Override
    public void displayHeader(){
        System.out.println("Welcome to I am sober cli app");
    }

    @Override
    public void displayMenu(){
        for (int i=0; i< menu.length; i++){
            System.out.printf("%d-> %s%n", i+1, menu[i].getLabel());
        }
    }

    @Override
    public void getOptionFromUser() {
        System.out.print("Choose option: ");
        String userOption = AppContext.getInstance().getScanner().nextLine();

        AppContext.getInstance().setUserOption(Integer.parseInt(userOption));
    }

    @Override
    public void runMenuAction(int option){
        menu[option-1].getAction().run();
    }

    @Override
    public int getMenuArrayLength() {
        return menu.length;
    }

}
