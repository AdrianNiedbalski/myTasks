package OOP.ZDJavaAdvancedExc.Task2;

public class Person {
    private String name;
    private String surname;
    private String gender;
    private int age;
    private String pesel;

    public Person(String name, String surname, String gender, int age, String pesel){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.pesel = pesel;
    }
    // SETTERY //
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPesel(String pesel){
        this.pesel = pesel;
    }

    // GETTERY //
    public String getName(){
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getPesel() {
        return pesel;
    }

    public boolean hasReachedRetirementAge(){
        if(gender.equals('K')){
            return age >=60;
        } else if(gender.equals("M")){
            return age >= 65;
        }
        else {
            return false;
        }
    }

    public static void testReachedRetirementAge(){
        Person person1 = new Person ("Adrian", "Niedbalski", "M", 26, "123456789");
        Person person2 = new Person ("Adrian", "Niedbalski", "M", 21, "123456789");
        Person person3 = new Person ("Julia", "Idzikowska", "K", 23, "987654321");

        int ageDifference = ageDifference(person2, person1);
        System.out.println("Różnica wieku między osobami: " + ageDifference + " lat");

        boolean hasReachedRetirementAge = person1.hasReachedRetirementAge();
        System.out.println("Czy osoba 1 osiagnela wiek emerytalny? " + hasReachedRetirementAge);
    }

    public static int ageDifference(Person person1, Person person2) {
            int ageDifference = Math.abs(person1.getAge()-person2.getAge());
            return Math.max(ageDifference, 0);
        }
    public static void main(String[] args) {
        testReachedRetirementAge();
    }

}
