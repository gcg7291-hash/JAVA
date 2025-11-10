package c.oop2;



public class Util {
    String concat(String... Strings) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Strings.length; i++) {
            sb.append(Strings[i]);
            sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Util u = new Util();
        String result = u.concat("사과", "바나나", "포도", "딸기", "망고");
        System.out.println(result);
    }
}
