

/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Tree {
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        preorder(root,map,0);
        map.forEach((a,b)->{
            ans.add(b);
        });
        return ans;
    }
    public static void preorder(Node root,HashMap<Integer,Integer> map ,int diagonal){
        if(root == null){
            return ;
        }
        if(!map.containsKey(diagonal)){
            map.put(diagonal,root.data);
        }else{
            map.put(diagonal,map.get(diagonal)+root.data);
        }
        preorder(root.left,map,diagonal+1);
        preorder(root.right,map,diagonal);
    }
}
