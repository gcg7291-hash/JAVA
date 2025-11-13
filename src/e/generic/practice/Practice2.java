package e.generic.practice;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "k=" + key +
                ", v=" + value +
                '}';
    }



    public Pair<V, K> swap() {
        return new Pair<V, K>(this.value, this.key);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("나이", 25);
        System.out.println(pair1);
        System.out.println("Key: " + pair1.getKey());
        System.out.println("Value: " + pair1.getValue());

        // swap 테스트
        Pair<Integer, String> swapped = pair1.swap();
        System.out.println("Swapped: " + swapped);

        // 같은 타입 쌍
        Pair<String, String> pair2 = new Pair<>("이름", "홍길동");
        System.out.println(pair2);
    }

}
