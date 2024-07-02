package DSA.doublyLinkedList;

class Main {
    public static void main(String[] args) {
        DoubleLinkedList ddl = new DoubleLinkedList();
        ddl.insertFirst(3);
    }
}

class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
    }
}

public class DoubleLinkedList {
    Node head;

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head = node;
    }
}


