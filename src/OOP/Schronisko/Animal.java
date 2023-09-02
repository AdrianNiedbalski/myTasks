package OOP.Schronisko;
/* Napisać klasę Animal reprezentujące zwierze w schronisku.
Klasa powinna zawierać pola
id
name
age
race
ShelterWorker - pole reprezentujące opiekuna zwierzęcia
Ponadto klasa powinna zawierać konstruktor przyjnujący id, name, age
Klasa powinna zawierać getery dla wszystkich pól oraz seter ustawiający opiekuna

ShelterWorker reprezentującą pracownika schroniska
Klasa powinna zawierać pola
- name
- surname
- id
- listę zwierząt (Listę klas Animal) reprezentującą zwierzęta którymi opiekuje się pracownik.
Klasa powinna zawierać konstruktor ustawiąjący pola: imie, nazwisko, id
ponadto klasa powinna zawierać getery tych pół.
Jako ostatnie (i najważniejsze) klasa powinna zawierać metodę która przyjmuje jako argument obiekt klasy Animal i dodaje go do listy zwierzą
po czym obiektowi klasy animal przypisuje (TEGO!) opiekuna zwirząt metoda setSheleterWorker klasy Animal
Dla obu klas dodać metody toString
Jako ostatni punkt w metodzie mail
Stworzyć obiekt klasy ShelterWorker następnie stworzyć 3 obiekty klasy Animal po czym przypisać je obiektowi ShelterWorker (metodą set)
 */
public class Animal {
private int id;
private String Name;
private int age;
private String race;
private ShelterWorker shelterWorker;

    public Animal(int id, String name, int age, String race) {
        this.id = id;
        Name = name;
        this.age = age;
        this.race = race;
    }
    public void setShelterWorker(ShelterWorker shelterWorker) {
        this.shelterWorker = shelterWorker;
    }
    public ShelterWorker getShelterWorker() {
        return shelterWorker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                '}';
    }
}