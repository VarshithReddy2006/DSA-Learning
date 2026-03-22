// Platform: LeetCode
// Contest: Weekly Contest 494
// Problem: Q2 - Construct Uniform Parity Array II
// Link: https://leetcode.com/problems/construct-uniform-parity-array-ii/
// Difficulty: Medium
// Topics: Greedy, Math, Parity

class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean allEven = true;

        for (int num : nums1) {
            min = Math.min(min, num);
            if (num % 2 != 0) {
                allEven = false;
            }
        }

        if (min % 2 != 0) return true;

        return allEven;
    }
}
