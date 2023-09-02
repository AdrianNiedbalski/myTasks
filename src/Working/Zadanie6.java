package Working;

import java.util.ArrayList;

/*Napisz program usuwający duplikaty z tablicy i zwracający nową tablicę, np.
Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
Tablica wyjściowa: [20, 30, 40, 50]
 */
public class Zadanie6 {
    public static void main(String[] args) {
        int tab[] = {20,20,30,40,50,50,50};
        ArrayList<Integer> newTabList = new ArrayList<>();
        boolean isDuplicate = false;

        for (int i = 0; i < tab.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < newTabList.size(); j++) {
                if (tab[i] == newTabList.get(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newTabList.add(tab[i]);
            }
        }
        for(int k : newTabList) {
            System.out.println(k);
        }
}}
