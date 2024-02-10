// User function Template for C++

class Solution{
public:
    vector<int> recamanSequence(int n){
        // code here
        vector<int>ans(n,0);

        set<int>st;

        st.insert(0);

        for(int i=1;i<n;i++){

            if(ans[i-1]-i>0 && st.find(ans[i-1]-i)==st.end())

            ans[i]= ans[i-1]-i;

            else ans[i]=ans[i-1]+i;

            st.insert(ans[i]);
        }
        return ans;
    }
};
