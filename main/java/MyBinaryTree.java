public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public MyBinaryNode<K> getRoot() {
        return root;
    }

    public void setRoot(MyBinaryNode<K> root) {
        this.root = root;
    }

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public int getSize() {
        return 0;
    }
}