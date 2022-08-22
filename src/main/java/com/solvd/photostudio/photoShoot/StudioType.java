package com.solvd.photostudio.photoShoot;

public class StudioType {
    private int hallsNumber;
    private String backgroundType;
    private String style;

    public StudioType(int hallsNumber, String backgroundType, String style) {
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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return
                "{style:" + getStyle() + "}";
    }



}
