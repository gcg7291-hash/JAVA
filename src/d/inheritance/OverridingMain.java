package d.inheritance;

class Parent {
    void show () {
        System.out.println("Parent!!!!");
    }
    final void display () {
        System.out.println("display!!!!");
    }
}
class Child extends Parent {
    @Override // 어노테이션 부모가 만들어놓은걸 덮어서 사용한거
    void show  () {
        System.out.println("Child!!!!");
    }

//    @Override
//    void display () {
//        System.out.println("Child display!!!!");
//    }


}



public class OverridingMain {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
    }
}
