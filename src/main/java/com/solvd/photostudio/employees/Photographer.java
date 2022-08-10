package com.solvd.photostudio.employees;

import com.solvd.photostudio.abstractclassses.Employee;
import com.solvd.photostudio.abstractclassses.Person;
import com.solvd.photostudio.equipments.Equipments;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;


public class Photographer extends Employee {
    private Equipments equipments;
    private int price;
    private static final Logger logger = LogManager.getLogger(Photographer.class);
    public Photographer() {
    }

    public Photographer(String name, String surname, String phoneNumber, int age, Equipments equipments, int price, int experience) {
        super(name, surname, phoneNumber, age, experience);
        this.equipments = equipments;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void info() {
       logger.info("\nInformation about photographers");
    }

    @Override
    public String toString() {
        return
                        "{Name = " + getName() +
                        ", Surname = " + getSurname() +
                        ", PhoneNumber = " + getPhoneNumber() +
                        ", Age = " + getAge() +
                        ", Camera=" + getEquipments() +
                        ", price=" + getPrice() +
                        ", experience=" + getExperience()+ "}";
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

    public Equipments getEquipments() {
        return equipments;
    }

    public void setEquipments(Equipments equipments) {
        this.equipments = equipments;
    }
}
