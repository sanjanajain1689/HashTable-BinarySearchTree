public class MyMapNode<K, V> {
    private K key;
    private V value;
    private MyMapNode next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode getNext() {
        return next;
    }

    public void setNext(MyMapNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{MyMapNode K = ").append(key).append(", V = ").append(value).append("}");
        if(next != null)
            stringBuilder.append(" -> ").append(next);
        return stringBuilder.toString();
    }
}
