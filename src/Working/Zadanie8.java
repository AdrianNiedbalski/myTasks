package Working;
/*Mając dwuwymiarową macierz binarną wypełnioną zerami i jedynkami, znajdź największy prostokąt zawierający wszystkie jedynki i zwróć jego powierzchnię.

Bonus, jeśli możesz rozwiązać to w O(n^2) lub mniej.

Przykład :

A : [ 1 1 1 0 1 1 1 0 0 ]

Wyjście : 4

Ponieważ prostokąt o maksymalnej powierzchni jest tworzony przez prostokąt 2x2 utworzony przez (0,1), (0,2), (1,1) i (1,2)
 */
public class Zadanie8 {
    public static int maximalRectangle(int [][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cel = matrix[0].length;
    return 0;
    }
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 1, 1, 0, 1, 1, 1, 0, 0}
        };

        int result = maximalRectangle(matrix);

        System.out.println("Najwiekszy prostokat " + result);
    }

}
