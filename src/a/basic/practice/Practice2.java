package a.basic.practice;

public class Practice2 {
    public static void main(String[] args) {
//        문제 1: 구구단
//        2단부터 9단까지 구구단을 출력하세요.

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
            System.out.println(i + "X" + j + "=" + (i * j));
        }
            }

//        문제 2: 별 찍기 패턴 1
//        다음 패턴을 출력하세요.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
//        문제 3: 별 찍기 패턴 2
//        다음 패턴을 출력하세요.

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        문제 4: 별 찍기 패턴 3
//        다음 패턴을 출력하세요.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        문제 5: 약수 구하기
//        주어진 숫자의 모든 약수를 출력하세요.
        int num = 24;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
//        문제 6: 소수 판별
//        주어진 숫자가 소수인지 판별하세요.
//
//        소수: 1과 자기 자신으로만 나누어떨어지는 수
        int num1 = 17;
        boolean isPrime = true;

        for (int i = 2; i <= num1; i++) {
            if (num1 % i == 0) {

                isPrime = false;
            }
        }
        if (!isPrime) {
            System.out.println("소수 입니다.");
        } else {
            System.out.println("소수가 아닙니다");

        }



        System.out.println();
//        문제 7: 소수 판별 최적화
//        문제 6을 최적화하세요. 2부터 √num까지만 확인하면 됩니다.
//        int num1 =
        for (int i = 2; i * i < num1; i++) {
            if (num1 % i == 0) {
                System.out.println(i);
            }
        }

//        문제 8: 최대공약수 (GCD)
//        두 수의 최대공약수를 구하세요. 유클리드 호제법을 사용하세요.
//        유클리드 호제법:
//
//        gcd(a, b) = gcd(b, a % b)
//        a % b == 0이면 b가 최대공약수
        int a = 48;
        int b = 18;
        int originA = a, originB = b; //최소공약수

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
//        System.out.println(a); 최대공약수
        int gcd = a;  // 최소공약수
        System.out.println(originA * originB/ gcd);  //최소 공약수

//        문제 9: 최소공배수 (LCM)
//        두 수의 최소공배수를 구하세요.
//
//        공식: LCM(a, b) = (a × b) / GCD(a, b)
        int a1 = 12;
        int b1 = 18;

        while (b1 != 0) {
            int temp1 = b1;
            b1 = a1 * b1;
            a1 = temp1;
        }
        System.out.println(a1);
//        문제 10: 피보나치 수열
//        n번째 피보나치 수를 구하세요.
//
//        피보나치 수열: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

        int n = 10;
        int fib1 = 0;
        int fib2 = 1;
        int result = 0;

        for (int i = 2; i < n; i++) {
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }
        System.out.println(result);



//        문제 11: 팩토리얼
//        n!을 계산하세요.
          int n1 = 5;
          long fact = 1;
          for (int i = 1; i <= n1; i++) {
              fact = fact * i;
          }
        System.out.println(fact);

//        int n1 = 5;
//        int n2 = 1;
//        for (int i = 1; i <= n1; i++) {
//            n2 = n2 * i;
//        }
//        System.out.println(n1 + n2);

    //    문제 12: 역순 숫자 출력
    //    정수를 역순으로 출력하세요.

        int num3 = 12345;

        while (num3 > 0) {
            System.out.print(num3 % 10);
            num3 = num3 / 10;
        }
//        문제 13: 숫자 자릿수 합
//        정수의 각 자릿수를 더하세요.


        int num4 = 12345;
        int sum = 0;
        while (num4> 0) {
            int last  = num4 % 10;
            sum  = sum + last;
            num4 = num4 / 10; // 몫을 적는거
            System.out.print(sum);
        }
        System.out.println();



//        문제 14: 구구단 특정 단 건너뛰기
//        2단부터 9단까지 구구단을 출력하되, 5단은 건너뛰세요. continue를 사용하세요.
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if ( i == 5) {
                    continue;
                }
                System.out.println(i +"X"+ j + "=" + (i*j));

            }
        }

}
}
