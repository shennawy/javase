package javase.oop.adv.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestPersonBuilder {
    public static void main(String[] args) {
        Person p1 =
            new Person.Builder().setGivenName("Mahmoud").setAddress("Cairo").setAge(20).setCity("Blah").setPhone("010").build();

        System.out.println("Example on builder design pattern");
        p1.print();

        List<Person> personsList = Person.createShortList();

        System.out.println("Old For Each");
        for (Person p : personsList) {
            p.print();
        }

        System.out.println("Collection For Each Anonymous");
        personsList.forEach(new Consumer<Person>() {
            public void accept(Person p) {
                p.print();
            }
        });

        System.out.println("Collection For Each Lambda");
        personsList.forEach(p -> p.print());

        System.out.println("Collection For Each Anonymous With Filtering");
        personsList.stream().filter(new Predicate<Person>() {

            @Override
            public boolean test(Person p) {
                if (p.getGivenName().startsWith("J")) {
                    return true;
                } else
                    return false;
            }
        }).forEach(new Consumer<Person>() {

            @Override
            public void accept(Person p) {
                p.print();
            }
        });

        System.out.println("Collection For Each Lambda with Filtering");
        personsList.stream().filter(p -> p.getGivenName().startsWith("J")).forEach(p -> p.print());

    }


}
