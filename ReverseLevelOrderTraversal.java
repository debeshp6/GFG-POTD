class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        q.add(node);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr!=null) {
                s.push(curr.data);
                if(curr.right!=null)
                q.add(curr.right);
                if(curr.left!=null)
                q.add(curr.left);
            } else {
                if(q.isEmpty())
                break;
                else {
                    q.add(null);
                }
            }
        }
        while(!s.isEmpty())
        {
            arr.add(s.pop());
        }
        return arr;
    }
}
