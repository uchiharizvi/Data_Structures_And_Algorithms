package data_structures.stack.implementations.linkedlist;

public class Main {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        System.out.println("Stack is empty : " + stack.isEmpty.test(stack));
        stack.push(10);
        System.out.println("Value Pushed Successfully");
        System.out.println("Stack is empty : " + stack.isEmpty.test(stack));
        System.out.println("Peek : " + stack.peek());
        stack.push(20);
        System.out.println("Value Pushed Successfully");
        System.out.println("Stack is empty : " + stack.isEmpty.test(stack));
        System.out.println("Peek : " + stack.peek());
        System.out.println("Popping Value.." + stack.pop());
        System.out.println("Peek : " + stack.peek());

    }
}
