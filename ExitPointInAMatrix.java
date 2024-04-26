// User function Template for Java

class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        int[] exitPoint = new int[2];
        int direction = 0; 
        int row = 0, col = 0;

        while (true) {
            if (matrix[row][col] == 1) {
                matrix[row][col] = 0;
                direction = (direction + 1) % 4;
            }
            if (direction == 0) col++;
            else if (direction == 1) row++;
            else if (direction == 2) col--;
            else row--;
            if (row < 0 || row >= n || col < 0 || col >= m) {
                exitPoint[0] = row < 0 ? 0 : (row >= n ? n - 1 : row);
                exitPoint[1] = col < 0 ? 0 : (col >= m ? m - 1 : col);
                break;
            }
        }
      return exitPoint;
    }
}
