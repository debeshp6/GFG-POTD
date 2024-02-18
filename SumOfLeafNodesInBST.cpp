/* The structure of Node
struct Node{
    int data;
    Node *left,*right;
}; */


class Solution
{
    public:
        /*You are required to complete below method */
        int sumOfLeafNodes(Node *root ){
             /*Your code here */
             return (!root?0:(!root->left && !root->right)?root->data:(sumOfLeafNodes(root->left)+sumOfLeafNodes(root->right)));
    }
};
