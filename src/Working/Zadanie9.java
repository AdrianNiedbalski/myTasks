package Working;
/*Mając tablicę o rozmiarze n, znajdź element większościowy.
 Element większościowy to element, który pojawia się więcej niż floor(n/2) razy.
 Możesz założyć, że tablica nie jest pusta, a element większościowy zawsze istnieje w tablicy.

Przykład :

Wejście : [2, 1, 2] Return : 2, który występuje 2 razy i jest większy niż 3/2.
 */
public class Zadanie9 {
    public static int function(int tab[]) {

        int licznik = 0;
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == max) {
                licznik++;
            }
        }
        return licznik;
    }
    public static void main(String[] args) {
        int tab[] = {2,1,2};

        int result = function(tab);
        System.out.println(result);
    }
}
