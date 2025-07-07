/* 1752. Check if Array Is Sorted and Rotated
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). 
Otherwise, return false.There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i. */

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0;i < n;i++){
            int next = nums[(i + 1) % n]; // wrap around circularly
            if (nums[i] > next) {
                cnt++;
            }
        }
        return cnt <= 1;
    }
} 
