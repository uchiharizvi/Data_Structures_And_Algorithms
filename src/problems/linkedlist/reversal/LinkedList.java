package problems.linkedlist.reversal;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void prepend(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

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
    public Node reverseList(Node head) {
        Node curr = head, prev = null, next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
