package b.oop.practice;

public class Car {
    String model;
    int speed;

    public Car (String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void accelerate () {
        this.speed += 10;
        System.out.println("속도" + this.speed);
    }
    void brake () {
        this.speed -= 10;
        System.out.println("속도" + this.speed);
    }

    void printInfo () {
        System.out.println("모델"+this.model+","+"속도"+this.speed+"Km/h");
    }

}
