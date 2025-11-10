package a.basic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 배열 선언, 크기 지정
        int[] numbers = new int[5];

        // 값 할당
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;


        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);



        // 배열 초기화
        // 선언 후 한칸씩 할당하는 방식
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        // 선언하는 동시에 초기화
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        // 생략
        int[] arr3 = {1, 2, 3, 4, 5};

        String[] names = {"Kim", "Lee", "Park"};

        System.out.println(names.length);


        int[] scores = {80, 40, 80, 90, 100};

        // index 접근
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // 요소 반복
        for (int score : scores) {
            System.out.println(score);
        }


        // 2차원 배열
//        int[][] matrix = new int[5][5];
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //System.out.println(matrix[0][0]);
        for (int i = 0; i < matrix.length; i++){
//            System.out.println(i);
            // matrix[i] 배열의 길이가 다를수 있기 때문에
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        int[][] jagged = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        for (int[] row: jagged){
            for (int item: row){
                System.out.println(item);
            }
        }


        // Array 유틸리티 클래스


        int[] nums = {5, 2, 1, 7, 8};

        System.out.println(Arrays.toString(nums));

        // 정렬
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));


        // 번호 찾기 , 정렬이 되어있는 상태에서만 사용 가능
        int idx = Arrays.binarySearch(nums, 7);
        System.out.println(idx);

        // 배열 챙기
        int[] filled = new int[10];
        Arrays.fill(filled, 99);
        System.out.println(Arrays.toString(filled));


        // 배열 복사
        int[] origin = {1, 2, 3, 4, 5};
        int[] copied = Arrays.copyOf(origin, origin.length);
        System.out.println(Arrays.toString(copied));

        // 주소만 복사
        int[] copied2 = origin;
        System.out.println(Arrays.toString(copied2));
        System.out.println();
        origin[0] = 100;

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copied));
        System.out.println(Arrays.toString(copied2));


        int[] ranged = Arrays.copyOfRange(origin, 1, 3);
        System.out.println(Arrays.toString(ranged));

        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 3};

        System.out.println(arrA == arrB);
        System.out.println(Arrays.equals(arrA, arrB));


        // 다차원 배열 비교할 때  deepTOString ,  다차원 비교 deepEquals
        int[][] mat = {
                {1, 2},
                {3, 4}
        };
        System.out.println(Arrays.deepToString(mat));


//        origin[99] = 100;



    }
}
