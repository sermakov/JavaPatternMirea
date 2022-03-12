package ru.valkov.javaPattern.task6.prototype;

public class ModernHuman extends CloneableHuman {
    private String lastName;
    private String city;
    private String street;
    private int facility;

    public ModernHuman(int age, String firstName, String lastName, String city, String street, int facility) {
        super(age, firstName);
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.facility = facility;
    }

    @Override
    CloneableHuman copy() {
        return new ModernHuman(age, firstName, lastName, city, street, facility);
    }
}
