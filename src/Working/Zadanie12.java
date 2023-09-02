package Working;
/*MegaCorp chce przyznawać swoim pracownikom premie na podstawie liczby napisanych przez nich linijek kodu.
Chcieliby dać każdemu pracownikowi jak najmniejszą dodatnią kwotę, zgodnie z ograniczeniem,
że jeśli programista napisał więcej linii kodu niż jego sąsiad, powinien otrzymać więcej pieniędzy.
Mając tablicę reprezentującą liczbę napisanych linii kodu pracowników w MegaCorp, określ, ile każdy z nich powinien otrzymać.

Na przykład, mając dane [10, 40, 200, 1000, 60, 30], należy zwrócić [1, 2, 3, 4, 2, 1].
 */
public class Zadanie12 {
    public static int[] calculateBonuses(int[] linesOfCode) {
        int n = linesOfCode.length;
        int[] bonuses = new int[n];

        for (int i = 0; i < n; i++) {
            bonuses[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (linesOfCode[i] > linesOfCode[i - 1]) {
                bonuses[i] = bonuses[i - 1] + 1;
            }
        }

        for (int i = n - 2; i > 0; i--) {
            if (linesOfCode[i] > linesOfCode[i+1] && bonuses[i] <= bonuses[i + 1]) {
                bonuses[i] = bonuses[i+1] + 1;
            }
        }

        return bonuses;
    }

    public static void main(String[] args) {
        int[] linesOfCode = {10, 40, 200, 1000, 60, 30};
        int[] bonuses = calculateBonuses(linesOfCode);

        for (int i : bonuses) {
            System.out.println(i);
        }
    }
}

