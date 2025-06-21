package org.example.ui;

public interface Screen {
    public void displayHeader();
    public void displayMenu();
    public void getOptionFromUser();
    public void runMenuAction(int option);
    public int getMenuArrayLength();
}
