package OOP.Task3.Kompozycja;

public class Sneaker implements Shoe{
    private String name;
    private double size;
    private boolean isLeather;
    private boolean isComfortable;

    public Sneaker(String name, double size, boolean isLeather, boolean isComfortable) {
        this.name = name;
        this.size = size;
        this.isLeather = isLeather;
        this.isComfortable = isComfortable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isLeather() {
        return isLeather;
    }

    public void setLeather(boolean leather) {
        isLeather = leather;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }
}
