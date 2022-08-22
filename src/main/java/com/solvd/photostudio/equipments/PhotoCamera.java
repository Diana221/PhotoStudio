package com.solvd.photostudio.equipments;

import com.solvd.photostudio.abstractclassses.Camera;
import com.solvd.photostudio.enums.SceneMode;

import java.util.Objects;

public class PhotoCamera extends Camera {
    private SceneMode sceneMode; //Landscape or Portrait

    public PhotoCamera() {
    }

    public PhotoCamera(String cameraType, String imageQuality, String colorSpace, String whiteBalance, SceneMode sceneMode) {
        super(cameraType, imageQuality, colorSpace, whiteBalance);
        this.sceneMode = sceneMode;
    }

    public SceneMode getSceneMode() {
        return sceneMode;
    }

    public void setSceneMode(SceneMode sceneMode) {
        this.sceneMode = sceneMode;
    }

    @Override
    public String toString() {
        return "PhotoCamera:{" +
                "Camera Type=" + getCameraType() +
                ", image Quality=" + getImageQuality() +
                ", color Space=" + getColorSpace() +
                ", white Balance=" + getWhiteBalance() +
                ", picture style =" + getSceneMode() + "}";
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
