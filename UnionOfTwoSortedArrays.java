//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList <Integer> p = new ArrayList <>();
        HashSet <Integer> q = new HashSet <>();
        for(int i=0;i<n;i++){
            p.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            p.add(arr2[j]);
        }
        q.addAll(p);
        p.clear();
        p.addAll(q);
        Collections.sort(p);
        
        return p;
    }
}
