package com.solvd.photostudio.exceptions;

public class WrongStudioNumberException extends Exception {

    public WrongStudioNumberException() {
        super("Invalid studio number! Try again");
    }

    public WrongStudioNumberException(String message) {
        super(message);
    }
}
