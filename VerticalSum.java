class Solution{
    public ArrayList <Integer> verticalSum(Node r) {
        Map<Integer,Integer> h=new TreeMap<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(r,0));
        while(!q.isEmpty()) {
           pair k=q.poll();
            h.put(k.y,h.getOrDefault(k.y,0)+k.x.data);
            if(k.x.left!=null) {
                q.add(new pair(k.x.left,k.y-1));
            }
            if(k.x.right!=null) {
             q.add(new pair(k.x.right,k.y+1)) ;  
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(Map.Entry<Integer,Integer> k:h.entrySet()) {
             a.add(k.getValue());            
        }
      return a;
    }
    class pair {
        Node x;int y;
pair(Node x,int y) {
    this.x=x;
    this.y=y;
}
    }
}
