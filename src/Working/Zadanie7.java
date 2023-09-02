package Working;
/*Napisz program obliczający różnicę pomiędzy największą i najmniejszą wartością z tablicy.
Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
wynik: 50 - 20 = 30
 */
public class Zadanie7 {
    public static void main(String[] args) {
        int tab[] = {20, 20, 30, 40, 50, 50, 50};
        int max = tab[0];
        int min = tab[0];

        for(int i = 0; i < tab.length; i++) {
                if (tab[i] > max) {
                    max = tab[i];
                }
                if (tab[i] < min) {
                    min = tab[i];
                }
        }
        int diff = max - min;
        System.out.println(diff);
    }
}
