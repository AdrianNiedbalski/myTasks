package GenericStack;
public class Main {
    public static void main(String[] args) {

        ArrayStack<Integer> intStack = new ArrayStack<>();
        try {
            intStack.push(1);
            intStack.push(2);
            intStack.push(3);

            System.out.println("Top element: " + intStack.peek());

            while (!intStack.isEmpty()) {
                System.out.println("Popped: " + intStack.pop());
            }
        } catch (FullStackException e) {
            e.printStackTrace();
        }

        ArrayStack<String> stringStack = new ArrayStack<>();

        try {
            stringStack.push("A");
            stringStack.push("B");
            stringStack.push("C");

            System.out.println("Top element: " + stringStack.peek());

            while (!stringStack.isEmpty()) {
                System.out.println("Popped: " + stringStack.pop());
            }
        } catch (FullStackException e) {
            e.printStackTrace();
        }
    }
}
