package c.oop2;

public class MethodType {
    int instanceField = 10;
    static int staticField = 20;

    void instanceMethod(){
        System.out.println("인스턴스 입니다.");
        System.out.println("instanceField = " + instanceField);
        System.out.println("staticField = " + staticField);
    }

    static void staticMethod(){
        System.out.println("스태틱 입니다.");
        System.out.println("stacticfiled" + staticField);

    }

    public static void main(String[] args){
        MethodType mt = new MethodType();
        mt.instanceMethod();
        mt.staticMethod();

        MethodType.staticMethod();
//        MethodType.instanceMethod();

        }

}
