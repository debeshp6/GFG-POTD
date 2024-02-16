//User function Template for Java

class Solution {
    private void solve(Node root,List<Integer> flat)
    {
        if(root==null) return;
        solve(root.left,flat);
        flat.add(root.data);
        solve(root.right,flat);
    }
    public Node flattenBST(Node root) {
        // Code here
        List<Integer> flat=new ArrayList<>();
        solve(root,flat);
        Node flattenRoot=new Node(flat.get(0));
        Node cur=flattenRoot;
        for(int i=1;i<flat.size();i++)
        {
            Node newNode=new Node(flat.get(i));
            cur.right=newNode;
            cur=cur.right;
        }
        return flattenRoot;
    }
}
