package d.inheritance.practice2;

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck implements Swimmable, Flyable{
    private String name;
    public Duck(String name) {
        this.name = name;
    }
    @Override
    public void swim() {
        System.out.println(name + "이(가) 수영합니다.");
    }
    @Override
    public void fly() {
        System.out.println(name + "이(가) 날아갑니다.");
    }
}

class Fish implements Swimmable{
    private String name;
    public Fish(String name) {
        this.name = name;
    }
    @Override
    public void swim() {
        System.out.println(name + " 이(가) 헤엄칩니다.");
    }
}

class Bird6 implements Flyable{
    private String name;
    public Bird6(String name) {
        this.name = name;
    }
    @Override
    public void fly() {
        System.out.println(name + "이(가) 하늘을 날아갑니다.");
    }
}

public class Practice6 {
    public static void main(String[] args) {
        Duck duck = new Duck("오리");
        duck.swim();
        duck.fly();
        System.out.println();

        Fish fish = new Fish("물고기");
        fish.swim();
        System.out.println();

        Bird6 bird = new Bird6("참새");
        bird.fly();
    }

}
