package javase.oop.adv.lambda.exercise;

import java.util.Arrays;
import java.util.List;

import java.util.function.BiConsumer;

import java.util.function.Consumer;
import java.util.function.Predicate;

import javase.oop.adv.lambda.Person;

public class ExerciseJava8Functional {
    public static void main(String[] args) {

        List<Person> personsList =
            Arrays.asList(new Person(101, "Ahmed", "Elshennawy", 23), new Person(102, "Kmmar", "Gamal", 23),
                          new Person(103, "Amr", "Ahmed", 23));

        System.out.println("Before .sort");
        personsList.sort((p1, p2) -> p1.getPersonFirstName().compareTo(p2.getPersonFirstName()));
        System.out.println("After .sort");

        System.out.println("*****All list*****");
        printPersonsConditional(personsList, p -> true, p -> System.out.println(p));


        System.out.println("*****First Name A*****");
        printPersonsConditional(personsList, p -> p.getPersonFirstName().startsWith("A"),
                                p -> System.out.println(p.getPersonFirstName()));


        System.out.println("*****Last Name A*****");
        // Lambda
        printPersonsConditional(personsList, p -> p.getPersonLastName().startsWith("A"),
                                p -> System.out.println(p.getPersonLastName()));
        //System.out.println("*****All list*****");
        //  printPersonsConditional(personsList, p -> true, p->System.out.println(p.getPersonAge()));

    }

    private static void printPersonsConditional(List<Person> personsList, Predicate<Person> predicate,
                                                Consumer<Person> consume) {
        for (Person p : personsList) {
            if (predicate.test(p)) {
                consume.accept(p);
            }
        }
        /* private static void printPersonsConditional(List<Person> personsList, Conditional condition,
                                                PrintCondition printCondition) {
        for (Person p : personsList) {
            if (condition.validate(p)) {
               printCondition.performPrinting(p);
            }
        }
    }*/

        // interface Conditional {
        //   boolean validate(Person p);
        //}

        //interface PrintCondition {
        //  void performPrinting(Person p);
        //}

    }
}
