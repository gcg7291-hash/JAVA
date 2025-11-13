package g.javaclass;
import java.util.*;

public class MathRandomMain {
    public static void main(String[] args) {
        System.out.println(Math.min(10, 20));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(4));


        Random random = new Random();

        int num = random.nextInt(11, 13);
        System.out.println(num);


        int dice = random.nextInt(6 ) + 1;
        System.out.println(dice);

        //로또 추첨기

        System.out.println("=========로또 추첨기==========");
        HashSet<Integer> lotto = new HashSet<>();

        while (lotto.size() < 6) {
            int number = random.nextInt( 1, 46) ;
            lotto.add(number);
        }
        List<Integer> sortedLotto = new ArrayList<>(lotto);
        Collections.sort(sortedLotto);
        System.out.println(sortedLotto);


    }
}
