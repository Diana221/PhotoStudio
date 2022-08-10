package com.solvd.photostudio.photoShoot;

import java.util.Objects;

public class AdditionalServices {
    private boolean parking;
    private boolean wiFi;
    private boolean conditioner;
    private boolean dressingRoom;
    private boolean makeUp;

    public AdditionalServices() {
    }

    public AdditionalServices(boolean parking, boolean wiFi, boolean conditioner, boolean dressingRoom, boolean makeUp) {
        this.parking = parking;
        this.wiFi = wiFi;
        this.conditioner = conditioner;
        this.dressingRoom = dressingRoom;
        this.makeUp = makeUp;
    }

    public boolean isDressingRoom() {
        return dressingRoom;
    }

    public void setDressingRoom(boolean dressingRoom) {
        this.dressingRoom = dressingRoom;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean iswiFi() {
        return wiFi;
    }

    public void setwiFi(boolean wiFi) {
        wiFi = wiFi;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    public boolean isMakeUp() {
        return makeUp;
    }

    public void setMakeUp(boolean makeUp) {
        this.makeUp = makeUp;
    }

    @Override
    public String toString() {
        return
                        "{Parking=" + isParking() +
                        ", WiFi=" + iswiFi() +
                        ", conditioner=" + isConditioner() +
                        ", dressingRoom=" + isDressingRoom() +
                        ", makeUp=" + isMakeUp() +"}";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdditionalServices)) return false;
        AdditionalServices that = (AdditionalServices) o;
        return iswiFi() == that.iswiFi() &&
                isConditioner() == that.isConditioner();
    }

    @Override
    public int hashCode() {
        return Objects.hash(iswiFi(), isConditioner());
    }
}
