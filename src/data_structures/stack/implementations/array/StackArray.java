package data_structures.stack.implementations.array;

public class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
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
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    //Peek
    //Size
    public int size() {
        return top + 1;
    }

}
