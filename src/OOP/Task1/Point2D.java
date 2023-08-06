package OOP.Task1;

public class Point2D {
    private static float x;
    private static float y;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public static float[] getXY () {
        return new float[] {x,y};
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String toString () {
        return String.format("(%f, %f)", x, y);
    }

    public static void main(String[] args) {
        Point2D point1 = new Point2D(3.5f, 2.0f);
        System.out.println("Punkt 1: " + point1);

        Point2D point2 = new Point2D(0.0f, 0.0f);
        System.out.println("Punkt 2: " + point2);

        point1.setX(1.2f);
        point1.setY(5.7f);
        System.out.println("Nowa współrzędna x punktu 1: " + point1.getX());
        System.out.println("Nowa współrzędna y punktu 1: " + point1.getY());

        point1.setXY(2.5f, 1.0f);
        float[] coordinates = point1.getXY();
        System.out.println("Nowe współrzędne punktu 1: " + point1);
    }
}
