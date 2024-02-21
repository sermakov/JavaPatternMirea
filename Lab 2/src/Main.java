import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> peopleList = getPeople();

        printDelimiter();
        peopleList
                .forEach(System.out::println);
        printDelimiter();

        peopleList.stream()
                .limit(5)
                .forEach(System.out::println);
        printDelimiter();

        peopleList.stream()
                .limit(5)
                .sorted((Human h1, Human h2) -> {
                    return h1.getBirthDate().compareTo(h2.getBirthDate());
                })
                .forEach(System.out::println);
        printDelimiter();

        peopleList.stream()
                .limit(5)
                .sorted((Human h1, Human h2) -> {
                    return h1.getBirthDate().compareTo(h2.getBirthDate());
                })
                .filter(human -> human.getWeight() < 60)
                .forEach(human -> System.out.println(human.getFirstName() + " " + human.getLastName()));
        printDelimiter();
    }

    private static List<Human> getPeople() {
        List<Human> peopleList = new ArrayList<>();
        peopleList.add(new Human(
                16,
                "Anton",
                "Smirnov",
                LocalDate.of(2008, 1, 15),
                60));
        peopleList.add(new Human(
                20,
                "Igor",
                "Zholobov",
                LocalDate.of(2004, 2, 7),
                58));
        peopleList.add(new Human(
                21,
                "Andrew",
                "Lukashenko",
                LocalDate.of(1993, 3, 10),
                96));
        peopleList.add(new Human(
                20,
                "Matvei",
                "Frolov",
                LocalDate.of(2004, 3, 10),
                76));
        peopleList.add(new Human(
                18,
                "Victoria",
                "Kazakova",
                LocalDate.of(2005, 9, 27),
                56));
        peopleList.add(new Human(
                16,
                "Pavel",
                "Fedoseev",
                LocalDate.of(2008, 1, 15),
                69));
        peopleList.add(new Human(
                20,
                "Artyom",
                "Agapkin",
                LocalDate.of(2004, 1, 16),
                69));
        peopleList.add(new Human(
                19,
                "Sergey",
                "Smirnov",
                LocalDate.of(2004, 6, 26),
                69));
        peopleList.add(new Human(
                37,
                "Michael",
                "Terry",
                LocalDate.of(1985, 11, 12),
                69));
        return peopleList;
    }

    private static void printDelimiter() {
        System.out.println("*".repeat(112));
    }
}