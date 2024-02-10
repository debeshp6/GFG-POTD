//User function Template for C++

class Solution{
    public:
        int vertexCover(int n, vector<pair<int, int>> &edges) {
                // code here
                int ans=18;
            for(int bit=0;bit<(1<<n);bit++){
                int m=edges.size();
                for(auto i:edges){
                    int x=i.first,y=i.second;
                    x--,y--;
                  if((bit&(1<<x))|(bit&(1<<y)))
                     m--;
                  else break;
                }
            if(m==0) ans=min(ans,__builtin_popcount(bit));
            }
        return ans;
            }
};
