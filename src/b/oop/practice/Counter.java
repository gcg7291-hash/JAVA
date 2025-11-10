package b.oop.practice;

public class Counter {
    int count;

    public Counter() {
        this.count = 0;
    }

    void increment() {
        this.count++;
        System.out.println(this.count);
    }
    void decrement() {
        this.count--;
        System.out.println(this.count);
    }
    public int getCount() {
        return this.count;
    }
    void reset() {
        this.count = 0;
        System.out.println(this.count);
    }
}
