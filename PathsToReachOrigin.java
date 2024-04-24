//User function Template for Java

class Solution
{
    public static int ways(int n, int m)
    {
        int arr[][]= new int[n+1][m+1];
        int x, y;
        for (x=1;x<=m;x++) 
        arr[0][x]=1;
        for(y=1;y<=n;y++)
        arr[y][0]=1;
        arr[0][0]=0;
        for(y=1;y<=n;y++) {
            for(x=1;x<=m;x++)
            arr[y][x]=(arr[y-1][x]+arr[y][x-1])%1000000007;
        }
      return arr[n][m];
    }
}
