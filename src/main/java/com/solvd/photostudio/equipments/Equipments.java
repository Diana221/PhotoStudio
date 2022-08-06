package com.solvd.photostudio.equipments;

import java.util.Objects;

public class Equipments {
    private boolean smokeMachines;
    private VideoCamera videoCamera;
    private PhotoCamera photoCamera;

    public Equipments() {
    }

    public Equipments(boolean smokeMachines, VideoCamera videoCamera, PhotoCamera photoCamera) {
        this.videoCamera = videoCamera;
        this.photoCamera = photoCamera;
        this.smokeMachines = smokeMachines;
    }

    public Equipments(boolean smokeMachines, VideoCamera videoCamera) {
        this.videoCamera = videoCamera;
        this.smokeMachines = smokeMachines;
    }

    public Equipments(boolean smokeMachines, PhotoCamera photoCamera) {
        this.photoCamera = photoCamera;
        this.smokeMachines = smokeMachines;
    }

    public Equipments(VideoCamera videoCamera) {
        this.videoCamera = videoCamera;
    }

    public Equipments(PhotoCamera photoCamera) {
        this.photoCamera = photoCamera;
    }

    public boolean isSmokeMachines() {
        return smokeMachines;
    }

    public void setSmokeMachines(boolean smokeMachines) {
        this.smokeMachines = smokeMachines;
    }

    public VideoCamera getVideoCamera() {
        return videoCamera;
    }

    public void setVideoCamera(VideoCamera videoCamera) {
        this.videoCamera = videoCamera;
    }

    public PhotoCamera getPhotoCamera() {
        return photoCamera;
    }

    public void setPhotoCamera(PhotoCamera photoCamera) {
        this.photoCamera = photoCamera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipments)) return false;
        Equipments equipment = (Equipments) o;
        return isSmokeMachines() == equipment.isSmokeMachines();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSmokeMachines());
    }
}
