/*
🔹 Problem: Eventual Safe States
🔹 Topic: Graphs (DFS, Cycle Detection, Topological Sort)
🔹 Approach: DFS with state tracking

🔹 State:
0 = unvisited
1 = visiting (DFS path)
2 = safe

🔹 Time: O(V + E)
🔹 Space: O(V)

🔹 Key Idea:
A node is safe if ALL paths from it do NOT lead to a cycle.

🔹 Pattern:
Detect safe nodes using cycle detection / reverse topo
*/

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n];
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(dfs(i,graph,state)){
                result.add(i);
            }
        }
        return result;
    }
    private boolean dfs(int node,int[][] graph, int[] state){
        if(state[node] > 0 ){
            return state[node] == 2;
        }
        state[node] = 1;
        for(int neighbor : graph[node]){
            if(state[neighbor] == 1 || !dfs(neighbor,graph,state)){
                return false;
            }
        }
        state[node] = 2;
        return true;
    }
}
