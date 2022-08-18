package com.solvd.photostudio.photoShoot;

import java.util.Objects;

public class StudioType {
    private int hallsNumber;
    private String backgroundType;
    private Style style;

    public StudioType(int hallsNumber, String backgroundType, Style style) {
        this.hallsNumber = hallsNumber;
        this.backgroundType = backgroundType;
        this.style = style;
    }

    public int getHallsNumber() {
        return hallsNumber;
    }

    public void setHallsNumber(int hallsNumber) {
        this.hallsNumber = hallsNumber;
    }

    public String getBackgroundType() {
        return backgroundType;
    }

    public void setBackgroundType(String backgroundType) {
        this.backgroundType = backgroundType;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return

                "{style:" + getStyle() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudioType)) return false;
        StudioType that = (StudioType) o;
        return Objects.equals(getStyle(), that.getStyle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStyle());
    }

    public enum Style {
        casual,
        light,
        glamour,
        corporate,
        forest,
        wedding,
        fashion,
        birthday
    }
}
