package data_structures.linkedlist.single;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(5);
        linkedList.append(6);
        linkedList.prepend(4);
        System.out.println(linkedList);
    }
}
