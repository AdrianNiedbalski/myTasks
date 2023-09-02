package Working;
/*Mając macierz składającą się z N wierszy i M kolumn,
zadaniem jest znalezienie minimalnej różnicy bezwzględnej między dowolnymi dwoma sąsiadującymi elementami tablicy o rozmiarze N,
która jest tworzona przez pobranie jednego elementu z każdego wiersza macierzy. Zauważ, że element wybrany z rzędu 1 stanie się arr[0],
element pobrany z rzędu 2 stanie się arr[1] i tak dalej.
Wejście : N = 2, M = 2 m[2][2] = { 8, 2, 6, 8 } Wyjście : 0.
Wejście : N = 3, M = 3 m[3][3] = { 1, 2, 3 4, 5, 6 7, 8, 9 } Wyjście : 1.
 */
public class Zadanie14 {
    static int minAbsoluteDifference(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int min = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {8, 2},
                {6, 8}
        };
        System.out.println("Minimalna różnica: " + minAbsoluteDifference(matrix1));
    }
}
