package com.solvd.photostudio.contacts;

import java.util.Objects;

public class Contact {
    private String location;
    private String mail;
    private String phoneNumber;

    public Contact() {
    }

    public Contact(String location, String mail, String phoneNumber) {
        this.location = location;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Location = " + getLocation() +
                ", Mail = " + getMail() +
                ", PhoneNumber = " + getPhoneNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact that = (Contact) o;
        System.out.print("Same phone number : ");
        return getPhoneNumber() == that.getPhoneNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhoneNumber());
    }
}
