# 🏝️ Number of Islands

## 🔗 Problem Link

https://leetcode.com/problems/number-of-islands/

---

## 📊 Difficulty

**Medium**

---

## 🧠 Problem Summary

Given a 2D grid of `'1'` (land) and `'0'` (water), count the number of islands.

An island is formed by connecting adjacent lands **horizontally or vertically**.

---

## 🔑 Key Idea

* Treat grid as a graph
* Each `'1'` = node
* Connected `'1'`s = one island

👉 Problem reduces to:

> **Count connected components in a grid**

---

## 🚀 Approach (BFS)

1. Traverse the grid
2. When you find `'1'`:

   * Increment island count
   * Start BFS
   * Mark all connected `'1'`s as visited (`'0'`)
3. Continue until grid is fully processed

---

## 🔄 Directions Used

```java
int[] delrow = {-1, 0, 1, 0};
int[] delcol = {0, -1, 0, 1};
```

---

## ⏱ Time Complexity

```
O(n * m)
```

* Each cell visited once

---

## 📦 Space Complexity

```
O(n * m)   (worst case queue)
```

---

## ⚡ Key Points

* Only **4-directional** movement allowed
* Mark visited immediately to avoid revisits
* BFS/DFS both work

---

## 🧠 Pattern Recognition

* Grid + connected components → BFS/DFS
* Similar problems:

  * Number of Enclaves
  * Rotting Oranges
  * Flood Fill

---

## 🏁 Takeaway

> Each BFS/DFS traversal = **one island**
