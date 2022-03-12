package ru.valkov.javaPattern.task6.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClientBuilderTest {
    @Test
    public void itShouldBuildClient() {
        // given
        int age = 19;
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String city = "Moscow";
        String street = "Prospect Pupkina";
        int facility = 13;

        // when
        Client.Builder builder = new Client.Builder();
        Client client = builder
                .age(age)
                .firstName(firstName)
                .lastName(lastName)
                .city(city)
                .street(street)
                .facility(facility)
                .build();

        // then
        Assertions.assertEquals(age, client.getAge());
        Assertions.assertEquals(firstName, client.getFirstName());
        Assertions.assertEquals(lastName, client.getLastName());
        Assertions.assertEquals(city, client.getCity());
        Assertions.assertEquals(street, client.getStreet());
        Assertions.assertEquals(facility, client.getFacility());
    }
}