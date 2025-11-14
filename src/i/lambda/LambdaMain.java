package i.lambda;

import java.util.Comparator;
import java.util.function.*;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaMain {
    public static void main(String[] args) {
        // 익명 함수
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
              return Integer.compare(a, b);
            };
        };

        Comparator<Integer> comparator2 = (a, b) -> Integer.compare(a,b);


        // 매개변수가 없는 형태
        Runnable task = () -> System.out.println("실행");
        task.run();

        // 매개변수가 한개인 경우
        Consumer<String> print = (String s)  -> System.out.println(s);
        print.accept("hello");

        // 매개변수가 두개인 경우
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(1,2));

        BiFunction<Integer, Integer, Integer> calc = (a, b) -> {
          int sum = a + b;
          return sum / 2;
        };
        System.out.println(calc.apply(5,10));

        Calculator cal = (a, b) -> a + b;
        System.out.println(cal.calculate(5,10));

        Calculator calc2 = (a, b) -> a * b;
        System.out.println(calc2.calculate(5,10));


        Supplier<String> s = () -> "Hello";
        System.out.println(s.get());

        Consumer<String> c = (str) -> System.out.println(str);
        c.accept("Hello");

        Function<String, Integer> f = (str) -> str.length();
        System.out.println(f.apply("Hello"));

        // 메서드 참조 ::
        Function<String, Integer> parser1 = (str) -> Integer.parseInt(str);

        Function<String, Integer> parser2 = Integer::parseInt;
        int result = parser2.apply("123");
        System.out.println(result);

        String prefix = "hihi";
        Function<String, String> geeter1 = name -> prefix.concat(name);
        String helloResult = geeter1.apply(" Kim");
        System.out.println(helloResult);

        Function<String, String> geeter2 = prefix::concat;;
        String helloResult2 = geeter2.apply("Kim");
        System.out.println(helloResult2);



    }
}
