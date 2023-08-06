package OOP.Task1;

public class Student extends Person{
    private String studyType;
    private int studyYear;
    private double studyCost;
    public Student(String name, String address, String studyType, int studyYear, double studyCost) {
        super(name, address);
        this.studyType = studyType;
        this.studyYear = studyYear;
        this.studyCost = studyCost;
    }

    public String getStudyType() {
        return studyType;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public double getStudyCost() {
        return studyCost;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public void setStudyCost(double studyCost) {
        this.studyCost = studyCost;
    }
    public String toString() {
        return "Name: " + getName() +
                "\nAddress: " + getAddress() +
                "\nStudy Type: " + studyType +
                "\nStudy Year: " + studyYear +
                "\nStudy Cost: " + studyCost;
    }
}
