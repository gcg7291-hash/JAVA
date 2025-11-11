package d.inheritance;

class Animal7 {
    void eat() {
        System.out.println("eating");
    }
}

interface Swimmable {
    void swim();
}
interface Flyable{
    void fly();
}
interface Walkable{
    void walk();
}


class Duck extends Animal7 implements Swimmable, Flyable, Walkable{
    @Override
    public void fly() {
        System.out.println("오리날다");
    }

    @Override
    public void swim() {
        System.out.println("오리수영");
    }

    @Override
    public void walk() {
        System.out.println("오리 걷기");
    }

}

class Fish implements Swimmable{
    @Override
    public void swim() {
        System.out.println("물괴기 수영");
    }
}


public class MultiInterfaceMain {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();
        duck.swim();
        fish.swim();
        duck.fly();
        duck.walk();
        duck.eat();

    }
}
