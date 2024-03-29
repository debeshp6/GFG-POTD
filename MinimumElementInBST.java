



/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        int n1,n2;
        if(root.left==null && root.right==null)
            return root.data;
        else if(root.left==null) {
            n1=root.data;
            n2=minValue(root.right);
        } else if(root.right==null) {
            n1=minValue(root.left);
            n2=root.data;
        } else {
            n1=minValue(root.left);
            n2=minValue(root.right);
        }
      return Math.min(n1,n2);
    }
}
