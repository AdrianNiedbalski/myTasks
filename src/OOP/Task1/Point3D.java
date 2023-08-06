package OOP.Task1;

public class Point3D extends Point2D{
    private static float z;
    public Point3D (float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public static float getZ() {
        return z;
    }
    public float [] getXYZ () {
        return new float[] {getX(),getY(),z};
    }

    public static void setZ(float z) {
        Point3D.z = z;
    }
    public void setXYZ (float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public String toString() {
        return String.format("(%f, %f, %f) ;", getX(), getY(), z);
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Punkt 3D: " + point3D);

        point3D.setX(4.0f);
        point3D.setY(5.0f);
        point3D.setZ(6.0f);
        System.out.println("Nowa współrzędna x punktu 3D: " + point3D.getX());
        System.out.println("Nowa współrzędna y punktu 3D: " + point3D.getY());
        System.out.println("Nowa współrzędna z punktu 3D: " + point3D.getZ());

        point3D.setXYZ(7.0f, 8.0f, 9.0f);
        float[] coordinates = point3D.getXYZ();
        System.out.println("Nowe współrzędne punktu 3D: (" + coordinates[0] + ", " + coordinates[1] + ", " + coordinates[2] + ")");
    }
}
