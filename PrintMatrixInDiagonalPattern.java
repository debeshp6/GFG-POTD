class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        int[] result = new int[n * n];
        int row = 0, col = 0;
        int index = 0;
        boolean goingUp = true;

        while (index < n * n) {
            result[index++] = mat[row][col];
            if (goingUp) {
                if (col == n - 1) {
                    row++;
                    goingUp = false;
                } else if (row == 0) {
                    col++;
                    goingUp = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == n - 1) {
                    col++;
                    goingUp = true;
                } else if (col == 0) {
                    row++;
                    goingUp = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}
