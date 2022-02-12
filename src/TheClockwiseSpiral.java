import java.util.Arrays;

public class TheClockwiseSpiral {
    public static void main(String[] args) {
        int a = 6;

        System.out.println(Arrays.deepToString(createSpiral(a)));

    }

    public static int[][] createSpiral(int N) {
        // your code here
        int[][] ar = new int[N][N];

        int value = 1;
        int minCol = 0;
        int maxCol = N - 1;
        int minRow = 0;
        int maxRow = N - 1;

        while (value <= N * N) {
            for (int i = minCol; i <= maxCol; i++) {
                ar[minRow][i] = value;
                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                ar[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol - 1; i >= minCol; i--) {
                ar[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                ar[i][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        return ar;
    }
}
