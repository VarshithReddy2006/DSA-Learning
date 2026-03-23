# Surrounded Regions

## 🔗 Problem Link

https://leetcode.com/problems/surrounded-regions/

---

## 📊 Difficulty

**Medium**

---

## 🧠 Intuition

We need to capture all regions of `'O'` that are completely surrounded by `'X'`.

### ⚠️ Key Observation

* If an `'O'` is connected to the **boundary**, it **cannot be captured**
* Only the `'O'` regions **fully enclosed inside** should be flipped

👉 So instead of finding surrounded regions directly,
we do the opposite:

> **Find and protect all boundary-connected 'O's**

---

## 💡 Approach

1. Traverse all **boundary cells**
2. If a boundary cell contains `'O'`, start a **BFS/DFS**
3. Mark all connected `'O'` cells as **safe** (e.g., `'#'`)
4. After traversal:

   * Convert remaining `'O'` → `'X'` (captured)
   * Convert `'#'` → `'O'` (restore safe cells)

---

## 🔄 Algorithm Steps

### 1. Traverse Boundaries

* First & last row
* First & last column

👉 Start BFS/DFS from every `'O'` found

---

### 2. Mark Safe Cells

* Replace `'O'` → `'#'` during traversal
* This ensures they are **not flipped later**

---

### 3. Final Conversion

* `'O'` → `'X'` (captured region)
* `'#'` → `'O'` (safe region)

---

## ⚙️ Why This Works

> Any `'O'` not connected to boundary must be surrounded.

So:

* Boundary-connected → safe
* Remaining → surrounded → flip

---

## ⏱️ Complexity

* **Time Complexity:** O(m × n)
* **Space Complexity:** O(m × n) (queue/recursion)

---

## 🧠 Key Takeaway

> When a problem involves **regions and boundaries**,
> think in reverse:
> **protect valid regions instead of directly capturing invalid ones**

---
