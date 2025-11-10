package b.oop;

public class Intro {
    public static void main(String[] args) {
//        // 사각형 면적 구하기
//        int width = 100;
//        int height = 200;
//
//        int area = width * height;
//        System.out.println(area);
//
//        // 두 번째 사각형 만들기
//        int width2 = 10;
//        int height2 = 20;
//
//        int area2 = width2 * height2;
//        System.out.println(area2);

        // method

        int rec1 = calArea(10, 10 );
        int rec2 = calArea(20, 20 );
        int rec3 = calArea(30, 30 );

        System.out.println(rec1);

    }
    // 두번째 함수  함수는 독립적으로 존재하는 함수 / 클래스 안에 있는 함수를 메서드 라고 불림
    // 재사용하기 위해서 만드는 메서드
    // function calArea(width, height) { return width * heigth } <- javascript
    public static int calArea(int width, int height) {
        return width * height;
    }

}
