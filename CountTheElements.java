//User function Template for Java

class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int count =0;
        for (int i=0;i<q; i++){
            for(int j=0; j<n; j++){
                if(a[query[i]]>=b[j]){
                    count++;
                }
            }
          query[i]=count;
          count =0;
        }
      return query;
    }
}
