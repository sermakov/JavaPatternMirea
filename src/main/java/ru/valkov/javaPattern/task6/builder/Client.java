package ru.valkov.javaPattern.task6.builder;

public class Client {
    private int age;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private int facility;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getFacility() {
        return facility;
    }

    public static class Builder {
        private Client client;

        public Builder() {
            client = new Client();
        }

        Builder age(int age) {
            client.age = age;
            return this;
        }

        Builder firstName(String firstName) {
            client.firstName = firstName;
            return this;
        }

        Builder lastName(String lastName) {
            client.lastName = lastName;
            return this;
        }

        Builder city(String city) {
            client.city = city;
            return this;
        }

        Builder street(String street) {
            client.street = street;
            return this;
        }

        Builder facility(int facility) {
            client.facility = facility;
            return this;
        }

        Client build() {
            return client;
        }
    }
}
