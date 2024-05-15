


class Solution {
    int ans;
    public int minimumEdgeRemove(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=n;i++)    list.add(new ArrayList<>());
        
        for(int e[]:edges){
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }
        
        ans=0;
        no_of_nodes(1,list,new boolean[n+1]);
        
        return ans;
    }
    
    int no_of_nodes(int i,List<List<Integer>> list,boolean vis[]){
        
        vis[i] = true;
        int non=1;
        
        for(Integer nbr:list.get(i)){
            
            if(!vis[nbr]){
                non+=no_of_nodes(nbr,list,vis);
            }
        }
        
        if(non%2==0){
            if(i>1) ans++;
            non=0;
        }
        
        return non;
    }
}
