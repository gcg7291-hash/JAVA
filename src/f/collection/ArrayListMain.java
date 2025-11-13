package f.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
//        String[] a = new String[10];
        ArrayList<String> l = new ArrayList<>();

        l.add("apple");
        l.add("orange");
        l.add("pear");
        System.out.println(l);
        l.add(2,"cherry");
        System.out.println(l);

        String f = l.get(1);
        System.out.println(f);

        l.set(2,"apple");
        System.out.println(l);

        l.remove(2);
        l.remove("apple");
        System.out.println(l);

        System.out.println(l.size());
        System.out.println(l.isEmpty());

        System.out.println(l.contains("orange"));


        ArrayList<Integer> intList = new ArrayList<>();
        intList.addAll(Arrays.asList(6, 2, 3, 7, 9, 3));
        System.out.println(intList);

        int index = intList.indexOf(3);
        System.out.println(index);

        int lastIndex = intList.lastIndexOf(3);
        System.out.println(lastIndex);


        // 부분 리스트 찾아보기
        List<Integer> subList = intList.subList(2, 5);
        System.out.println(subList);

//        intList.clear();
//        System.out.println(intList);

        Integer[] array = intList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        // ====================================

        System.out.println("for-each");
        for (Integer num : intList) {
            System.out.println(num);
        }
        System.out.println("\nindex for");
        for (int i = 0; i < intList.size(); i++){
            System.out.println(intList.get(i));
        }

        System.out.println("\n iterator");
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }

    }
}
