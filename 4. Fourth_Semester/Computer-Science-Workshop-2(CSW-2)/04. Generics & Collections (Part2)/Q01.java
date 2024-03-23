/**
 * Ques 1 : Create a generic class Pair<K,V> with private variables key and value. The class Pair should define a parameterised constructor and getter and setter methods for these attributes. After addition of objects, the main class should retrieve and print the pair of key and value.
 */

class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public void setValue(V value) {
        this.value = value;
    }
}
public class Q01 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair <>(1, "One");
        Pair<String, Double> pair2 = new Pair <>("Pi", 3.14);
        System.out.println("Pair 1 --> Key : "+pair1.getKey()+", Value : "+pair1.getValue());
        System.out.println("Pair 2 --> Key : "+pair2.getKey()+", Value : "+pair2.getValue());
    }
}

/**
 * OUTPUT :
 *
 * Pair 1 --> Key : 1, Value : One
 * Pair 2 --> Key : Pi, Value : 3.14
 */