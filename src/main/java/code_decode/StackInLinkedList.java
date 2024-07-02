package code_decode;

public class StackInLinkedList {

    public Node top = null;

    public boolean isEmpty() {
        return top == null ? true : false;
    }


    public void push(int value) {
        Node oldTop = top;
        top = new Node(value);
        top.next = oldTop;
    }

    public int pop() {
        int data = top.data;
        top = top.next;

        return data;
    }


    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        StackInLinkedList stack = new StackInLinkedList();
        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }

}
