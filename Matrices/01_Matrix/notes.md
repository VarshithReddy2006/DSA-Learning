# 01 Matrix

🔗 [Problem Link](https://leetcode.com/problems/01-matrix/)

**Difficulty:** Medium

## 🧠 Idea

Instead of finding the nearest 0 for every 1 separately, start BFS from all 0s simultaneously and expand outward.

## 🧠 Pattern

Multi-source BFS

## 🚀 Approach

* Push all cells with value 0 into queue
* Mark them as visited
* Perform BFS in 4 directions (up, down, left, right)
* For each neighbor, update distance as current steps + 1

## ⏱️ Complexity

* Time: O(n * m)
* Space: O(n * m)

## 🔥 What I Learned

* Multi-source BFS helps solve nearest distance problems efficiently
* Starting from destination (0s) is better than starting from sources (1s)
* BFS guarantees shortest path in unweighted grids
