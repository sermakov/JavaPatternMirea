import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Human {
    private final int age;
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Имя:  %-16s Фамилия:  %-16s Возраст:  %-8d Дата рождения:  %-16s Вес:  %-4d",
                firstName, lastName, age, birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")), weight);
    }
}