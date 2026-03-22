# 🔁 Find Rotation (LeetCode)

## 🔗 Problem Link
https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

## 📊 Difficulty
Easy

---

## 🧠 Problem Summary
Given two `n x n` binary matrices `mat` and `target`, determine whether `mat` can be rotated (in 90° increments) to match `target`.

Allowed rotations:
- 0°
- 90°
- 180°
- 270°

---

## 💡 Approach 1: Rotation (In-place)

### Steps:
1. Check if `mat == target`
2. Rotate `mat` by 90°:
   - Transpose matrix
   - Reverse each row
3. Repeat up to 4 times

### Complexity:
- Time: `O(n²)`
- Space: `O(1)`

---

## 🚀 Approach 2: Index Mapping (Optimal)

Instead of rotating, directly compare positions.

### Mappings:

| Rotation | Mapping |
|--------|--------|
| 0° | `mat[i][j] == target[i][j]` |
| 90° | `mat[i][j] == target[j][n-1-i]` |
| 180° | `mat[i][j] == target[n-1-i][n-1-j]` |
| 270° | `mat[i][j] == target[n-1-j][i]` |

---

## ⚡ Key Insight

- Rotation is just rearranging indices
- Avoid modifying matrix → cleaner + safer

---

## ✅ Final Takeaway

- Brute-force rotation works fine
- Mapping approach is preferred in interviews