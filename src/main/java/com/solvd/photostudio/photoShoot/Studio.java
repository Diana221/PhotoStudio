package com.solvd.photostudio.photoShoot;

import java.util.Objects;

public class Studio {
    private int studioNumber;
    InteriorItems interiorItems;
    AdditionalServices additionalServices;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public StudioType getStudioType() {
        return studioType;
    }

    public void setStudioType(StudioType  studioType) {
        this.studioType = studioType;
    }

    @Override
    public String toString() {
        return "studio number=" + getStudioNumber() +
                ", studioType=" + getStudioType() +
                ", Interior Items=" + getInteriorItems() +
                ", Additional Services=" + getAdditionalServices() +
                ", price=" + getPrice();
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
