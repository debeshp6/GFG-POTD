//User function Template for Java
class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        boolean[] visited = new boolean[n];

    
    if(n == 1 && m>0){
        return false;
    }
    
    ArrayList<ArrayList<Integer>> ed = new ArrayList<>();
    
    for(int i=0;i<n;i++){
        ed.add(new ArrayList<>());
    }
    
    for(int i=0;i<edges.size();i++){
        ed.get(edges.get(i).get(0)).add(edges.get(i).get(1));
                ed.get(edges.get(i).get(1)).add(edges.get(i).get(0));

    }
    
        if (hasCycle(ed, 0, -1, visited)) {
             //System.out.println(Arrays.toString(visited));

            return false;
        }

        // Check for disconnected components
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
              //  System.out.println("Visite Node" + i + visited[i]);
                return false;
            }
        }

        return true;
    }

    private boolean hasCycle(ArrayList<ArrayList<Integer>> edges, int current, int parent, boolean[] visited) {
        visited[current] = true;

        for (int neighbor : edges.get(current)) {
            if (!visited[neighbor]) {
                if (hasCycle(edges, neighbor, current, visited)) {
                    return true;  // Cycle detected
                }
            }
            else if(neighbor == current){
                continue;
            }
            
            else if (neighbor != parent) {
                return true;  // Back edge detected
            }
        }

        return false;
    }
}
