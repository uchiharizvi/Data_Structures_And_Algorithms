package ds.stack.implementation.linkedlist;

import java.util.function.Predicate;

public class StackLinkedList {
    private Node top;
    Predicate<StackLinkedList> isEmpty = stack -> stack.top == null;

    public StackLinkedList() {
        this.top = null;
    }

    public void push(int val) {
        Node node = new Node(val);
        node.next = top;
        top = node;
    }

    public int pop() {
        if (isEmpty.test(this)) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedVal = top.data;
        top = top.next;
        return poppedVal;
    }

    public int peek() {
        if (isEmpty.test(this)) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }
}
