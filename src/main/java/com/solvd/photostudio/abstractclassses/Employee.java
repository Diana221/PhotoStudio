package com.solvd.photostudio.abstractclassses;

public abstract class Employee extends Person {
    private int experience;

    public Employee() {
    }

    public Employee(String name, String surname, String phoneNumber, int age, int experience) {
        super(name, surname, phoneNumber, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
