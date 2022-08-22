package com.solvd.photostudio.agency;

import com.solvd.photostudio.customers.Model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Objects;


public class ModelingAgency {
    private static final Logger logger = LogManager.getLogger(ModelingAgency.class);
    private String agencyName;
    private int phoneNumber;
    private ArrayList<Model> models = new ArrayList<>();
    private boolean isOpen = false;

    public ModelingAgency() {
    }

    public ModelingAgency(String agencyName, int phoneNumber, ArrayList<Model> models, boolean isOpen) {
        this.agencyName = agencyName;
        this.phoneNumber = phoneNumber;
        this.models = models;
        this.isOpen = isOpen;
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


    private void  openOrClose() {
        String status;
        if(isOpen)
        {
            status = "open";
        }
        else
        {
            status = "close";
        }
        logger.info("Modeling Agency is " + status + " for now!");
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
