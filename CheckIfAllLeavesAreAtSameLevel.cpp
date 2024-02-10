/* The structure of the binary tree is as follows
struct Node
{
    int data;
    Node* left;
    Node* right;
};
*/

class Solution{
  public:
    
    bool check(Node *root) {
        
    unordered_set<int> st;
    queue<pair<Node *,int>> q;
    if(root==NULL)return true;
    q.push({root,0});
    while(!q.empty()){
        Node *curr=q.front().first;
        int level=q.front().second;
        q.pop();
        if(curr->left==NULL&&curr->right==NULL){
            st.insert(level);
        }
        if(curr->left!=NULL)q.push({curr->left,level+1});
          if(curr->right!=NULL)q.push({curr->right,level+1});
        
    }

//if leaf node has same level then size of set will be one 
      return (st.size()==1) ;
    }
};
