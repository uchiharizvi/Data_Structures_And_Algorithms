package ds.linkedlist.circular;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.printList(); // Output: 10 -> 20 -> 30 -> null

        list.printList(); // Output: 5 -> 10 -> 20 -> 30 -> null

        list.printList();
    }
}
