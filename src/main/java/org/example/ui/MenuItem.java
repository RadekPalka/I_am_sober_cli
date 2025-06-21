package org.example.ui;

public class MenuItem {
    private String label;
    private Runnable action;

    public MenuItem(String label, Runnable action){
        this.label= label;
        this.action = action;
    }
    public String getLabel(){
        return label;
    }

    public Runnable getAction(){
        return action;
    }
}
