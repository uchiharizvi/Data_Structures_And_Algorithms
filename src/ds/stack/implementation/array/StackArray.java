package ds.stack.implementation.array;

import java.util.function.Predicate;

public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;
    Predicate<StackArray> isEmpty = stack -> stack.top == -1;

    public StackArray(int size) {
        stack = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

}
