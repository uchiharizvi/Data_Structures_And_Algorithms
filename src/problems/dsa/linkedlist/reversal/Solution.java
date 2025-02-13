package problems.dsa.linkedlist.reversal;

public class Solution {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.prepend(2);
        list.append(4);
        list.append(5);
        //list 2->1->4->5
        list.printList();
        list = list.reverseList(list);

    }
}
