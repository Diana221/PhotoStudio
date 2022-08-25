package com.solvd.photostudio.customers;

import com.solvd.photostudio.abstractclassses.Person;
import com.solvd.photostudio.employees.Photographer;
import com.solvd.photostudio.enums.Sale;
import com.solvd.photostudio.exceptions.WrongStudioNumberException;
import com.solvd.photostudio.infogeneration.InfoGeneration;
import com.solvd.photostudio.interfaces.IBackCall;
import com.solvd.photostudio.interfaces.IPhotoShoot;
import com.solvd.photostudio.interfaces.IRent;
import com.solvd.photostudio.photoShoot.Studio;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Customer extends Person implements IRent, IBackCall, IPhotoShoot {
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
    public int rentStudio() {
        int studioNumber = 0;
        int n = 0;
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
                        n = studioNumber;
                        --n;
                        logger.info(getName() + ", studio number \"" + studioNumber + "\" was rented!");
                        logger.info("Information about studio: " + studios.get(n));
                        if (isRegularCustomer()) {
                            float salePrice = studios.get(n).getPrice() - (((float) studios.get(n).getPrice() / 100) * Sale.FIVE.getSale());
                            logger.info(getName() + ", as a regular customer you have a sale " + Sale.FIVE.getSale() + "%!. Your price for studio is " + (int) salePrice + "$ instead of " + studios.get(n).getPrice() + "$");
                        }
                        n = 1;
                    } else {
                        throw new WrongStudioNumberException();
                    }
                }
            } catch (WrongStudioNumberException ex) {
                logger.error(ex.getMessage());
            }
        }
        while (n == 0);
        return studioNumber;
    }

    @Override
    public String rentPhotographer() {
        String photographerName = null;
        String photographerSurname = null;
        int i = 1;
        int n;
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
                n = number;
                --n;
                if (number > 0 && number <= photographers.size()) {
                    photographerName = photographers.get(n).getName();
                    photographerSurname = photographers.get(n).getSurname();
                    logger.info(getName() + ", photographer " + photographerName + " " + photographerSurname +
                            " was rented! We are waiting for you!");
                    number = 1;
                } else {
                    number = 0;
                }
            }
        }
        while (number == 0);
        return "Photographer: " + photographerName + " " + photographerSurname;
    }

    @Override
    public String photoShoot() {
        int photographer = 0;
        String rentPhotographer = null;
        int studioNum;
        logger.info("Ordering photo shoot ");
        studioNum = rentStudio();
        logger.info(studioNum);
        do {
            try {
                logger.info("If you want to choose photographer enter 1, if you want default photographer enter 2: ");
                Scanner photographer_ = new Scanner(System.in);
                if (photographer_.hasNextInt()) {
                    photographer = photographer_.nextInt();
                    if (photographer == 1) {
                        rentPhotographer = rentPhotographer();
                        logger.info("Thank you for ordering photo shoot(your "
                                + rentPhotographer + "; number of studio is "
                                + studioNum + ")!");
                    } else if (photographer == 2) {
                        rentPhotographer = StringUtils.join(InfoGeneration.GenerationPhotographerInfo().get(0).getName(),
                                " ", InfoGeneration.GenerationPhotographerInfo().get(0).getSurname());
                        logger.info("Thank you for ordering photo shoot(your photographer is "
                                + rentPhotographer + "; number of studio is "
                                + studioNum + ")!");
                    }
                } else {
                    throw new WrongStudioNumberException();
                }
            } catch (WrongStudioNumberException ex) {
                logger.error(ex.getMessage());
            }
        }
        while (photographer == 0);
        return "Ordered photoshoot(studio number: " + studioNum + "; Photographer: " + rentPhotographer + ")";
    }

    @Override
    public String toString() {
        return
                        getName() +
                        " " + getSurname() +
                        "(" + getPhoneNumber() +
                        ") " + getAge() + " years old" +
                        ", Regular customer = " + isRegularCustomer();
    }

    @Override
    public void callBack(Customer customer) {
        logger.info(" We will call you back soon to number " + customer.getPhoneNumber() + "! Thank you!");
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
