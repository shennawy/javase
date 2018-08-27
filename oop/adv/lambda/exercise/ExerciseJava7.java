package javase.oop.adv.lambda.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javase.oop.adv.lambda.Person;

public class ExerciseJava7 {

    public static void main(String[] args) {

        List<Person> personsList =
            Arrays.asList(new Person(101, "Mahmoud", "Elshennawy", 23), new Person(102, "Muhammad", "Gamal", 23),
                          new Person(103, "Karim", "Rady", 23));

        System.out.println("Before .sort");
        System.out.println("*****First Name A*****");
        printPersonsConditional(personsList, new Conditional() {

            @Override
            public boolean validate(Person p) {

                return p.getPersonFirstName().startsWith("A");
            }
        });
        System.out.println("*****All list*****");
        printAllPersons(personsList);

        personsList.sort(new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                return p1.getPersonFirstName().compareTo(p2.getPersonFirstName());
            }
        });

        System.out.println("After .sort");
        System.out.println("*****First Name A*****");
        // Lambda
        printPersonsConditional(personsList, p -> p.getPersonFirstName().startsWith("A"));
        System.out.println("*****All list*****");
        printAllPersons(personsList);

    }

    private static void printPersonsConditional(List<Person> personsList, Conditional condition) {
        for (Person p : personsList) {
            if (condition.validate(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printAllPersons(List<Person> personsList) {
        for (Person p : personsList) {
            System.out.println(p);
        }
    }

    interface Conditional {
        boolean validate(Person p);
    }

}
