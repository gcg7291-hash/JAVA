package f.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple" , 1000);
        map.put("Banana", 2000);
        map.put("Cherry" , 3000);
        System.out.println(map);

        int price = map.get("Apple");
        System.out.println(price);

        System.out.println(map.containsKey("Banana"));
        System.out.println(map.containsValue(2000));

        map.put("Apple", 5000);
        System.out.println(map);

        map.remove("Banana");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
//        map.clear();
        System.out.println(map.isEmpty());

        System.out.println(map.get("Durian"));
        System.out.println(map.getOrDefault("Durian", 0));
        if (map.containsKey("Durian")) {
            System.out.println(map.get("Durian"));
        }

        map.putIfAbsent("Durian", 100);
        map.putIfAbsent("Apple", 99999);
        System.out.println(map);

        System.out.println(map.keySet());
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("\\n=== forEach() ===");
        map.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });


    }
}
