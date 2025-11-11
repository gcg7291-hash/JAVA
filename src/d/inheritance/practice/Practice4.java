package d.inheritance.practice;

class Animal {
    String name;
    String age;

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.print("sound");
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

class Zoo {
    Animal[] animals;
    int count;

    public Zoo(int capcity) {
        this.animals = new Animal[capcity];
        this.count = 0;
    }

    void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        }
    }

    public void feedingTime() {
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }

}

public class Practice4 {
    public static void main(String[] args) {

        Zoo z = new Zoo(10);
        z.addAnimal(new Lion ("사자", "심바"));
        z.addAnimal(new Elephant ("코끼리", "덤보"));
        z.addAnimal(new Monkey("원숭이", "조조"));
        z.feedingTime();
    }
}
