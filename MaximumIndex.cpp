class Solution{
    public:
        
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    int maxIndexDiff(int a[], int n) 
    { 
                stack<int> st;
        for(int i = n - 1; i >= 0; i--)
        {
            if(st.empty() || a[st.top()] < a[i])
            {
                st.push(i);
            }
        }
        int ans = 0;
        int i = 0;
        while(i < n && !st.empty())
        {
            if(a[i] <= a[st.top()] && i <= st.top())
            {
                ans = max(ans, st.top() - i);
                st.pop();
            }
            else if(i > st.top())
            {
                st.pop();
            }
            else
            {
                i++;
            }
        }
        return ans;
    }
