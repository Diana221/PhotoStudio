package com.solvd.photostudio.contacts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Contact {
    private static String location;
    private static String mail;
    private static String phoneNumber;

    public Contact() {
    }
    private static final Logger logger = LogManager.getLogger(Contact.class);
    public Contact(String location, String mail, String phoneNumber) {
        Contact.location = location;
        Contact.mail = mail;
        Contact.phoneNumber = phoneNumber;
    }

    public static String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        Contact.location = location;
    }

    public static String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        Contact.mail = mail;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        Contact.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Location = " + getLocation() +
                ", Mail = " + getMail() +
                ", Phone Number = " + getPhoneNumber();
    }


    @Override
    public int hashCode() {
        return Objects.hash(getPhoneNumber());
    }
}
