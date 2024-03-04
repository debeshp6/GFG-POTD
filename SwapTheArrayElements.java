//User function Template for Java

class Solution
{
    public void swap(int a[], int start, int end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
    
    public void swapElements(int[] arr, int n)
    {
        if(n>2){
        for(int i=0;i<n-2;i++){
            swap(arr,i,i+2);
            }
        } 
    }
}
