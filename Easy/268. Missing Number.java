/* 268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example :
Input: nums = [3,0,1]
Output: 2 */

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n *(n + 1)/2;
        int actualSum = 0;
        for(int i=0;i<n;i++){
            actualSum += nums[i];
        }
        return totalSum - actualSum;
    }
}
