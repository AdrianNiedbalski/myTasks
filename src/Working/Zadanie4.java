package Working;
import java.util.Random;
import java.util.Scanner;
/* Zadanie polega na napisaniu programu w Javie, w którym użytkownik otrzyma K prób odgadnięcia losowo wygenerowanej liczby. Poniżej znajdują się zasady gry:

Jeśli odgadnięta liczba jest większa niż rzeczywista, program odpowie komunikatem, że odgadnięta liczba jest wyższa niż rzeczywista.
Jeśli odgadnięta liczba jest mniejsza niż rzeczywista, program odpowie komunikatem, że odgadnięta liczba jest niższa niż rzeczywista.
Jeśli odgadnięta liczba jest równa rzeczywistej liczbie lub jeśli K prób zostanie wyczerpanych, program zakończy się odpowiednim komunikatem.
 */
public class Zadanie4 {
    public static void main(String[] args) {


        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int k = scanner.nextInt();
        int licznik = 0;
        while (randomNumber != k) {
            if ( randomNumber > k ){
                System.out.println("Za malo! Podaj kolejna: ");
                k = scanner.nextInt();
            }
            else if (randomNumber < k) {
                System.out.println("Za duzo! Podaj kolejna: ");
                k = scanner.nextInt();
            }
            licznik ++;
        }
        System.out.println("Brawo! Zajelo to: " + licznik + " prob!");
    }}
