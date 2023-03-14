public class SpiralArray {
    public static int[][] generateSpiralArray(int n, int h, int w) {
        int[][] result = new int[h][w];
        int num = 1; // начальное значение
        int minRow = 0, maxRow = h - 1, minCol = 0, maxCol = w - 1;

        while (num <= n) {
            for (int i = minCol; i <= maxCol; i++) {
                result[minRow][i] = num++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                result[i][maxCol] = num++;
            }
            maxCol--;

            if (minRow <= maxRow) {
                for (int i = maxCol; i >= minCol; i--) {
                    result[maxRow][i] = num++;
                }
                maxRow--;
            }

            if (minCol <= maxCol) {
                for (int i = maxRow; i >= minRow; i--) {
                    result[i][minCol] = num++;
                }
                minCol++;
            }
        }

        return result;
    }

}
