# Number of Enclaves (LeetCode)

## 🔗 Problem Link

https://leetcode.com/problems/number-of-enclaves/

## 🟡 Difficulty

Medium

## 🧠 Approach

* Traverse all boundary cells.
* Push all boundary land cells (1s) into a queue.
* Perform BFS to mark all connected land as water (0).
* Count remaining land cells (1s), which are enclaves.

## 🚀 Key Insight

Any land connected to the boundary cannot be an enclave.

## ⏱ Time Complexity

O(n × m)

## 💾 Space Complexity

O(n × m) (queue in worst case)

## 🧩 Topics

* Graphs
* BFS
* Matrix Traversal
