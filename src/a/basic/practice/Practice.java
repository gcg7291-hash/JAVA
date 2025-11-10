package a.basic.practice;

public class Practice {
    public static void main(String[] args) {

//        문제 1: 홀짝 판별
//        정수를 입력받아 홀수인지 짝수인지 판별하세요.
//
//                입력:
//
//        int num = 17;
//        예상 출력:
//
//        17은 홀수입니다.
        int num = 17;
        if (num % 2 == 0){
            System.out.println( num + "은 홀수 입니다.");
        } else {
            System.out.println( num + "은 짝수 입니다.");
        }

//        문제 2: 학점 계산
//        점수를 입력받아 학점을 출력하세요.
//
//        학점 기준:
//
//        90점 이상: A
//        80점 이상: B
//        70점 이상: C
//        60점 이상: D
//        60점 미만: F
//



        int score = 85;
//        Stirng grade;
        if (score >= 90){
            System.out.println("학점: A");
//            grade = "A";
        } else if (score >= 80) {
            System.out.println("학점: B");
        } else if (score >= 70) {
            System.out.println("학점: C");
        } else  if (score >= 60) {
            System.out.println("학점: D");
//        } else if (score < 60 ) {
            System.out.println("학점: E");
        }
//        System.out.println(grade);

//        문제 3: 윤년 판별
//        연도를 입력받아 윤년인지 판별하세요.
//
//        윤년 조건:
//
//        4로 나누어떨어지면서 100으로 나누어떨어지지 않거나
//        400으로 나누어떨어지는 해
        int year = 2024;
//        boolean isLeapYear;
        if ((year % 4 == 0 & year % 100 != 0) || year % 400 == 0){
            System.out.println("2024년은 윤년 입니다.");
//            isLeapYear = true;
        } else {
            System.out.println("2024년은 윤년 아닙니다.");
//            isLeapYear = false;
        }
//        if (isLeapYear){
//            System.out.println("윤년");
//        } else {
//            System.out.println("윤년아님");
//        }


//        문제 4: 삼각형 유효성 검사
//        세 변의 길이를 입력받아 삼각형을 만들 수 있는지 검사하세요.
//
//                삼각형 조건:
//
//        세 변의 길이가 모두 양수
//        가장 긴 변 < 나머지 두 변의 합

        int a = 3;
        int b = 4;
        int c = 5;
//        int a = 3, b = 4, c = 5;

        if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
            System.out.println("삼각형을 만들 수 있습니다.");
        } else {
            System.out.println("삼각형을 만들 수 없습니다.");
        }
//        if (a > 0 && b > 0 && c > 0) {
//            if ((a+b > c) && (c+b > a) && (c+a > b)) {
//                System.out.println("삼각형 가능");
//            } else {
//                System.out.println("삼각형 불가능");
//            }
//        } else {
//            System.out.println("음수가 포함");
//        }

//        문제 5: 계절 판별
//        월을 입력받아 계절을 출력하세요. switch 문을 사용하세요.
        int month = 7;
        String season = switch (month){
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            case 12 , 1, 2 -> "겨울";
            default -> "잘못된 월 입니다.";
        };
            System.out.println(month + "은 여름 입니다.");

//        문제 6: 요일 판별
//        요일 번호를 입력받아 평일/주말을 구분하세요. 향상된 switch 문을 사용하세요.
//
//        요일 번호:
//
//        1: 월요일
//        2: 화요일
//...
//        7: 일요일
        int day = 6;
        String days = switch (day) {
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "요일은 없습니다.";
        };
        System.out.println(day +":토요일은 주말 입니다.");
        String dayName = switch (day) {
            case 1,2,3,4,5 -> "평일";
            case 6,7 -> "주말";

            default -> "요일은 없습니다.";
        };
        System.out.println(day + dayName);



//        문제 7: BMI 계산 및 판정
//        키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고 판정하세요.
//
//        BMI 계산: 몸무게(kg) / (키(m) × 키(m))
//
//        판정 기준:
//
//        18.5 미만: 저체중
//        18.5 이상 23 미만: 정상
//        23 이상 25 미만: 과체중
//        25 이상: 비만
        double height = 175.0;
        double weight = 70.0;

        double height_m = height / 100.0;
        double bmi = weight/ (height_m * height_m);
        double bmi2 = Math.round(bmi * 100.0) / 100.0;

        if ( bmi2 < 18.5){
            System.out.println("BMI:" + bmi2 +"저체중 입니다.");
        } else if ( bmi2 < 23) {
            System.out.println("BMI:" + bmi2 + "정상 체중 입니다.");
        } else if ( bmi2 < 25) {
            System.out.println("BMI:" + bmi2 + "과체중 입니다.");
        } else {
            System.out.println("BMI:" + bmi2 + "비만 입니다.");
        }



//        문제 8: 최댓값 구하기
//        세 개의 정수 중 최댓값을 구하세요. if 문을 사용하세요.

        int a1 = 10;
        int b1 = 25;
        int c1 = 17;

        if (a1 >= b1 && a1 >= c1) {
            System.out.println("최대값:" + a1);
        } else if (b1 >= a1 && b1 >= c1) {
            System.out.println("최대값:" + b1);
        } else {
            System.out.println("최대값:" + c1 );
        }
//        int a = 10, b = 20, c  30;
//        int max = a;
//
//        if (b> max){
//            max =b;
//        }
//        if (c >max) {
//            max = c;
//        }
//        System.out.println(max);





//        문제 9: 시험 합격 여부
//        세 과목의 점수를 입력받아 합격 여부를 판단하세요.
//
//                합격 조건:
//
//        평균이 60점 이상
//        모든 과목이 40점 이상
        int math = 70;
        int english = 80;
        int science = 45;
        int totalScore = math + english + science;
        double avg = (double) totalScore / 3;
        System.out.println(avg);

        boolean goodScore = (math >= 40) && (english >= 40) && (science >= 40);
        boolean goodAvg = (avg >= 60);


//        int math = 70;
//        int english = 80;
//        int science = 45;
//
//        double avg = (math + english + science) / 3.0;
//        if ((avg >= 60) && ((math >= 40) && (english >= 40) && (science >= 40))) {
//            System.out.println("합격");
//        } else {
//            System.out.println("불합격");
//        }



//        문제 10: 할인율 계산
//        구매 금액에 따라 할인율을 적용하세요.
//
//                할인 기준:
//
//        10만원 이상: 10% 할인
//        5만원 이상: 5% 할인
//        5만원 미만: 할인 없음
//        추가: 회원이면 추가 5% 할인

        int price = 120000;
        boolean isMember = true;
        double rate = 0.0;

        if (price >= 100000) {
            rate += 0.10;
        } else if (price >= 50000) {
            rate += 0.05;
        }
        if (isMember) {
            rate += 0.05;
        }

        int finalDiscount = (int) (price * rate);
        int finalPrice = price - finalDiscount;

        System.out.println("원가: " + price + "원");
        System.out.println("할인율: " + (int)(rate * 100) + "%");
        System.out.println("최종 금액: " + finalPrice + "원");


//        int price = 120000;
//        boolean isMember = true;
//        int rate = 0;
//
//        if (price >= 100000) {
//            rate = 10;
//        } else if (price >= 50000) {
//            rate = 5;
//        }
//        if (isMember) {
//            rate += 5;
//        }
//        int rateAmount = price * rate / 100;
//        System.out.println(price - rateAmount);
    }
}
