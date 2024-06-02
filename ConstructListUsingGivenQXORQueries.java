class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0); // Initial list containing just one element: 0
        int cumulativeXOR = 0; // To keep track of the cumulative XOR
        
        for (int i = 0; i < q; i++) {
            if (queries[i][0] == 0) {
                // Add the element to the list, adjusted by the cumulative XOR
                ans.add(queries[i][1] ^ cumulativeXOR);
            } else if (queries[i][0] == 1) {
                // Update the cumulative XOR
                cumulativeXOR ^= queries[i][1];
            }
        }
        
        // Apply the cumulative XOR to all elements before sorting
        for (int i = 0; i < ans.size(); i++) {
            ans.set(i, ans.get(i) ^ cumulativeXOR);
        }
        
        // Sort the list before returning
        Collections.sort(ans);
        return ans;
    }
}
