package OOP.ZDJavaAdvancedExc.Task2;

public class RAM {
    private String name;
    private int size;

    public RAM(String name, int size){
        this.name = name;
        this.size = size;
    }
    // SETTERY //
    public void setName(String name){
        this.name = name;
    }
    public void setSize(int size){
        this.size = size;
    }

    // GETTERY //
    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", size='" + size +
                '}';
    }
}
