package com.solvd.photostudio.agency;

import com.solvd.photostudio.customers.Model;
import com.solvd.photostudio.exceptions.WrongPhoneNumberException;
import com.solvd.photostudio.exceptions.WrongStudioNumberException;
import com.solvd.photostudio.interfaces.iBackCall;
import com.solvd.photostudio.interfaces.iPhotoShoot;
import com.solvd.photostudio.interfaces.iRent;
import com.solvd.photostudio.photoShoot.Studio;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class ModelingAgency implements iRent, iPhotoShoot, iBackCall {
    private String agencyName;
    private int phoneNumber;
    private Model[] models;

    private static final Logger logger = LogManager.getLogger(ModelingAgency.class);

    public ModelingAgency() {
    }

    public ModelingAgency(String agencyName, int phoneNumber, Model[] models) {
        this.agencyName = agencyName;
        this.phoneNumber = phoneNumber;
        this.models = models;
    }

    public Model[] getModel() {
        return models;
    }

    public void setModel(Model[] models) {
        this.models = models;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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
                logger.info(getAgencyName() + ", studio number \"" + studioNumber + "\" was rented for you3! We are waiting for you!");
                number.close();
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
                    logger.info(getAgencyName() + ", photographer " + photographerName + " " + photographerSurname + " was rented for you! We are waiting for you!");
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
                logger.info(getAgencyName() + ", Thank you for ordering photo shoot(your studio number is " + studioNumber + ")! We are waiting for you!");
                number.close();
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
                "AgencyName='" + getAgencyName() + '\'' +
                        ", PhoneNumber=" + getPhoneNumber() +
                        ", Models=" + Arrays.toString(getModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ModelingAgency)) return false;
        ModelingAgency that = (ModelingAgency) o;
        return getPhoneNumber() == that.getPhoneNumber() &&
                Objects.equals(getAgencyName(), that.getAgencyName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAgencyName(), getPhoneNumber());
    }
}
