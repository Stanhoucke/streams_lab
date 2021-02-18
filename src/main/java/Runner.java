import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<Person> hundredClub =
                Arrays.asList(
                        new Person("Mila", 4000000, "pink"),
                        new Person("Stan", 2500000, "powder midnight aubergine"),
                        new Person("Alex", 35, "pink")
                );

        // sort by first name
        List<Person> sortedByFirstName;
        sortedByFirstName = hundredClub
                .stream()
                .sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
                .collect(Collectors.toList());

        for (int i = 0; i < sortedByFirstName.size(); i++){
            System.out.println("Name " + i + ": " + sortedByFirstName.get(i).getName());
        }

        // showing the set of favourite colours
        List<String> favouriteColours;
        favouriteColours = hundredClub
                .stream()
                .map(person -> person.getFavColour())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Favourite Colours : " + favouriteColours);

        // displaying person with most cash
        Person richestPerson;
        richestPerson = hundredClub.stream().max(Comparator.comparing(Person::getCash)).get();
        System.out.println("Richest Person : " + richestPerson.getName());

        // is present in list
        boolean stanExists = hundredClub
                .stream()
                .anyMatch(person -> person.getName() == "Stan");
        System.out.println("Stans Existance? : " + stanExists);

        // showing if eveyone is rich in the list
        boolean cashStacks = hundredClub
                .stream()
                .allMatch(person -> person.getCash() > 1000);
        System.out.println("cash cash money money ya boi $$ : " + cashStacks);

        // totalling all the cash in the list
        int totalCash = hundredClub
                    .stream()
                .map(person -> person.getCash())
                .reduce(0, (sum, cash) -> sum += cash);
        System.out.println("Team SAM total stacks: " + totalCash);

    }
}
