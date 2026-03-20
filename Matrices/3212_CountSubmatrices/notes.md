# 3212. Count Submatrices With Equal X and Y

🔗 [Problem Link](https://leetcode.com/problems/count-submatrices-with-equal-frequency-of-x-and-y/)

**Difficulty:** Medium

## 🧠 Idea

Since the submatrix must include (0,0), we only consider prefix submatrices.

## 🧠 Pattern

2D Prefix Sum

## 🚀 Approach

* Convert X → +1, Y → -1, . → 0
* Use 2D prefix sum
* Maintain count of X separately

## ✅ Condition

* sum == 0 → equal X and Y
* xCount > 0 → at least one X

## ⏱️ Complexity

* Time: O(n * m)
* Space: O(n * m)

## 🔥 What I Learned

* Constraints can simplify problems drastically
* 2D prefix sum avoids brute force
* Always check if a problem can be reduced to prefix computation
