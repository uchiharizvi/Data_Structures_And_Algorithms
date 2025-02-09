package data_structures.stack.implementations.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = scanner.nextInt();
        StackArray stack = new StackArray(size);
        initiate(scanner, stack);
    }

    private static void initiate(Scanner scanner, StackArray stack) {
        System.out.println("Select Operation");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Exit");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Element to Push: ");
                stack.push(scanner.nextInt());
                System.out.println("Element Pushed Successfully");
                System.out.println("Stack Size: " + stack.size());
                initiate(scanner, stack);
            case 2:
                System.out.println("Popped : " + stack.pop());
                System.out.println("Stack Size: " + stack.size());
                initiate(scanner, stack);
            case 3:
                System.out.println("Top: " + stack.peek());
                System.out.println("Stack Size: " + stack.size());
                initiate(scanner, stack);
            default:
                System.out.println("Exiting...");
                break;
        }
    }
}
