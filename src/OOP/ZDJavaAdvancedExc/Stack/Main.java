package OOP.ZDJavaAdvancedExc.Stack;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        try {
            stack.push("A");
            stack.push("B");
            stack.push("C");

            System.out.println("Top element: " + stack.peek()); // Wyświetli "Top element: C"

            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            }
        } catch (FullStackException e) {
            e.printStackTrace();
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }
}