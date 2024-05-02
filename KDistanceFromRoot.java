

//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
           ArrayList<Integer> ans = new ArrayList<>();
        if(root==null)
        return new ArrayList<>();
        if(k==0) {
            ans.add(root.data);
            return ans;
        }
     
        Queue<Node> q = new LinkedList<>();
        int count = 0;
        q.offer(root);
        while(!q.isEmpty()) {
            int sz = q.size();
          if(count == k) {
            while(sz-->0) {
                ans.add(q.poll().data);
            }
            break;
          }
          else {
            while(sz-->0) {
              Node node = q.poll();
            if(node.left!=null) q.offer(node.left);
            if(node.right!=null) q.offer(node.right);
            }
            
         }
      count++;
    }
   return ans;
  }
}
