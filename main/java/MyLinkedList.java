public class MyLinkedList<K, V> {
    private MyMapNode head;
    private MyMapNode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public MyMapNode getHead() {
        return head;
    }

    public void setHead(MyMapNode head) {
        this.head = head;
    }

    public MyMapNode getTail() {
        return tail;
    }

    public void setTail(MyMapNode tail) {
        this.tail = tail;
    }

    public void add(MyMapNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void append(MyMapNode node) {
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }

    public void insert(MyMapNode node, MyMapNode newNode) {
        MyMapNode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public <K> void insert(K key, MyMapNode newNode) {
        MyMapNode tempNode = search(key);
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }

    public MyMapNode pop() {
        MyMapNode tempNode = head;
        head = head.getNext();
        return tempNode;
    }

    public MyMapNode popLast() {
        MyMapNode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        tail = tempNode;
        tempNode = tempNode.getNext();
        tail.setNext(null);
        return tempNode;
    }

    public <K> MyMapNode search(K key) {
        MyMapNode tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key))
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public <E> void delete(E dataValue) {
        MyMapNode tempNode = head;
        while (!tempNode.getNext().getValue().equals(dataValue)) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
    }

    public int getSize() {
        int count = 0;
        MyMapNode tempNode = head;
        while (tempNode != null) {
            tempNode = tempNode.getNext();
            count++;
        }
        return count;
    }

    public void printList() {
        System.out.println(head.toString());
    }

    @Override
    public String toString() {
        return "MyLinkedList { " + head + " } ";
    }
}