package com.solvd.photostudio.equipments;

import com.solvd.photostudio.abstractclassses.Camera;

import java.util.Objects;

public class PhotoCamera extends Camera {
    private String pictureStyle; //Landscape or Portrait

    public PhotoCamera() {
    }

    public PhotoCamera(String cameraType, char imageQuality, char colorSpace, char whiteBalance, String pictureStyle) {
        super(cameraType, imageQuality, colorSpace, whiteBalance);
        this.pictureStyle = pictureStyle;
    }

    public String getPictureStyle() {
        return pictureStyle;
    }

    public void setPictureStyle(String pictureStyle) {
        this.pictureStyle = pictureStyle;
    }

    @Override
    public String toString() {
        return
                "Camera Type='" + getCameraType() + '\'' +
                ", image Quality=" + getImageQuality() +
                ", color Space=" + getColorSpace() +
                ", white Balance=" + getWhiteBalance() +
                ", picture style =" + getPictureStyle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Camera)) return false;
        Camera camera = (Camera) o;
        return Objects.equals(getCameraType(), camera.getCameraType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCameraType());
    }
}
