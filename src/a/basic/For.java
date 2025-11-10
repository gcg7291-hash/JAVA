package a.basic;

public class For {
    public static void main(String[] args) {
        for ( int i = 0; i < 10 ; i++ ) {
            System.out.println(i);
        }
        System.out.println();
        for ( int i = 10; i >= 1; i-- ) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < 10; i += 3 ) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0, j = 10; i < j; i++, j-- ) {
            System.out.println(i);
            System.out.println(j);
        }
        System.out.println();
        // 구구단 2단
        int dan = 2;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan +"X" +  i + " = " + (dan * i));
        }

        System.out.println();
        // 구구단 2단 ~ 9단 까지
        for (int i = 2; i <= 9; i++){
//            System.out.println(i);
            for (int j = 1; j <= 9; j++){
                System.out.println(i +"X" +  j + " = " + (i * j));
            }
        }
        System.out.println();
        // while
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }

        // do - while
        int j = 0;

        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        System.out.println();

        // enhanced for

        // 전통적인 for 문
        int[] numbers = {10, 11, 12, 13};

        for (i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // 향상된 for문
        for (int number : numbers){
            System.out.println(number);
        }

        System.out.println();

        int[] nums = {1, 2, 3};
        // 값이 변경 되지 않음
        for (int num : nums){
            // int num = 1
            num = num * 3;
        }

        for (int num : nums){
            System.out.println(num);
        }

        // 직접 접근방식 값을 변경하려며 일반 for문
        for (int a = 0; a < nums.length ; a++) {
            nums[a] = nums[a] * 3;
        }
        for (int num : nums){
            System.out.println(num);
        }

        System.out.println();
        // break
        for (int z = 0; z < 10; z++){
            System.out.println(z);
            if(z == 5) {
                break;
            }
        }

        // continue
        for (int z = 0; z < 10; z++){
            if (z % 2 == 0) {
                continue;
            }
            System.out.println(z);
        }

        //

        outer:
        for ( int x = 2; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                if (x > 4) {
                    break outer;
                }
                System.out.println(x + "X" + y + " = " + (x * y));
            }
        }

    }
}
