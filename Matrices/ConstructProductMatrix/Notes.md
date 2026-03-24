# 🧩 Construct Product Matrix

## 🔗 Problem Link

https://leetcode.com/problems/construct-product-matrix/

## 📊 Difficulty

Medium

---

## 🧠 Problem Summary

Given a 2D grid, construct a matrix where each cell contains the product of all elements in the grid except itself, modulo `12345`.

---

## 🚫 Constraints Insight

* `n * m ≤ 10^5` → requires O(n*m) solution
* Modulo `12345` is not prime → cannot use division

---

## 💡 Approach: Prefix + Suffix Product

### Key Idea

* prefix[i] → product of all elements before i
* suffix[i] → product of all elements after i

result[i] = (prefix[i] * suffix[i]) % mod

---

## ⚙️ Steps

1. Flatten grid into 1D array
2. Compute prefix array
3. Compute suffix array
4. Multiply prefix and suffix
5. Convert back to 2D

---

## ⏱ Complexity

* Time: O(n * m)
* Space: O(n * m)

---

## ⚠️ Edge Cases

* Works with zeros
* Handles large values using modulo
* Uses long to avoid overflow

---

## 🧠 Key Learning

* Product Except Self pattern
* Prefix + Suffix technique
* Useful when division is not allowed
