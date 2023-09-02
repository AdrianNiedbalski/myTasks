package Working;
/*Zadanie 5

Wskaż liczbę o 1 większą od reprezentowanej liczby przez cyfry w tablicy, np. [1,3,2,4] -> 1324 + 1 -> [1,3,2,5]
 */
public class Zadanie10 {

    public static void main(String[] args) {
        int[] tab = {1, 3, 2, 4};
        int currInt = 0;
        for (int i = 0; i < tab.length; i++) {
            currInt = currInt * 10 + tab[i];
        }
        currInt = currInt + 1;

        for (int j = tab.length - 1; j > 0; j--) {
            tab[j] = currInt %10;
            currInt = currInt / 10;
        }

        for (int k = 0; k < tab.length; k++) {
            System.out.print(tab[k]);
        }
    }
}
