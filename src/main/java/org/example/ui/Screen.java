package org.example.ui;

public interface Screen {
    public void displayHeader();
    public void displayMenu();
    public int getOptionFromUser();
    public void checkAnswer(int option);
}
