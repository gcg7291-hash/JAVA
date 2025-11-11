package d.inheritance.practice2;

interface Drawable {
    void draw();
}

class Circle4 implements Drawable{
    private int radius;

    public Circle4(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름"+ radius + "인 원을 그립니다.");
    }
}

class Rectangle4 implements Drawable {
    private int width;
    private int height;
    public Rectangle4(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(width +"X"+height+" 사각형을 그립니다.");
    }
}

class Triangle4 implements Drawable {
    private int base, height;
    public Triangle4(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("밑변"+base+","+"높이"+height+" 인 삼각형을 그립니다.");
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Drawable[] shapes = {
                new Circle4(5),
                new Rectangle4(4, 6),
                new Triangle4(3, 4)
        };

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}
