package OOP.ZDJavaAdvancedExc.Tuple;

public class Main {
    public static void main(String[] args) {
        Tuple<String, Integer> pair = new Tuple<>(42, "Hello");

        String leftValue = pair.getLeft();
        Integer rightValue = pair.getRight();

        System.out.println("Left value: " + leftValue);
        System.out.println("Right value: " + rightValue);
}
}
