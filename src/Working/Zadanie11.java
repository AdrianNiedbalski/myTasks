package Working;
/*Na podstawie dwóch podanych tablic [-1,3,8,2,9,5] [4,1,2,10,5,20] znajdź pary liczb których suma jest równa liczbie n=24
 */
public class Zadanie11 {
    public static void main(String[] args) {


        int tab[] = {-1, 3, 8, 2, 9, 5};
        int tab2[] = {4, 1, 2, 10, 5, 20};

        int target = 24;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if (tab[i] + tab[j] == target) {
                    System.out.println("Para: " + tab[i] + " + " + tab[j]);
                }
            }
        }
    }
}
