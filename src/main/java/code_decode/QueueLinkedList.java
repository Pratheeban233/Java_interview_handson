package code_decode;

public class QueueLinkedList {

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        System.out.println(queue.isEmpty());

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println(queue.deQueue());
        System.out.println(queue.isEmpty());
    }

    public Node head = null;
    public Node tail = null;

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public void enQueue(int value) {

        if (head == null) { //if first item
            head = new Node(value);
            tail = head;
            return;
        }

        //queue add up from last
        tail = new Node(value);
        tail = tail.behind;
    }

    public int deQueue() {
        if (isEmpty()) {
            return -1;
        }
        int data = head.data;
        head = head.behind;

        return data;
    }


    class Node {
        private int data;
        private Node behind;

        public Node(int data) {
            this.data = data;
        }
    }
}
