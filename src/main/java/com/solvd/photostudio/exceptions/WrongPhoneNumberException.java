package com.solvd.photostudio.exceptions;

public class WrongPhoneNumberException extends Exception {

    public WrongPhoneNumberException() {
        super("Invalid phone number! Try again");
    }

    public WrongPhoneNumberException(String message) {
        super(message);
    }
}