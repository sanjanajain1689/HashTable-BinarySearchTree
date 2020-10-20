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
    private int getSizeRecursive(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + getSizeRecursive(current.left)
                + getSizeRecursive(current.right);
    }

    public boolean search(K key) {
        return this.recursivelySearch(root, key);
    }

    public boolean recursivelySearch(MyBinaryNode<K> current, K key) {
        if (current == null)
            return false;
        else if (current.key.equals(key))
            return true;
        else
            return recursivelySearch(current.left, key) || recursivelySearch(current.right, key);
    }


}