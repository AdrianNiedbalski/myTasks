package OOP.Notebook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tags1 = new ArrayList<>();
        tags1.add("Java");
        tags1.add("Programowanie");

        List<String> tags2 = new ArrayList<>();
        tags2.add("Notatka");
        tags2.add("Informatyka");

        Note note1 = new Note("Przykładowa notatka o programowaniu w Javie.", tags1);
        Note note2 = new Note("Notatka z informacji o notatkach.", tags2);

        // Testowanie metody match
        System.out.println("Czy notatka 1 zawiera 'Java'? " + note1.Match("Java")); // true
        System.out.println("Czy notatka 2 zawiera 'Java'? " + note2.Match("Java")); // false

        // Wyświetlenie informacji o notatkach
        System.out.println(note1);
        System.out.println(note2);

    }
}
