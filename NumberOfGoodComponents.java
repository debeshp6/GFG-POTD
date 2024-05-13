


class Solution {
    public static void dfs(int node, ArrayList<Integer> adj[], int size, int cv[], boolean flag[], int vis[]) {
        vis[node] = 1;
        cv[0]++;
        
        if(size != adj[node].size())
            flag[0] = false;
            
        for(int v: adj[node])
            if(vis[v] == 0)
                dfs(v, adj, size, cv, flag, vis);
    }

    public static int findNumberOfGoodComponent(int e, int v, int [][]edges) {
        ArrayList<Integer> adj[] = new ArrayList[v + 1];
        for(int i = 1; i <= v; i++) 
            adj[i] = new ArrayList<>();
        
        for(int i = 0; i < e; i++) {
            int u = edges[i][0], w = edges[i][1];
            adj[u].add(w);
            adj[w].add(u);
        }
            
        int vis[] = new int[v + 1];
        int count = 0;
        
        for(int i = 1; i <= v; i++) {
            if(vis[i] == 0) {
                boolean flag[] = {true};
                int cv[] = {0};
                
                dfs(i, adj, adj[i].size(), cv, flag, vis);
                
                if(flag[0] == true && cv[0] == 1 + adj[i].size())
                    count++;
            }
        }
      return count;
    }
}
