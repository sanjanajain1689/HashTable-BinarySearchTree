import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {
    private final int numOfBuckets;
    ArrayList<MyLinkedList<K, V>> myBucketArray;

    public MyLinkedHashMap() {
        numOfBuckets = 10;
        myBucketArray = new ArrayList<>(numOfBuckets);
        for (int i = 0; i < numOfBuckets; i++) {
            myBucketArray.add(null);
        }
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        MyLinkedList<K, V> myLinkedList = myBucketArray.get(bucketIndex);
        if (myLinkedList == null) return null;
        MyMapNode<K, V> myMapNode = myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        return hashCode % 10;
    }

    public void add(K key, V value) {
        int index = getBucketIndex(key);
        MyLinkedList<K, V> myLinkedList = myBucketArray.get(index);
        if (myLinkedList == null) {
            myLinkedList = new MyLinkedList<>();
            MyMapNode<K, V> myMapNode = new MyMapNode<>(key, value);
            myLinkedList.append(myMapNode);
            myBucketArray.set(index, myLinkedList);
        } else {
            if (myLinkedList.search(key) == null) {
                MyMapNode<K, V> myMapNode = new MyMapNode<>(key, value);
                myLinkedList.append(myMapNode);
            } else myLinkedList.search(key).setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyLinkedHashMap List{ " + myBucketArray + " }";
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        MyLinkedList<K, V> myLinkedList = myBucketArray.get(index);
        if(myLinkedList == null) return;
        myLinkedList.delete(key);
    }
}
