package OOP.ZDJavaAdvancedExc.Tuple;

public class Tuple<L,R> {
    private R right;
    private L left;

    public Tuple (R right, L left) {
        this.left = left;
        this.right = right;
    }

    public R getRight() {
        return right;
    }

    public void setRight(R right) {
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public void setLeft(L left) {
        this.left = left;
    }
}
