package com.solvd.photostudio.photoShoot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Studio {
    private static final Logger logger = LogManager.getLogger(Studio.class);
    InteriorItems interiorItems;
    AdditionalServices additionalServices;
    private int studioNumber;
    private StudioType studioType;//location
    private int price;

    public Studio() {
    }

    public Studio(int studioNumber, StudioType studioType, int price, InteriorItems interiorItems, AdditionalServices additionalServices) {
        this.studioNumber = studioNumber;
        this.studioType = studioType;
        this.price = price;
        this.interiorItems = interiorItems;
        this.additionalServices = additionalServices;
    }

    public static <T> void show(T message) {
        logger.info("Your notes: " + message);
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public void setStudioNumber(int studioNumber) {
        this.studioNumber = studioNumber;
    }

    public InteriorItems getInteriorItems() {
        return interiorItems;
    }

    public void setInteriorItems(InteriorItems interiorItems) {
        this.interiorItems = interiorItems;
    }

    public AdditionalServices getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(AdditionalServices additionalServices) {
        this.additionalServices = additionalServices;
    }

    public StudioType getStudioType() {
        return studioType;
    }

    public void setStudioType(StudioType studioType) {
        this.studioType = studioType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Studio number=" + getStudioNumber() +
                ", studioType=" + getStudioType() + ", "
                + getPrice() + "$";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studio)) return false;
        Studio studio = (Studio) o;
        return getPrice() == studio.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice());
    }
}
