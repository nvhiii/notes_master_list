package cisc3130.homeNotes.generics;

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K ogKey, V ogValue) {

        this.key = ogKey;
        this.value = ogValue;

    }

    public K getKey() {

        return key;

    }

    public V getValue() {

        return value;

    }

}

// Now make a class to test this class
