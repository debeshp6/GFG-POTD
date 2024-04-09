class Solution{
    static int findSingle(int n, int arr[]){
        int p = 0;
       for(int i = 0;i<n;i++){
           p=p^arr[i];
       }
       return p;
    }
}
