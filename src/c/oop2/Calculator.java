package c.oop2;

import java.util.Arrays;

class Sample {
    int value;
}

public class Calculator {
    // 숫자를 반환
    int add (int a, int b){
        return a + b;
    }

    int add (int a, int b, int c){
        return a + b + c;
    }

    int add (int... numbers) {
        System.out.println("Adding"+ Arrays.toString(numbers));
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


    // 반환값이 없는 경우
    void printResult(int result) {
        System.out.println(result);
        // return;
    }
    // String 반환
    String printValue(int score) {
        if (score >= 50) {
            return "패스";
        } else {
            return "fail";
        }
    }

    int[] getArray() {
        return new int[]{1, 3, 5, 7, 9};
    }

    Sample getSample() {
    return new Sample();
    }

}
