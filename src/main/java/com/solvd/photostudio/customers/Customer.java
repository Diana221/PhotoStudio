package com.solvd.photostudio.customers;

import com.solvd.photostudio.abstractclassses.Person;
import com.solvd.photostudio.employees.Photographer;
import com.solvd.photostudio.exceptions.WrongStudioNumberException;
import com.solvd.photostudio.infogeneration.InfoGeneration;
import com.solvd.photostudio.interfaces.iBackCall;
import com.solvd.photostudio.interfaces.iPhotoShoot;
import com.solvd.photostudio.interfaces.iRent;
import com.solvd.photostudio.photoShoot.Studio;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Customer extends Person implements iRent, iPhotoShoot, iBackCall {
    private static final Logger logger = LogManager.getLogger(Customer.class);
    private boolean regularCustomer;

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

        int studioNumber = 0;

        LinkedList<Studio> studios = InfoGeneration.GenerationStudioInfo();
        for (Studio studio : studios) {
            logger.info(studio);
        }

        do {
            try {
                logger.info("To rent studio enter studio number: ");
                Scanner number_ = new Scanner(System.in);
                if (number_.hasNextInt()) {
                    studioNumber = number_.nextInt();
                    if (studioNumber > 0 && studioNumber <= studios.size()) {
                        logger.info(getName() + ", studio number \"" + studioNumber + "\" was rented for you! We are waiting for you!");
                        studioNumber = 1;
                    } else {
                        studioNumber = 0;
                        throw new WrongStudioNumberException();
                    }
                }
            } catch (WrongStudioNumberException ex) {
                logger.error(ex.getMessage());
            }
        }
        while (studioNumber == 0);
    }

    @Override
    public void rentPhotographer() {
        int i = 1;
        int number = 0;
        LinkedList<Photographer> photographers = InfoGeneration.GenerationPhotographerInfo();
        for (Photographer photographer : photographers) {
            logger.info(i + ". " + photographer);
            i++;
        }
        do {
            logger.info("To rent photographer enter photographer's number: ");
            Scanner number_ = new Scanner(System.in);
            if (number_.hasNextInt()) {
                number = number_.nextInt();
                if (number > 0 && number <= photographers.size()) {
                    logger.info(getName() + ", photographer " + photographers.get(--number).getName() + " " + photographers.get(number).getSurname() + " was rented! We are waiting for you!");
                    number = 1;
                } else {
                    number = 0;
                }
            }
        }
        while (number == 0);
    }

    @Override
    public void photoShoot(int studioNumbers) {
        int studioNumber = 0;
        LinkedList<Studio> studios = InfoGeneration.GenerationStudioInfo();
        for (Studio studio : studios) {
            logger.info(studio);
        }
        do {
            try {
                logger.info("To order photo shoot enter studio number: ");
                Scanner number_ = new Scanner(System.in);
                if (number_.hasNextInt()) {
                    studioNumber = number_.nextInt();
                    if (studioNumber > 0 && studioNumber <= studios.size()) {
                        logger.info(getName() + ", Thank you for ordering photo shoot(your studio number is " + studioNumber + ")! We are waiting for you!");

                        studioNumber = 1;
                    } else {
                        studioNumber = 0;
                        throw new WrongStudioNumberException();
                    }
                }
            } catch (WrongStudioNumberException ex) {
                logger.error(ex.getMessage());
            }
        }
        while (studioNumber == 0);
    }

    @Override
    public String toString() {
        return
                "{Name = " + getName() +
                        ", Surname = " + getSurname() +
                        ", Phone Number = " + getPhoneNumber() +
                        ", Age = " + getAge() +
                        ", Regular customer = " + isRegularCustomer() + "}";
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

    @Override
    public void callBack(Customer customer) {
        logger.info(" We will call you back soon to number " + customer.getPhoneNumber() + "! Thank you!");

    }
}
