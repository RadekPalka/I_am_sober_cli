package org.example.utils;

public class Validator {
    private static Validator instance;

    private Validator(){}

    public static Validator getInstance(){
        if (instance == null){
            instance = new Validator();
        }
        return instance;
    }

    public boolean isWithinRange(int index, int length){
        return (index>=0 && index < length);
    }
}
