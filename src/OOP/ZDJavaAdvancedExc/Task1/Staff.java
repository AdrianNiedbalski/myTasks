package OOP.ZDJavaAdvancedExc.Task1;

public class Staff extends Person{
    private String specialization;
    private double salary;
    public Staff (String specialization, double salary) {
        this.salary = salary;
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return "Name: " + getName() +
                "\nAddress: " + getAddress() +
                "\nSpecialization: " + specialization +
                "\nSalary: " + salary;
    }
}
