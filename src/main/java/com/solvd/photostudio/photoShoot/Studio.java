package com.solvd.photostudio.photoShoot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

public class Studio {
    private static final Logger logger = LogManager.getLogger(Studio.class);
    LinkedList<InteriorItems> interiorItems;
    Stack<AdditionalServices> additionalServices;
    private int studioNumber;
    private HashSet<StudioType> studioType;//location
    private int price;

    public Studio() {
    }

    public Studio(int studioNumber, HashSet<StudioType> studioType, int price, LinkedList<InteriorItems> interiorItems, Stack<AdditionalServices> additionalServices) {
        this.studioNumber = studioNumber;
        this.studioType = studioType;
        this.price = price;
        this.interiorItems = interiorItems;
        this.additionalServices = additionalServices;
    }

    public static <T> void show(T message) {
        logger.info("Your notes: "+message);
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public void setStudioNumber(int studioNumber) {
        this.studioNumber = studioNumber;
    }

    public LinkedList<InteriorItems> getInteriorItems() {
        return interiorItems;
    }

    public void setInteriorItems(LinkedList<InteriorItems> interiorItems) {
        this.interiorItems = interiorItems;
    }

    public Stack<AdditionalServices> getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(Stack<AdditionalServices> additionalServices) {
        this.additionalServices = additionalServices;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HashSet<StudioType> getStudioType() {
        return studioType;
    }

    public void setStudioType(HashSet<StudioType> studioType) {
        this.studioType = studioType;
    }

    @Override
    public String toString() {
        return "{Studio number=" + getStudioNumber() +
                ", studioType=" + getStudioType() +
                ", Interior Items=" + getInteriorItems() +
                ", Additional Services=" + getAdditionalServices() +
                ", price=" + getPrice() + "}";
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
