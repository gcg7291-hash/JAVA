package b.oop.practice;

public class Practice {
    public static void main(String[] args) {

        Person p1 = new Person("홍길동", 25);
        System.out.println(p1.name);
        System.out.println(p1.age);
        p1.printInfo();


        Dog d1 = new Dog("진돗개", "백구");
        d1.sit();
        d1.hand();

        Car car = new Car("Avante", 0);
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.printInfo();

        BankAccount ba = new BankAccount("국민", 0);
        ba.deposit(10000);
        ba.withdraw(3000);
        ba.getBalance();


        Counter count = new Counter();
        count.increment();
        count.increment();

        count.decrement();
        count.increment();

        count.getCount();
        count.reset();


    }
}
