//User function Template for Java

class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
       ArrayList<Integer> result = new ArrayList<>();
        HashSet<String> seenRows = new HashSet<>();

        for (int i = 0; i < m; i++) {
            StringBuilder rowString = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowString.append(matrix[i][j]);
            }

            String rowHash = rowString.toString();

            if (seenRows.contains(rowHash)) {
                result.add(i);
            } else {
                seenRows.add(rowHash);
            }
        }
        return result;
    }
}
