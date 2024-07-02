package DSA;

public class RemoveNodeFromSinglyLinkedList {

    public void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add nodes to the list
        list.addNode(50);
        list.addNode(120);
        list.addNode(80);
        list.addNode(150);
        list.addNode(30);

        System.out.println("Original List:");
        list.display();

        // Remove nodes with values greater than 100
        list.removeNodesGreaterThan100();

        System.out.println("List after removing nodes with values greater than 100:");
        list.display();
    }


    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        public LinkedList() {
            this.head = null;
        }

        // Function to remove nodes with values greater than 100
        public void removeNodesGreaterThan100() {
            Node current = head;
            Node previous = null;

            while (current != null) {
                if (current.data > 100) {
                    // If the current node's data is greater than 100, remove it from the list.
                    if (previous == null) {
                        // If it's the head node, update the head.
                        head = current.next;
                    } else {
                        previous.next = current.next;
                    }
                } else {
                    // Move to the next node.
                    previous = current;
                }
                current = current.next;
            }
        }

        // Function to add a new node to the end of the list
        public void addNode(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Function to display the linked list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }


}
