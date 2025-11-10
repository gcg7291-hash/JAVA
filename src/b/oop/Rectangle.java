package b.oop;

// 인스턴스 화
public class Rectangle {

    // public 접근 제어자
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int area(){
        return this.width * this.height;
    }

}
