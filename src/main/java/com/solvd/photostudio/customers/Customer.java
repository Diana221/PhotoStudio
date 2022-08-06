package com.solvd.photostudio.customers;

import com.solvd.photostudio.abstractclassses.Person;
import com.solvd.photostudio.exceptions.WrongPhoneNumberException;
import com.solvd.photostudio.exceptions.WrongStudioNumberException;
import com.solvd.photostudio.interfaces.iBackCall;
import com.solvd.photostudio.interfaces.iPhotoShoot;
import com.solvd.photostudio.interfaces.iRent;
import com.solvd.photostudio.photoShoot.Studio;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.Scanner;

public class Customer extends Person implements iRent, iPhotoShoot, iBackCall {
    private boolean regularCustomer;
    private static final Logger logger = LogManager.getLogger(Customer.class);
    public Customer() {
    }

    public Customer(String name, String surname, String phoneNumber, int age, boolean regularCustomer) {
        super(name, surname, phoneNumber, age);
        this.regularCustomer = regularCustomer;
    }

    public boolean isRegularCustomer() {
        return regularCustomer;
    }

    public void setRegularCustomer(boolean regularCustomer) {
        this.regularCustomer = regularCustomer;
    }

    @Override
    public void info() {
        logger.info("\nInformation about customers:");
    }

    @Override
    public void rentStudio() {
        logger.info("To rent studio enter studio number: ");
        Scanner number = new Scanner(System.in);
        try {
            if (number.hasNextInt()) {
                int studioNumber = number.nextInt();
                if (studioNumber < 1 || studioNumber > 5) {
                    throw new WrongStudioNumberException();
                }
                logger.info(getName() + ", studio number \"" + studioNumber + "\" was rented for you! We are waiting for you!");

            } else logger.info("Enter studio number!");
        } catch (WrongStudioNumberException e) {
            logger.info(e.getMessage());
        }
    }

    @Override
    public void rentPhotographer() {
        logger.info("To rent photographer enter some info:");
        try {
            logger.info("Photographer's name: ");
            Scanner name = new Scanner(System.in);
            if (!name.hasNextInt()) {
                String photographerName = name.next();
                logger.info("Photographer's surname: ");
                Scanner surname = new Scanner(System.in);
                if (!surname.hasNextInt()) {
                    String photographerSurname = surname.next();
                    logger.info(getName() + ", photographer " + photographerName + " " + photographerSurname + " was rented for you! We are waiting for you!");
                } else {
                    surname.next();
                    logger.info("Enter surname!");
                }
            } else {
                name.next();
                logger.info("Enter name!");
            }
        } catch (Exception exception) {
            logger.info(exception.getMessage());
        }
    }

    @Override
    public void photoShoot(Studio[] studio) {
        logger.info("To order photo shoot enter studio number: ");
        Scanner number = new Scanner(System.in);
        try {
            if (number.hasNextInt()) {
                int studioNumber = number.nextInt();
                if (studioNumber < 1 || studioNumber > 5) {
                    throw new WrongStudioNumberException();
                }
                logger.info(getName() + ", Thank you for ordering photo shoot(your studio number is " + studioNumber + ")! We are waiting for you!");

            } else logger.info("Enter studio number!");
        } catch (WrongStudioNumberException e) {
            logger.info(e.getMessage());
        }
    }

    @Override
    public void callBack() {
        logger.info("Enter your phone number (format 0987671616):");
        Scanner number = new Scanner(System.in);
        try {
            String phoneNumber = number.next();
            if (phoneNumber.matches("[-+]?\\d+") && phoneNumber.length() == 10) {
                logger.info("Thank you! We will call you back soon!");
                number.close();
            } else {
                throw new WrongPhoneNumberException();
            }
        } catch (WrongPhoneNumberException ex) {
            logger.info(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return
                "Name = " + getName() +
                        ", Surname = " + getSurname() +
                        ", PhoneNumber = " + getPhoneNumber() +
                        ", Age = " + getAge() +
                        ", Regular customer = " + isRegularCustomer();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        System.out.print("Namesake: ");
        return Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }
}
