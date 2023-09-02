package Working;
/*Znajdź element szczytowy w tablicy dwuwymiarowej Element jest elementem szczytowym,
 jeśli jest większy lub równy swoim czterem sąsiadom, lewym, prawym, górnym i dolnym.
  Na przykład sąsiedzi dla A[i][j] to A[i-1][j], A[i+1][j], A[i][j-1] i A[i][j+1 ].
   W przypadku elementów krańcowych są uważane za ujemną nieskończoną wartość.
 */
public class Zadanie13 {
    static int findPeakElement(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean isPeak = true;
                if (i > 0 && matrix[i][j] < matrix[i-1][j]) {
                    isPeak = false;
                }
                if (i < rows - 1 && matrix[i][j] < matrix[i+1][j]) {
                    isPeak = false;
                }
                if (j > 0 && matrix[i][j] < matrix[i][j-1]) {
                    isPeak = false;
                }
                if (j < cols - 1 && matrix[i][j] < matrix[i][j+1]) {
                    isPeak = false;
                }
                if (isPeak) {
                    return matrix[i][j];
                }

            }


        }
    return -1;
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        System.out.println("Element szczytowy: " + findPeakElement(matrix1));
    }
}
