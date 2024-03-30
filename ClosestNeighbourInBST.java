

// User function Template for Java

/*class Node
{
    int key;
    Node left, right;

    Node(int x)
    {
        key = x;
        left = right = null;
    }

}*/
class Solution {
    public static int findMaxForN(Node root, int n) {
        Node curr = root;
        int res = -1;
        while(curr != null){
            if(curr.key <= n){
                res = curr.key;
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }
        return res;
    }
}
