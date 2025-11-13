package g.javaclass;

public class WrapperMain {
    public static void main(String[] args) {
        int primitive = 10;
        Integer wrapper = Integer.valueOf(primitive);
        System.out.println(wrapper);


        Integer wrapper2 = Integer.valueOf(20);
        int primitive2 =  wrapper.intValue();
        System.out.println(wrapper2);

        Integer wrapper3 = 10;
        int primitive3 = 10; // wrapper3 가능

//        Integer w = null;
//        int v = w;


        int parsed = Integer.parseInt("123");
        System.out.println(parsed);


        Integer a = 10;
        Integer b = 20;
        System.out.println(a.compareTo(b));

    }
}
