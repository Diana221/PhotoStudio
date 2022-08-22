package com.solvd.photostudio.customers;

import com.solvd.photostudio.abstractclassses.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Model extends Person {
    private int experience;

    private static final Logger logger = LogManager.getLogger(Model.class);

    public Model() {
    }

    public Model(String name, String surname, String phoneNumber, int age, int experience) {
        super(name, surname, phoneNumber, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void info() {
       logger.info("\nInformation about model: ");
    }

    @Override
    public String toString() {
        return
                "{Name=" + getName() +
                ", Surname = " + getSurname() +
                ", Phone Number = " + getPhoneNumber() +
                ", Age = " + getAge() +
                ", Experience =" + getExperience()+ "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        System.out.print("Namesake: ");
        return Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }
}
