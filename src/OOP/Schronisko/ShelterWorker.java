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

import java.util.ArrayList;
import java.util.List;

public class ShelterWorker {
    private String name;
    private String surrName;
    private int id;
    private List<Animal> animals = new ArrayList<>();
    public List<Animal> getAnimals() {
        return animals;
    }
    public ShelterWorker(String name, String surrName, int id) {
        this.name = name;
        this.surrName = surrName;
        this.id = id;
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
        animal.setShelterWorker(this);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrName() {
        return surrName;
    }

    public void setSurrName(String surrName) {
        this.surrName = surrName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "ShelterWorker [name=" + name + ", surname=" + surrName + ", id=" + id + "]";
    }
}