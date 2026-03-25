# Flip String to Monotone Increasing

## 🔗 Problem Link

https://leetcode.com/problems/flip-string-to-monotone-increasing/

## 🟡 Difficulty

Medium

## 🏷 Tags

Greedy, Dynamic Programming, Prefix, Strings

---

## 🧠 Problem Summary

Given a binary string `s`, return the minimum number of flips required to make the string monotone increasing.

A string is monotone increasing if it is of the form:
000...0111...1

---

## 💡 Key Insight

At each position, we decide:

* Flip current '0' → '1'
* OR flip all previous '1' → '0'

We choose the minimum cost.

---

## ⚡ Approach (Greedy + DP)

Maintain:

* ones → number of '1's seen so far
* flips → minimum flips required till current index

---

## 🔄 Transition

If character is '1':
ones++

If character is '0':
flips = min(flips + 1, ones)

---

## 🧩 Explanation

* flips + 1 → flip current '0'
* ones → flip all previous '1's

Take minimum.

---

## ⏱ Complexity

* Time: O(n)
* Space: O(1)

---

## 🧪 Example

Input:
s = "00110"

Output:
1

Explanation:
Flip last '0' → "00111"

---

## 🔥 Key Takeaways

* Convert global constraint into local decisions
* Track prefix information efficiently
* Classic Greedy + DP hybrid pattern

---

## 🧠 Interview Tip

When you see:

* Binary string
* Minimum flips / operations
* Pattern constraint (like monotonic)

👉 Think in terms of:

* Prefix counts
* DP states
* Greedy transitions

---
