

//User function Template for Java

class Solution{
    private void swap(int array[],int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int left=0;
        int right=array.length-1;
        int i=0;
        while(i<=right){
            if(array[i]<a){
                swap(array,i,left);
                left++;
                i++;
            }
            else if(a<=array[i] && array[i]<=b) i++;
            else if(array[i]>b){
                swap(array,i,right);
                right--;
            }
        }
    }
}
