

//User function Template for Java

/*The Node structure is defined as
struct Node {
    int data;
    Node *left;
    Node *right;

};
*/
class Solution
{
    
    int prev = Integer.MAX_VALUE, ans = Integer.MAX_VALUE;
    int absolute_diff(Node root)
    {
        inorder(root);
        return ans;
    }
    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        
        if(prev!=Integer.MAX_VALUE){
            ans=Math.min(ans,root.data-prev);
        }
        prev=root.data;
        inorder(root.right);
    }
}
