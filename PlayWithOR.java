//User function Template for Java

class Solution{
    
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        int future = arr[n-1];
        for(int i = n-2;i>=0;i--){
            int x = arr[i];
            arr[i]= arr[i]|future;
            future = x;
        }
    return arr;
    }
}

