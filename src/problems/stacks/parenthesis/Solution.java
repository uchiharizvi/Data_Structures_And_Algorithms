package problems.stacks.parenthesis;

import java.util.Scanner;
import java.util.Stack;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        isBalanced.test(s);
    }

    private static Predicate<String> isBalanced = s -> {
        Stack<Character> characterStack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                characterStack.push(ch);
            } else {
                return false;
            }
            char top = characterStack.peek();
            if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                characterStack.pop();

            } else {
                return false;
            }

        }
        return characterStack.empty();
    };
}

