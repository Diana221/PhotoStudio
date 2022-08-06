package com.solvd.photostudio.abstractclassses;

public abstract class Camera {
    private String cameraType; // compact, bridge, DSLR and mirrorless cameras
    private char imageQuality; //RAW
    private char colorSpace; //sRGB
    private char whiteBalance; //Auto

    public Camera() {
    }

    public Camera(String cameraType, char imageQuality, char colorSpace, char whiteBalance) {
        this.cameraType = cameraType;
        this.imageQuality = imageQuality;
        this.colorSpace = colorSpace;
        this.whiteBalance = whiteBalance;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public char getImageQuality() {
        return imageQuality;
    }

    public void setImageQuality(char imageQuality) {
        this.imageQuality = imageQuality;
    }

    public char getColorSpace() {
        return colorSpace;
    }

    public void setColorSpace(char colorSpace) {
        this.colorSpace = colorSpace;
    }

    public char getWhiteBalance() {
        return whiteBalance;
    }

    public void setWhiteBalance(char whiteBalance) {
        this.whiteBalance = whiteBalance;
    }
}
