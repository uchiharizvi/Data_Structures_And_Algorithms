package ds.linkedlist.doubly;

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
        node.previous = temp;
    }

    public void prepend(int val) {
        Node node = new Node(val);
        node.next = head;
        if (head != null) {
            head.previous = node;
        }
        head = node;
    }

    public void delete(int key) {
        if (head == null) {
            return;
        }
        //delete the head
        if (head.data == key) {
            head = head.next;
            if(head!=null) {
                head.previous = null;
            }
            return;
        }
        //Finding node to delete
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp!= null) {
            if(temp.next!=null){
                temp.next.previous = temp.previous;
            }
            if(temp.previous!=null) {
                temp.previous.next = temp.next;
            }
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.print("\n");
    }
}
