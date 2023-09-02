package OOP.ZDJavaAdvancedExc.Schronisko;
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
public class main {
    public static void main(String[] args) {
        ShelterWorker shelterWorker = new ShelterWorker("Adrian", "Niedbalski", 1);
        Animal animal1 = new Animal(1,"Burek", 3, "Pies");
        Animal animal2 = new Animal(2,"Mruczek", 5, "Kot");
        Animal animal3 = new Animal(3,"Gryzak", 7, "Chomik");

        shelterWorker.addAnimal(animal1);
        shelterWorker.addAnimal(animal2);
        shelterWorker.addAnimal(animal3);
        System.out.println("Shelter Worker: " + shelterWorker);
        System.out.println("Animals under their care:");
        for (Animal animal : shelterWorker.getAnimals()) {
            System.out.println(animal);
        }
    }
}
