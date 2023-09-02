package Working;
/*Napisz program, który odwróci zawartość tablicy, np.

[1, 10, 4, 5, 2, 12] -> [12, 2, 5, 4, 10, 1]
[1, 2, 5, 3, 10] -> [10, 3, 5, 2, 1]
 */
public class Zadanie5 {
    public static void main(String[] args) {
        int tab[] = {1,10,4,5,2,12};
        int newTab[] = new int[6];

        for (int i = 0; i < tab.length; i++) {
                newTab[i] = tab[tab.length - 1 -i];
            }

        for(int k : newTab) {
            System.out.println(k);
        }
    }
}
