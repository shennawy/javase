package javase.oop.adv.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamOperations {
    public static void main(String[] args) {
        // map()
        System.out.println("******* Using Map **********");

        // Creating a list of Integers
        List<Integer> numList = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        // ex 1
        numList.stream().map(x -> x * 3).forEach(System.out::println);

        // ex 2
        System.out.println("ex 2 - maps");
        List<String> citiesList = Arrays.asList("Cairo", "Alex", "Mansoura");

        // ex 3
        System.out.println("ex 3 - maps");
        citiesList.stream().map(String::toUpperCase).forEach(System.out::println);

        citiesList.stream().map(s -> s.length()).forEach(System.out::println);

        // ex 1
        System.out.println("******** ex 1 - peak ****");
        // The Stream.peek() method is mainly to support debugging,
        // where you want to see the elements as they flow past a certain point in a pipeline.
        // Using peek without any terminal operation does nothing. like count
        Stream.of("bus", "car", "bycle", "flight",
                  "train").filter(e -> e.length() >
                                  3).peek(e -> System.out.println("Filtered value: " +
                                                                  e)).map(String::toUpperCase).peek(e -> System.out.println("Mapped value: " +
                                                                                                                            e)).count();


        // findFirst()
        System.out.println("*************** ex FindFirst() ********");
        //Stream.findFirst() method
        //There are cases where the business
        //specification requires the first element of a filtered stream to be fetched.
        citiesList = Arrays.asList("Sohag", "Cairo", "Alex", "Mansoura");
        Optional<String> city = citiesList.stream().filter(t -> t.contains("a")).findFirst();
        System.out.println("The First city : " + city.get());

        System.out.println("*************** ex FindAny() ********");

        //Stream.findAny() returns anyone element of the stream, or an no element if the stream is empty.
        // vary in parallel

        citiesList = Arrays.asList("Sohag", "Cairo", "Alex", "Mansoura");
        city = citiesList.stream().filter(t -> t.contains("a")).findAny();
        System.out.println("The First city : " + city.get());


        System.out.println("*************** ex allMatch() ********");

        List<Integer> numsList = Arrays.asList(3, 9, 5, 12, 18);

        // Check if all elements of stream
        // are divisible by 3 or not using
        boolean answer = numsList.stream().allMatch(n -> n % 3 == 0);
        // Displaying the result
        System.out.println(answer);

        System.out.println("*************** ex anyMatch() ********");
        answer = numsList.stream().anyMatch(n -> n % 3 == 0);
        // Displaying the result
        System.out.println(answer);

        System.out.println("*************** ex noneMatch() ********");
        answer = numsList.stream().noneMatch(n -> n % 3 == 0);
        // Displaying the result
        System.out.println(answer);


        System.out.println("*************** ex count() ********");
        numsList = Arrays.asList(3, 9, 5, 18);
        // storing the result in a variable.
        long total = numsList.stream().count();
        // Displaying the number of elements
        System.out.println("count : " + total);

        // ex 2
        numsList = Arrays.asList(3, 9, 3, 18, 3, 18);
        total = numsList.stream().distinct().count();
        // Displaying the number of elements
        System.out.println("count distinct : " + total);

        System.out.println("*************** ex sum() ********");
        numsList = Arrays.asList(3, 9, 3, 18, 3, 18);
        double sum = numsList.stream().mapToInt(i -> i).sum();
        // Displaying the number of elements
        System.out.println("sum  : " + sum);

        System.out.println("*************** ex max() ********");
        numsList = Arrays.asList(3, 9, 3, 18, 26, 3, 18);
        OptionalInt maxim = numsList.stream().mapToInt(i -> i).max();
        // Displaying the number of elements
        System.out.println("maxim  : " + maxim.getAsInt());


        System.out.println("*************** ex average() ********");
        numsList = Arrays.asList(3, 9, 3, 18, 3, 18, 3);
        OptionalDouble average = numsList.stream().mapToInt(i -> i).average();
        // Displaying the number of elements
        System.out.println("avg  : " + Math.round(average.getAsDouble() * 100) / 100.0);


        System.out.println("*************** ex sorted() ********");
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        System.out.println("The sorted stream is : ");
        // displaying the stream with elements
        // sorted in natural order
        list.stream().sorted().forEach(System.out::println);
        System.out.println("*** reverseee ***");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("*************** ex collect() ********");
        System.out.println("____________ Collect toList ___________");
        list = Arrays.asList(-9, -18, 0, 25, 4);
        List<Integer> backupList = list.stream().collect(Collectors.toList());
        backupList.forEach(bkp -> System.out.println(bkp));

        System.out.println("____________ Collect average  ___________");
        list = Arrays.asList(1, 2, 3, 4);
        Double result = list.stream().collect(Collectors.averagingInt(v -> v * 2));
        System.out.println("Average: " + result);

        System.out.println("____________ Collect joining  ___________");
        List<String> namesList = Arrays.asList("Ahmed", "Islam", "Marwa", "Heba");
        String namesListResult = namesList.stream().collect(Collectors.joining(", "));
        System.out.println("Joining Result: " + namesListResult);

        System.out.println("____________ Collect grouping by  ___________");
        namesList = Arrays.asList("Ahmed", "Islam", "Heba", "Marwa", "Heba", "Ahmed");
        Map<String, Long> map =
            namesList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("MAp : " + map);


        System.out.println("____________ Stream.of inline ___________");
        Stream.of("Monday", "Tuesday", "Wedensday",
                  "Thursday").filter(s -> s.startsWith("T")).forEach(s -> System.out.println("Matching Days: " + s));

    }
}
