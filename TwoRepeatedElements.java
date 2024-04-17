//User function template for JAVA

class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        int[] ans= new int [2];
        int k=0;
        Map <Integer,Integer> nums= new HashMap<>();
        for(int i=0;i<n+2;i++) {
            if(!nums.containsKey(arr[i])) nums.put(arr[i],i);
            else
            {
                ans[k]=arr[i];
                k++;
            }
        } return ans;
    }
}
