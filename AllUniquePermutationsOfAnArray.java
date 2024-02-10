//User function Template for Java

class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        
        generatePermutations(arr, n, 0, set);
        
        for (ArrayList<Integer> perm : set) {
            result.add(perm);
        }
        
        Collections.sort(result, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                for (int i = 0; i < n; i++) {
                    if (a.get(i) != b.get(i)) {
                        return a.get(i) - b.get(i);
                    }
                }
                return 0;
    }
});
return result;
    }
    
    static void generatePermutations(ArrayList<Integer> arr, int n, int index, HashSet<ArrayList<Integer>> set) {
        if (index == n) {
            set.add(new ArrayList<>(arr));
            return;
        }
        
        for (int i = index; i < n; i++) {
            Collections.swap(arr, index, i);
            generatePermutations(arr, n, index + 1, set);
            Collections.swap(arr, index, i);
        }
    }
}
