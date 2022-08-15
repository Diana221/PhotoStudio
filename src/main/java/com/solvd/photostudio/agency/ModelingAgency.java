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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class ModelingAgency {
    private String agencyName;
    private int phoneNumber;
    private ArrayList<Model> models= new ArrayList<>();

    private static final Logger logger = LogManager.getLogger(ModelingAgency.class);

    public ModelingAgency() {
    }

    public ModelingAgency(String agencyName, int phoneNumber, ArrayList<Model> models) {
        this.agencyName = agencyName;
        this.phoneNumber = phoneNumber;
        this.models = models;
    }

    public ArrayList<Model> getModels() {
        return models;
    }

    public void setModels(ArrayList<Model> models) {
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
    public String toString() {
        return
                "AgencyName='" + getAgencyName() + '\'' +
                        ", PhoneNumber=" + getPhoneNumber() +
                        ", Models=" + getModels();
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
