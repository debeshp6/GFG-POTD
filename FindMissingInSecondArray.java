//User function Template for Java

class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<m; i++) {
            s.add(b[i]);
        }
        for(int i=0; i<n; i++) {
            if(!s.contains(a[i])) ans.add(a[i]);
        }
      return ans;
    }
}
