

class Solution {
    static class triplet{
        
        int r,c,step;
        triplet(int r,int c,int step){
            this.r=r;
            this.c=c;
            this.step=step;
        }
        
    }
    
    public static int findShortestPath(int[][] mat) {
        
        int r=mat.length;
        int c=mat[0].length;
        
        int dx[]={0,0,1,-1};
        int dy[]={-1,1,0,0};
        
        boolean v[][]=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0 && v[i][j]==false){
                    for(int k=0;k<4;k++){
                        if(i+dx[k]>=0 && i+dx[k]<r && j+dy[k]>=0 && j+dy[k]<c){
                            mat[i+dx[k]][j+dy[k]]=0;
                            v[i+dx[k]][j+dy[k]]=true;
                        }
                    }
                }
            }
        }
        
        int res=Integer.MAX_VALUE;
        for(int i=0;i<r;i++){
            if(mat[i][0]==1){
                
                boolean visited[][]=new boolean[r][c];
                visited[i][0]=true;
                Queue<triplet> q=new ArrayDeque<>();
                q.add(new triplet(i,0,1));
                
                while(!q.isEmpty()){
                    triplet curr=q.poll();
                    int x=curr.r,y=curr.c,z=curr.step;
                    if(y==c-1){
                        res=Math.min(res,z);
                        break;
                    }
                    for(int k=0;k<4;k++){
                        if(x+dx[k]>=0 && x+dx[k]<r && y+dy[k]>=0 && y+dy[k]<c){
                            if(visited[x+dx[k]][y+dy[k]]==false && mat[x+dx[k]][y+dy[k]]==1){
                                q.add(new triplet(x+dx[k],y+dy[k],1+z));
                                visited[x+dx[k]][y+dy[k]]=true;
                            }
                        }
                    }
                }
            }
        }
        
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
        
    }
}
