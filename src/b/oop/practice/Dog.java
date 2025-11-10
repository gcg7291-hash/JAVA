package b.oop.practice;

public class Dog {
    String name;
    String name2;

    public Dog (String name, String name2) {
        this.name = name;
        this.name2 = name2;
    }
    void sit (){
        System.out.println(this.name+" "+this.name2+"가 앉았습니다.");
    }
    void hand () {
        System.out.println(this.name+" "+this.name2+"가 손을 내밀었습니다.");
    }
}
