package javase.oop.adv.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestForEach {

    public static void main(String[] args) {
        List<Person> personsList =
            Arrays.asList(new Person(101, "Mahmoud", "Elshennawy", 23), new Person(102, "Muhammad", "Gamal", 23),
                          new Person(103, "Karim", "Rady", 23));

        System.out.println("*****Old for each*****");
        for (Person p : personsList) {
            System.out.println(p.getPersonFirstName());
        }


        System.out.println("*****Anonymous For Each*****");
        // Consumer is a functional interface
        // Generic casting to Person
        personsList.forEach(new Consumer<Person>() {

            @Override
            public void accept(Person p) {
                System.out.println(p.getPersonFirstName());
            }
        });

        System.out.println("*****Lambda For Each*****");
        personsList.forEach(p -> System.out.println(p.getPersonFirstName()));
    }

}
