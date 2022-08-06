package com.solvd.photostudio.equipments;

import com.solvd.photostudio.abstractclassses.Camera;

import java.util.Objects;

public class VideoCamera extends Camera {
    private float shutterSpeed; //1.120 or 1.125

    public VideoCamera() {
    }

    public VideoCamera(String cameraType, char imageQuality, char colorSpace, char whiteBalance, float shutterSpeed) {
        super(cameraType, imageQuality, colorSpace, whiteBalance);
        this.shutterSpeed = shutterSpeed;
    }

    public float getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(float shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    @Override
    public String toString() {
        return
                "Camera Type='" + getCameraType() + '\'' +
                ", image Quality=" + getImageQuality() +
                ", color Space=" + getColorSpace() +
                ", white Balance=" + getWhiteBalance() +
                ", shutter speed=" + getShutterSpeed();
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
