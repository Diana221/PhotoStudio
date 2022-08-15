package com.solvd.photostudio.exceptions;

public class WrongAgeException extends Exception {

    public WrongAgeException() {
        super("Invalid age! Try again");
    }

    public WrongAgeException(String message) {
        super(message);
    }
}