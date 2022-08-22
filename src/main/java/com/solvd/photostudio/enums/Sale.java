package com.solvd.photostudio.enums;

public enum Sale {
    FIVE(5), TEN(10), FIFTEEN(15);
    private final int sale;

    private Sale(int sale) {
        this.sale = sale;
    }

    public int getSale() {
        return sale;
    }
}