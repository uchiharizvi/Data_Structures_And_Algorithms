package data_structures.linkedlist.single;

public class LinkedList {
    private Node head;

    /**
     * @param data Inserts node at the end of the list
     */
    public void append(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    /**
     * @param data
     * Inserts at the beginning of the list
     */
    public void prepend(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void printList() {
        Node temp = head;
    }
}
