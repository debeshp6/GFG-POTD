/* The function should return the index of any
   peak element present in the array */

// arr: input array
// n: size of array
class Solution
{
    public:
    int peakElement(int arr[], int n)
    {
       // Your code here
        int i = 0; 
        while(i+1 < n && arr[i+1] >= arr[i]) i++;
        return i;
    }
};
