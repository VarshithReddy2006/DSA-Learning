package Graphs.BFS_DFS.NumberofIslands;

import java.util.*;
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,-1,0,1};
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i,j});
                    grid[i][j] = '0';

                    while(!q.isEmpty()){
                        int[] curr = q.poll();
                        for(int d=0;d<4;d++){
                            int nrow = curr[0] + delrow[d];
                            int ncol = curr[1] + delcol[d];
                            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1'){
                                q.add(new int[]{nrow,ncol});
                                grid[nrow][ncol] = '0';
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
