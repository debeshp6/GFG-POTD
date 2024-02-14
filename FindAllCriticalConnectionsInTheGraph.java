//User function Template for Java

class Solution
{
    public ArrayList<ArrayList<Integer>> criticalConnections(int v, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visited[] = new boolean[v];
		int parent = -1;
		int disc[] = new int[v];
		int low[] = new int[v];
		
		int timer = 0;
		Arrays.fill(disc, -1);
		Arrays.fill(low, -1);
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				dfs(i,parent,timer,disc,low,ans,visited,adj);
			}
		}
		
		//sort 
		for(ArrayList<Integer> a : ans){
		    Collections.sort(a);
		}
		Collections.sort(ans,new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> a,ArrayList<Integer> b) {
				if((a.get(0)-b.get(0))==0){
				    return a.get(1)-b.get(1);
				}
				return a.get(0)-b.get(0);
			}
		});
		
		return ans;
    }
    private static void dfs(int node, int parent, int timer, int[] disc, int[] low, ArrayList<ArrayList<Integer>> ans,
			boolean[] visited, ArrayList<ArrayList<Integer>> list) {
		
		visited[node] = true;
		disc[node] = timer;
		low[node] = timer;
		timer++;
		for(Integer val : list.get(node)) {
			if(val == parent) {
				continue;
			}
			if(!visited[val]) {
				dfs(val, node, timer, disc, low, ans, visited, list);
				low[node] = Math.min(low[node],low[val]);
				if(low[val]>disc[node]) {
					ArrayList<Integer> a = new ArrayList<>();

					a.add(node);
					a.add(val);
					ans.add(a);
				}
			} else {
				low[node] = Math.min(low[node], disc[val]);
			}
		}
  }
}
