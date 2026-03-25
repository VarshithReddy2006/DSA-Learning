package Graphs.BFS_DFS.NumberofEnclaves;

import java.util.*;
class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[] row =  {-1,0,1,0};
        int[] col = {0,-1,0,1};
        for(int i=0;i<n;i++){
            if(grid[i][0] == 1){
                q.add(new int[]{i,0});
                grid[i][0] = 0;
            }
            
            if(grid[i][m-1] == 1){
                q.add(new int[]{i,m-1});
                grid[i][m-1] = 0;
            }
        }
        for(int j=0;j<m;j++){
            if(grid[0][j] == 1){
                q.add(new int[]{0,j});
                grid[0][j] = 0;
            }
            if(grid[n-1][j] == 1){
               q.add(new int[]{n-1,j});
               grid[n-1][j] = 0;
            }
        }
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row1 = curr[0];
            int col1 = curr[1];
            for(int i=0;i<4;i++){ 
                int nrow = row1 + row[i];
                int ncol = col1 + col[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol < m && grid[nrow][ncol] == 1){
                    q.add(new int[]{nrow,ncol});
                    grid[nrow][ncol] = 0;
                }
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
