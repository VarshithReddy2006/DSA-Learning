# 🟢 Eventual Safe States

## 🔗 Problem Link
https://leetcode.com/problems/find-eventual-safe-states/

## 📊 Difficulty
Medium

---

## 🧠 Problem Summary

You are given a directed graph where:

- `graph[i]` contains nodes reachable from node `i`
- A node is:
  - **Terminal** → no outgoing edges  
  - **Safe** → every path starting from it ends at a terminal node (or another safe node)

Return all safe nodes in **ascending order**.

---

## 🔑 Key Insight

A node is **unsafe** if:
- It is part of a **cycle**
- OR it can **reach a cycle**

A node is **safe** if:
- It **cannot reach any cycle**

👉 Reduced problem:
**Find all nodes that do NOT lead to a cycle**

---

## 🛠️ Approaches

### ✅ 1. DFS + Cycle Detection

### Idea:
- Traverse the graph using DFS  
- Detect cycles using state tracking  

### State Definition:
- `0` → unvisited  
- `1` → visiting (current DFS path)  
- `2` → safe  
- `3` → unsafe (optional but clearer)  

### Logic:
- If a node is revisited while in `visiting` → cycle detected  
- If any neighbor is unsafe → current node is unsafe  
- Otherwise → node is safe  

### Complexity:
- Time: `O(V + E)`  
- Space: `O(V)`  

---

### ✅ 2. BFS (Kahn’s Algorithm / Topological Sort)

### Idea:
- Reverse the graph  
- Track **outdegree** of each node  
- Start from terminal nodes (outdegree = 0)  

### Steps:
1. Build reverse graph  
2. Compute outdegree for each node  
3. Add all nodes with outdegree = 0 to queue  
4. Process nodes:
   - Reduce outdegree of parent nodes  
   - If outdegree becomes 0 → add to queue  

### Insight:
- Nodes processed in this way are **safe nodes**

### Complexity:
- Time: `O(V + E)`  
- Space: `O(V + E)`  

---

## ⚖️ DFS vs BFS

| Approach | Pros | Cons |
|----------|------|------|
| DFS | Direct cycle detection, intuitive | Uses recursion |
| BFS (Kahn) | Iterative, no recursion | Requires reverse graph |

---

## ⚠️ Important Notes

- Works only for **directed graphs**  
- In **undirected graphs**, parent edges can be mistaken as cycles  
- **Self-loop = cycle** → node is unsafe  
- Terminal nodes are always safe  

---

## 🧪 Example (Visual Understanding)

### Graph Representation

Adjacency list:

graph = [
  [1, 2],   // 0 → 1, 2  
  [2, 3],   // 1 → 2, 3  
  [5],      // 2 → 5  
  [0],      // 3 → 0 (cycle)  
  [5],      // 4 → 5  
  [],       // 5 → terminal  
  []        // 6 → terminal  
]

---

### Explanation

- Cycle present:  
  0 → 1 → 3 → 0 → ❌ cycle  

- Nodes involved in or leading to cycle:  
  0, 1, 3 → unsafe  

- Nodes leading to terminal:  
  2 → 5 → terminal → ✅ safe  
  4 → 5 → terminal → ✅ safe  
  5, 6 → terminal → ✅ safe  

---

### Output

[2, 4, 5, 6]

---

### Intuition

- If a node has **even one path** going into a cycle → ❌ unsafe  
- Only nodes that are **guaranteed to end at terminal nodes** → ✅ safe  

👉 Think:  
"Can I ever get stuck in a loop from here?"  
- Yes → unsafe  
- No → safe  

---

## 🏁 Summary

- Safe nodes = nodes that **don’t lead to cycles**  
- Core concept: **Cycle detection in directed graph**  
- Two approaches:
  - DFS (state tracking)  
  - BFS (topological sort)  

---
