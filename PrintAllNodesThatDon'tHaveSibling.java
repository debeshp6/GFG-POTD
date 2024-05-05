class Tree
{
    ArrayList<Integer> ans= new ArrayList<>();
    ArrayList<Integer> noSibling(Node node)
    {
        work(node);
          if(ans.isEmpty())
        ans.add(-1);       
        Collections.sort(ans);
        return ans;
    }
    void work(Node n) {
        if(n==null ||n.left==null &&n.right==null)
          return;
          if(n.left==null){
              if(!ans.contains(n.right.data))ans.add(n.right.data);
          }
        if(n.right== null){
            if(!ans.contains(n.left.data))ans.add(n.left.data);
        }
        work(n.right);  
        work(n.left);
    }
}
