package data_structures.stack.implementations.linkedlist;

import java.util.function.Predicate;

public class StackLinkedList {
    private Node top;
    Predicate<StackLinkedList> isEmpty = stack -> stack.top == null;

    public StackLinkedList() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if(isEmpty.test(this)) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedVal = top.data;
        top = top.next;
        return poppedVal;
    }
    public int peek() {
        if(isEmpty.test(this)) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
}
