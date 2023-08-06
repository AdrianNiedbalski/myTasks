package OOP.Task2;
import java.util.Arrays;

public class Computer {
    private String motherboard;
    private Processor processor;
    private RAM [] ramSlots;
    private int hd;
    private String monitor;
    private String printer;

    public Computer(String motherboard, Processor processor,int maxSlots) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ramSlots = new RAM[maxSlots];
    }

    // SETTERY COMPUTER //
    public void setMotherboard(String motherboard){
        this.motherboard = motherboard;
    }
    public void setProcessor(Processor processor){
        this.processor = processor;
    }
    public void setRam(RAM[] ram){
        this.ramSlots = ram;
    }
    public void setHd(int hd){
        this.hd = hd;
    }
    public void setMonitor(String monitor){
        this.monitor = monitor;
    }
    public void setPrinter(String printer){
        this.printer = printer;
    }

    // GETTERY COMPUTER//

    public String getMotherboard(){
        return motherboard;
    }
    public Processor getProcessor(){
        return processor;
    }
    public RAM[] getRam(){
        return ramSlots;
    }
    public int getHd(){
        return hd;
    }
    public String getMonitor(){
        return monitor;
    }
    public String getPrinter(){
        return printer;
    }

    public String toString(){
        return "Computer{"+
                "motherboard= '" + motherboard + '\''+
                ", processor='" + processor.toString() +
                ", ram=" + Arrays.toString(ramSlots) +
                ", hd=" + hd +
                ", monitor='" + monitor + '\'' +
                ", printer='" + printer + '\'' +
                '}';
    }

    public void addRAM(RAM newRAM) {
        int minSizeIndex = -1;
        int minSize = Integer.MAX_VALUE;
        int emptySlotIndex = -1;
        for (int i = 0; i < ramSlots.length; i++) {
            if (ramSlots[i] == null) {
                emptySlotIndex = i;
                break;
            }
        }
        if (emptySlotIndex != -1) {
            ramSlots[emptySlotIndex] = newRAM;
        }
        else if(newRAM.getSize() > minSize){
            ramSlots[minSizeIndex] = newRAM;
        }
        else {
            for (int i = 0; i < ramSlots.length; i++) {
                if (ramSlots[i] != null && ramSlots[i].getSize() < minSize) {
                    minSize = ramSlots[i].getSize();
                    minSizeIndex = i;
                }
                else{
                    emptySlotIndex = i;
                    break;
                }
            }

            if (newRAM.getSize() > minSize) {
                ramSlots[minSizeIndex] = newRAM;
            }

        }
    }

    public static void main(String[] args) {
        Processor processor = new Processor("i7", 4);
        Computer computer = new Computer("ASUS", processor, 4);

        computer.setHd(500);
        computer.setMonitor("Dell");
        computer.setPrinter("HP");

        RAM ram1 = new RAM("Corsair", 8);
        RAM ram2 = new RAM("Kingston", 16);
        RAM ram3 = new RAM("Crucial", 32);
        RAM ram4 = new RAM("G.Skill", 16);
        RAM ram5 = new RAM("HyperX", 8);

        computer.addRAM(ram1);
        computer.addRAM(ram2);
        computer.addRAM(ram3);
        computer.addRAM(ram4);
        computer.addRAM(ram5);

        System.out.println(computer.toString());
    }
}

