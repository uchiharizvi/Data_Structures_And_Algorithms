package ds.linkedlist.single;

public class LinkedList {
    private Node head;

    public void append(int val) {
        Node node = new Node(val);
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

    public void prepend(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next; // Move head to next node
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next; // Bypass the node to be deleted
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.print("\n");
    }
}
