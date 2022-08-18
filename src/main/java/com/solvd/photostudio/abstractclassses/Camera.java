package com.solvd.photostudio.abstractclassses;

public abstract class Camera {
    private String cameraType; // compact, bridge, DSLR and mirrorless cameras
    private String imageQuality; //RAW
    private String colorSpace; //sRGB
    private String whiteBalance; //Auto

    public Camera() {
    }

    public Camera(String cameraType, String imageQuality, String colorSpace, String whiteBalance) {
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

    public String getImageQuality() {
        return imageQuality;
    }

    public void setImageQuality(String imageQuality) {
        this.imageQuality = imageQuality;
    }

    public String getColorSpace() {
        return colorSpace;
    }

    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    public String getWhiteBalance() {
        return whiteBalance;
    }

    public void setWhiteBalance(String whiteBalance) {
        this.whiteBalance = whiteBalance;
    }
}
