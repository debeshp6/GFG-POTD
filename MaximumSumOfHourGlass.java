// User function Template for Java

class Solution {
    int max = Integer.MIN_VALUE;
    int findMaxSum(int n, int m, int mat[][]) {
        
        if(m<3 || n<3)
          return -1;
          
        for(int i = 0;i<n-2;i++) {
            for(int j = 0;j<m-2;j++) {
                
                visitHourglass(mat, i, j);
                
            }
        }
        return max;
        
    }
    
      private  void visitHourglass(int[][] matrix, int startRow, int startCol) {
        int sum = 0;
        // Top row of hourglass
        sum += matrix[startRow][startCol] + matrix[startRow][startCol + 1] + matrix[startRow][startCol + 2];
        // Middle row of hourglass
        sum += matrix[startRow + 1][startCol + 1];
        // Bottom row of hourglass
        sum += matrix[startRow + 2][startCol] + matrix[startRow + 2][startCol + 1] + matrix[startRow + 2][startCol + 2];
       
        max = Math.max(max, sum);
    }
};
