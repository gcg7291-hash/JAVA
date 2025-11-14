package i.lambda;

import java.util.*;
import java.util.stream.*;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

//        System.out.println(list);

        int sum = 0;
        for (Integer i : list) {
            if ( i % 2 == 0) {
                System.out.println(i * i);
                sum += i* i;
            }
        }
        System.out.println(sum);

        int sum2 = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sum2);

        List<String> nameList = Arrays.asList("Kim", "Lee");
        Stream<String> nameStream = nameList.stream();
        System.out.println(nameStream);

        String[] nameArray = {"A", "B", "C"};
        Stream<String> nameStream2 = Arrays.stream(nameArray);
        System.out.println(nameStream2);


        List<Integer> numbers = Arrays.asList(6, 7 ,3 , 1 , 5 , 9 , 1);

        List<Integer> evens =numbers.stream()
                .filter((n) -> n % 2 == 0) // true, false 만 나와야함
                .collect(Collectors.toList());
        System.out.println(evens);

        List<Integer> geraterThan5 = numbers.stream()
                .filter((n) -> n > 5)
                .collect(Collectors.toList());
        System.out.println(geraterThan5);

        List<Integer> filtered =  numbers.stream()
                .filter((n) -> n > 5)
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filtered);

        List<String> words = Arrays.asList("Apple", "Banana", "Cherry");
        List<String> longWords = words.stream()
                .filter((s) -> s.length() > 5 )
                .collect(Collectors.toList());
        System.out.println(longWords);

        List<Integer> squares = numbers.stream()
                .map((n) -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);

        List<String> upper = words.stream()
                .map(String::toUpperCase )     // .map(s -> s.toUpperCase()) 람다
                .collect(Collectors.toList());
        System.out.println(upper);


        List<Integer> sorted = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);


        numbers.stream().forEach(System.out::println);

        System.out.println("===============");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap(s -> s + "-", String::length));
        System.out.println(map);


        int result = numbers.stream()
                .reduce(1, (a, b)-> a * b);
        System.out.println(result);

        long count = numbers.stream().count();
        System.out.println(count);



    }
}
