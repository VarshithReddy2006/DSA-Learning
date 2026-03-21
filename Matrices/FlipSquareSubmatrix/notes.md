# Flip Square Submatrix Vertically - Notes

## 🔗 Problem Link

https://leetcode.com/problems/flip-square-submatrix-vertically/

## 🏷 Difficulty

Easy

🧠 Key Idea

We need to reverse the rows of a k x k submatrix vertically.
This means swapping the top row with the bottom row, moving inward.

🔁 Core Logic
Only rows change, columns remain the same
Perform swapping:
row x ↔ row x + k - 1
row x + 1 ↔ row x + k - 2
Continue until the middle
🧮 Formula Insight

For any row i inside submatrix:
new_row = x + (k - 1 - (i - x))

⚙️ Approach
Iterate from i = 0 to k/2
Compute:
row1 = x + i
row2 = x + k - 1 - i
Swap elements column-wise from y to y + k - 1
⏱ Complexity
Time: O(k²)
Space: O(1)
⚠️ Common Mistakes
Changing column index (not needed)
Looping incorrectly (using x instead of relative index)
Forgetting to swap both sides
Using extra array unnecessarily
🚀 Takeaway

This is a classic example of:

Matrix manipulation
Two-pointer technique on rows
In-place transformation