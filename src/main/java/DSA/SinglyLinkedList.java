package DSA;

class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(1);
        list.insertAtStart(3);
        list.insertAt(12, 2);

        list.display();
    }
}

class Node {
    int data;
    Node next;
}

public class SinglyLinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void insertAt(int data, int index) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0) {
            insertAtStart(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }


    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

}


