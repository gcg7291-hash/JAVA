package d.inheritance.practice;

class Animal {
    String name;
    String age;

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.print(name + age + ":");
    }
}

class Lion  extends Animal {
    public Lion(String name, String age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name +" "+age+":" +" 어흥!");
    }
}
class Elephant extends Animal {
    public Elephant(String name, String age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name +" "+age+":" +" 뿌우우!");
    }
}
class Monkey extends Animal {
    public Monkey(String name, String age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name +" "+age+":" +" 끼끼!");
    }
}


public class Practice4 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("사자", "심바"),
                new Elephant("코끼리", "덤보"),
                new Monkey("원숭이", "조조"),
        };

        System.out.println("==== 먹이 시간 ====");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
