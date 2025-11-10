package a.basic.practice;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {


        // 문제 1
        int[] numbers = {45, 23, 78, 12, 89, 34};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);



        // 문제 2
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 하나씩 빼기
//        int[] revers = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            revers[i] = arr[arr.length - i -1];
//        }
//        System.out.println(Arrays.toString(revers));

        // 번갈아 가며 위치 바꾸기
        int left = 0;
        int rigtht = arr.length - 1;

        int temp = arr[left];
        arr[left] = arr[rigtht];
        arr[rigtht] = temp;
      while (left < rigtht) {
           temp = arr[left];
          arr[left] = arr[rigtht];
          arr[rigtht] = temp;

          left++;
          rigtht--;
      }
        System.out.println(Arrays.toString(arr));


        // 문제 3
        int[] arr2 = {10, 20, 30, 40, 50};
        int target = 30;
        int result = -1;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == target) {
               result = i;
                break;
            }
        }
        System.out.println(result);

        // 문제 4
        int[] arr3 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 10};

        // 가장 큰 수 찾기
        int max4 = arr3[0];
        for ( int num : arr3){
            if (num > max4){
                max4 = num;
            }
        }

        // 카운트 배열 뒤에 숫자가 나오면 빈공간이 많이 생겨서 비효율적
        int[] count = new int[max4 + 1];

        // 갯수 카운팅
        for (int num : arr3){
            count[num]++;
        }
        System.out.println(Arrays.toString(count));

        // 문제 5
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
              sum += matrix[i][j];
          }
        }
        System.out.println(sum);

        // 문제 6
        int[] arr4 = {45, 23, 78, 12, 89, 34};
        int max2 = arr4[0];
        int second = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max2) {
                second = max2; // 두번쨰 큰수
                max2 = arr4[i]; // 첫번째 큰수
            } else if (arr4[i] > second && arr4[i] != max2) {
                second = arr4[i];
            }
        }
        System.out.println(second);
    }
}
