class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i =0;i<n;i++){
            color[i] = -1;
        }
        for(int i =0;i<n;i++){
            if(color[i]==-1){
                if(check(i,color,n,graph)==false){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean check(int start,int [] color,int n , int[][] adj){
        Queue<Integer> q = new LinkedList<>();
       color[start] =0;
        q.add(start);
      

while(!q.isEmpty()){
  int node = q.poll();
     for(int it : adj[node]){
             if(color[it]==-1){
                color[it] = 1-color[node];
                q.add(it);
             }
             if(color[it] == color[node]){
                return false;
             }
        }
}
   return true;    
    }
}