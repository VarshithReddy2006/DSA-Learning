package Graphs.BFS_DFS.SurroundedRegions;

import java.util.*;
class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        Queue<int[]> q = new LinkedList<>();
        int delRow[] = {-1,0,1,0};
        int delCol[] = {0,-1,0,1};
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                board[i][0] = '#';
                q.add(new int[]{i, 0});
            }
            if (board[i][n - 1] == 'O') {
                board[i][n - 1] = '#';
                q.add(new int[]{i, n - 1});
            }
        }

        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                board[0][j] = '#';
                q.add(new int[]{0, j});
            }
            if (board[m - 1][j] == 'O') {
                board[m - 1][j] = '#';
                q.add(new int[]{m - 1, j});
            }
        }
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            
            for(int i=0;i<4;i++){
                int nr = r + delRow[i];
                int nc = c + delCol[i];
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && board[nr][nc] == 'O'){
                    board[nr][nc] = '#';
                    q.add(new int[]{nr,nc});
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '#') board[i][j] = 'O';
            }
        }
    }
}
