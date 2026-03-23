# 🧩 Grid Dynamic Programming (Grid DP)

Grid DP problems involve navigating through a 2D grid while optimizing a value such as minimum cost, maximum sum, or number of ways to reach a destination.

These problems are commonly asked in interviews and help build strong intuition for Dynamic Programming and state transitions.

---

## 🚀 Key Concepts

* **State Definition**

  * `dp[i][j]` represents the answer for cell `(i, j)`

* **Transitions**

  * Move directions:

    * Right → `(i, j+1)`
    * Down → `(i+1, j)`
    * Diagonal (optional in some problems)

* **Base Cases**

  * Starting cell initialization
  * First row / first column handling

* **Constraints Handling**

  * Obstacles (`grid[i][j] == 1`)
  * Negative values
  * Boundary checks

---

## 🧠 Common Patterns

### 1. Count Paths

* Count number of ways to reach destination
* Example problems:

  * Unique Paths
  * Unique Paths II (with obstacles)

---

### 2. Minimum Path Sum

* Find minimum cost path

Transition:
dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + grid[i][j]

---

### 3. Maximum Path Sum

* Similar to minimum path sum but maximize value

---

### 4. Path with Constraints

* Obstacles
* Restricted moves

---

### 5. Multi-State DP

* Track additional info (like min & max simultaneously)

---

## 🛠️ Approach

1. Understand movement constraints
2. Define DP state
3. Write transition
4. Handle base cases
5. Optimize space if possible

---

## ⚡ Time & Space Complexity

| Approach        | Time Complexity | Space Complexity |
| --------------- | --------------- | ---------------- |
| Recursion       | Exponential     | O(N + M)         |
| Memoization     | O(N × M)        | O(N × M)         |
| Tabulation      | O(N × M)        | O(N × M)         |
| Space Optimized | O(N × M)        | O(N)             |

---

## 📚 Problems Covered

* Unique Paths
* Unique Paths II
* Minimum Path Sum
* Maximum Path Sum
* Triangle DP
* Maximum Product Path

---

## 💡 Tips

* Always check boundaries first
* Initialize first row and column carefully
* Watch out for obstacles
* Try space optimization using 1D array

---

## 📌 Folder Structure

Dynamic_Programming/
└── Grid_DP/
├── Unique_Paths/
├── Unique_Paths_II/
├── Minimum_Path_Sum/
├── Maximum_Product_Path/
└── README.md

---

## 🎯 Why Grid DP is Important

* Builds strong DP intuition
* Frequently asked in coding interviews
* Helps in understanding state transitions clearly

---

## 🚀 Practice Strategy

* Start with simple path counting
* Move to weighted paths
* Then try constraints & variations
* Finally attempt optimization problems

---

Happy Coding! 💻🔥
