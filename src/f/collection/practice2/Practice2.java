package f.collection.practice2;
import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        String[] words1 = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        Map<String, Integer> result1 = countWordFrequency(words1);
        System.out.println("테스트 1: " + result1);
        // {apple=3, banana=2, cherry=1}

        // 테스트 2
        String[] words2 = {"hello", "world"};
        Map<String, Integer> result2 = countWordFrequency(words2);
        System.out.println("테스트 2: " + result2);
        // {hello=1, world=1}

        // 테스트 3: 빈 배열
        String[] words3 = {};
        Map<String, Integer> result3 = countWordFrequency(words3);
        System.out.println("테스트 3: " + result3);
        // {}

        // 테스트 4: 모두 같은 단어
        String[] words4 = {"test", "test", "test"};
        Map<String, Integer> result4 = countWordFrequency(words4);
        System.out.println("테스트 4: " + result4);
        // {test=3}
    }

    // 여기에 메서드 구현
    public static Map<String, Integer> countWordFrequency(String[] words) {
        // 구현 필요
        HashMap<String, Integer> f = new HashMap<>();

        for (String word : words) {
            int count = f.getOrDefault(word, 0);
            f.put(word, count + 1);
        }

        // containsKey 사용
//        if (fq.containsKey(word)++1){
//            freq.put(word, freq.get(worrd))

//        }

        return f;
    }
}
