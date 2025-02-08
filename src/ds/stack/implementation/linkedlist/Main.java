package ds.stack.implementation.linkedlist;

import ds.stack.implementation.array.StackArray;

public class Main {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Stack Empty: " + stack.isEmpty.test(stack)); // Output: 2

    }
}
