

// User function Template for Java

class Solution {
    
public List<List<Integer>> CombinationSum2(int a[], int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(a); // Sort the input array to handle duplicates easily
        findCombinations(a, n, k, 0, new ArrayList<>(), result);
        return result;
    }
 
    private void findCombinations(int[] a, int n, int k, int startIndex, List<Integer> currentCombination, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
 
        for (int i = startIndex; i < n; i++) {
            if (i > startIndex && a[i] == a[i - 1]) {
                continue;
            }
 
            if (a[i] <= k) {
                currentCombination.add(a[i]);
                findCombinations(a, n, k - a[i], i + 1, currentCombination, result);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}
