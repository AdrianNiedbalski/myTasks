package OOP.Task2;

public class Processor {
    private String name;
    private int cores;

    public Processor(String name, int cores){
        this.name = name;
        this.cores = cores;
    }
    // SETTERY //
    public void setName(String name){
        this.name = name;
    }
    public void setCores(int cores){
        this.cores = cores;
    }
    public String getName(){
        return name;
    }
    public int getCores(){
        return cores;
    }
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", cores=" + cores +
                '}';
    }
}
