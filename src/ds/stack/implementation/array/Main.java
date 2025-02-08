package ds.stack.implementation.array;

public class Main {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        System.out.println("is Stack Empty : " + stack.isEmpty.test(stack));
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Stack size: " + stack.size()); // Output: 2

    }
}
