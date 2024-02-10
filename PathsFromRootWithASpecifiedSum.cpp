//User function Template for C++

/*// A Tree node
struct Node
{
	int key;
	struct Node *left, *right;
};*/

class Solution
{
    public:
    void help(Node *root,int s,int sum,vector<int>temp,vector<vector<int>>&ans){
        if(!root)
        return;
        s+=root->key;
        temp.push_back(root->key);
        if(s==sum)
        ans.push_back(temp);
        help(root->left,s,sum,temp,ans);
        help(root->right,s,sum,temp,ans);
    }
    vector<vector<int>> printPaths(Node *root, int sum)
    {
        //code here
        vector<vector<int>>ans;
        vector<int>temp;
        help(root,0,sum,temp,ans);
        return ans;   
    }
};
