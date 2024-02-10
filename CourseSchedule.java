//User function Template for Java

class Solution
{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        // add your code here
        //create Graph 
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            map.get(prerequisites.get(i).get(0)).add(prerequisites.get(i).get(1));
        }
        
        int indeg[] = new int[n];
        for(int i=0;i<map.size();i++){
            for(Integer it : map.get(i)){
                indeg[it]++;
            }
        }
        
        //BFS start
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }
        int ans[] = new int[n];
        int count=0;
        int cycle = 0;
        while(!q.isEmpty() && cycle<n){
            cycle++;
            int val = q.poll();
            ans[count++] = val;
            for(Integer it : map.get(val)){
                indeg[it]--;
                if(indeg[it]==0){
                    q.add(it);
                }
            }
        }
      
        //checking graph contain cycle or not.
        if(cycle<n){//if cycle contain then {ordering not possible}
            int pos[] = {};
            return pos;
        }
        
        //return out according to the question.
        for(int i=0;i<n/2;i++){
            int temp = ans[i];
            ans[i] = ans[n-i-1];
            ans[n-i-1] = temp;
        }

        return ans;   
    }
}
