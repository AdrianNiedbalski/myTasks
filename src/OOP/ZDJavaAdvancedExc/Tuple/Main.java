package OOP.ZDJavaAdvancedExc.Tuple;


public class Main {
    public static void main(String[] args) {
        Tuple<Integer> pair = new Tuple<>(53, 52);

        Integer leftValue = pair.getLeft();
        Integer rightValue = pair.getRight();

        Integer maxValue = pair.getMax();
        Integer minValue = pair.getMin();


        System.out.println("Left value: " + leftValue);
        System.out.println("Right value: " + rightValue);
        System.out.println("Max value: " + maxValue);
        System.out.println("Min value: " + minValue);
}
}
