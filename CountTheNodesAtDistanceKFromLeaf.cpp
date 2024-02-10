//Node Structure
/*struct NodeGiven a binary tree with n nodes and a non-negative integer k, the task is to count the number of special nodes. A node is considered special if there exists at least one leaf in its subtree such that the distance between the node and leaf is exactly k.
{
	int data;
	Node *left, *right;
};*/

class Solution
{
    public:
    //Function to return count of nodes at a given distance from leaf nodes.
    int printKDistantfromLeaf(Node* root, int k)
    {
    	//Add your code here.
    	queue<Node*>q,q2;
        map<Node*,Node*>mp;
        q.push(root);
        while(q.size()){
            Node *root=q.front();
            q.pop();
            if(root->left){
                mp[root->left]=root;
                q.push(root->left);
            }
            if(root->right){
                q.push(root->right);
                mp[root->right]=root;
            }
            if(!root->left and !root->right)q2.push(root);
        }
        int ans=0;
        map<Node*,bool>mp2;
        while(q2.size()){
            int p=k;
            Node *a=q2.front();
            q2.pop();
            while(p>0 and mp[a]!=NULL){
                p--;
                a=mp[a];
            }
            if(p==0){
                if(mp2[a]==0){
                    ans++;
                    
                }
                mp2[a]=1;
            }
        }
        return ans;
    }
};
