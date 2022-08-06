package com.solvd.photostudio.photoShoot;

import java.util.Objects;

public class InteriorItems {
    private boolean panoramicWindows;
    private boolean fireplace;
    private boolean carpet;
    private boolean sofa;

    public InteriorItems() {
    }

    public InteriorItems(boolean panoramicWindows, boolean fireplace, boolean carpet, boolean sofa) {
        this.panoramicWindows = panoramicWindows;
        this.fireplace = fireplace;
        this.carpet = carpet;
        this.sofa = sofa;
    }

    public boolean isPanoramicWindows() {
        return panoramicWindows;
    }

    public void setPanoramicWindows(boolean panoramicWindows) {
        this.panoramicWindows = panoramicWindows;
    }

    public boolean isFireplace() {
        return fireplace;
    }

    public void setFireplace(boolean fireplace) {
        this.fireplace = fireplace;
    }

    public boolean isCarpet() {
        return carpet;
    }

    public void setCarpet(boolean carpet) {
        this.carpet = carpet;
    }

    public boolean isSofa() {
        return sofa;
    }

    public void setSofa(boolean sofa) {
        this.sofa = sofa;
    }

    @Override
    public String toString() {
        return "Panoramic Windows=" + isPanoramicWindows() +
                ", fireplace=" + isFireplace() +
                ", carpet=" + isCarpet() +
                ", sofa=" + isSofa();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InteriorItems)) return false;
        InteriorItems that = (InteriorItems) o;
        return isPanoramicWindows() == that.isPanoramicWindows();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPanoramicWindows());
    }
}

