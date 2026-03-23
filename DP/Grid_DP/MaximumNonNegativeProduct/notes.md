# Maximum Non-Negative Product in a Matrix

## 🔗 Problem Link

https://leetcode.com/problems/maximum-non-negative-product-in-a-matrix/

---

## 📊 Difficulty

**Medium**

---

## 🧠 Intuition

This is a **Grid Dynamic Programming (DP)** problem.

* We can only move **right** or **down**
* Each cell depends on results from previous cells

### ⚠️ Key Twist

Because of negative numbers:

* Negative × Negative → Positive
* Positive × Negative → Negative

👉 So we must track:

* **Maximum product**
* **Minimum product**

---

## 💡 Approach

We use two DP matrices:

* `max[i][j]` → maximum product to reach `(i, j)`
* `min[i][j]` → minimum product to reach `(i, j)`

---

## 🧱 Base Case

```
max[0][0] = grid[0][0]
min[0][0] = grid[0][0]
```

---

## ⚙️ Transition

From each cell `(i, j)`, we consider:

* Top → `(i-1, j)`
* Left → `(i, j-1)`

Let `val = grid[i][j]`

Compute:

```
a = max[i-1][j] * val  
b = min[i-1][j] * val  
c = max[i][j-1] * val  
d = min[i][j-1] * val  
```

Then:

```
max[i][j] = max(a, b, c, d)  
min[i][j] = min(a, b, c, d)
```

---

## 🚫 Edge Case

* If final result is **negative → return -1**
* Otherwise → return result **mod (1e9 + 7)**

---

## ⏱️ Complexity

* **Time Complexity:** O(m × n)
* **Space Complexity:** O(m × n)

---

## 🧠 Key Takeaway

> Whenever negative numbers are involved in DP,
> always track both **maximum and minimum** values.

---
