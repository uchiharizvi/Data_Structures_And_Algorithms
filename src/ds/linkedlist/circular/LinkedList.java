package ds.linkedlist.circular;

public class LinkedList {
    private Node head;
    private Node tail;

    public void append(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
            return;
        }
        tail.next = node;
        tail = node;
        tail.next = head;
    }

//    public void prepend(int val) {
//        Node node = new Node(val);
//        node.next = head;
//        head = node;
//    }

//    public void delete(int key) {
//        if (head == null) {
//            return;
//        }
//        //delete from beginning
//        if (head.data == key) {
//            head = head.next;
//            return;
//        }
//        Node temp = head;
//        while (temp.next != null && temp.next.data != key) {
//            temp = temp.next;
//        }
//        if (temp.next != null) {
//            temp.next = temp.next.next;
//        }
//    }

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
