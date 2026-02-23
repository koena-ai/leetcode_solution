class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        int count =0;
        boolean[] visited=  new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(isConnected,visited,i);
                count++;
            }
        }
        return count;

    }
    private void bfs(int[][]isConnected,boolean[] visited,int start){
        int n= isConnected.length;
        Queue<Integer> queue= new LinkedList<>();
        queue.add(start);
        visited[start]=true;
        while(!queue.isEmpty()){
            int city= queue.poll();
            for(int j=0;j<n;j++){
                if(isConnected[city][j]==1 && !visited[j]){
                    queue.add(j);
                    visited[j]=true;

                }
            }
        }

    }
}